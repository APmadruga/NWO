package org.academiadecodigo.gitbusters.charlie.mapobjects;
import org.academiadecodigo.gitbusters.charlie.EndLevel1;
import org.academiadecodigo.gitbusters.charlie.Game;
import org.academiadecodigo.gitbusters.charlie.GameOver;
import org.academiadecodigo.gitbusters.charlie.Main;
import org.academiadecodigo.gitbusters.charlie.maps.Map;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;
import org.academiadecodigo.gitbusters.charlie.utils.audio.CoinSound;
import org.academiadecodigo.gitbusters.charlie.utils.audio.DoorSound;
import org.academiadecodigo.gitbusters.charlie.utils.audio.KeySound;
import org.academiadecodigo.gitbusters.charlie.utils.audio.TerminalSound;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Player extends Active {
    public Game game;
    private int score = 0;
    private int stepCounter = 0;
    private boolean invisible = false;
    private boolean ghostmove = false;

    public Player(Position pos, Direction startingDirection, Game game, Grid grid) {
        seeTrough = false;
        walkTrough = false;
        objectPos = pos;
        speed = 1;
        objectPos.setColor(GridColor.GREEN);
        currentDirection = startingDirection;
        objectPos.PlayerMovement(0);
        this.game = game;
        setGrid(grid);
    }

    @Override
    public Direction changeDirection() {
        return Direction.STILL;
    }

    public void changeDirection(KeyboardEvent var1) throws InterruptedException {
        stepCounter++;




        Direction newDirection = currentDirection;
        switch (var1.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                objectPos.picDelete();
                objectPos.PlayerMovement(1);
                newDirection = Direction.RIGHT;
                break;
            case KeyboardEvent.KEY_LEFT:
                objectPos.picDelete();
                objectPos.PlayerMovement(2);
                newDirection = Direction.LEFT;
                break;
            case KeyboardEvent.KEY_UP:
                objectPos.picDelete();
                objectPos.PlayerMovement(3);
                newDirection = Direction.UP;
                break;
            case KeyboardEvent.KEY_DOWN:
                objectPos.picDelete();
                objectPos.PlayerMovement(4);
                newDirection = Direction.DOWN;
                break;
            case KeyboardEvent.KEY_SPACE:
                newDirection = Direction.STILL;
                break;
        }
        currentDirection = newDirection;

    }

    public void triggerInvisibility(){
        invisible = !invisible;
        System.out.println("Invisibility triggered to " + invisible);
    }

    public void triggerGhostmove(){
        ghostmove = !ghostmove;
        System.out.println("Ghostmove triggered to " + ghostmove);
    }

    public void handleCollision(Active c2) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if(c2 instanceof Enemy && !invisible){
            System.out.println("GAME OVER");
            //Send for GAME OVER
            game.gameOver = true;
        }
        if(c2 instanceof Objective){
            System.out.println("REACHED OBJECTIVE!");
            TerminalSound terminalSound = new TerminalSound();
            terminalSound.playMusic();
            score += 2500;
            //Send for SUCCESS
            game.gameWon = true;
        }
        if(c2 instanceof Key && !((Key) c2).isGot()){
            System.out.println("GOT " + ((Key) c2).getColorCombo() + " KEY!");
            KeySound keySound = new KeySound();
            keySound.playMusic();
            DoorSound doorSound = new DoorSound();
            doorSound.playMusic();
            ((Key) c2).get();
            game.keyGet(((Key) c2).getColorCombo());
        }
        if(c2 instanceof Gold && !((Gold) c2).isGot()){
            ((Gold) c2).get();
            CoinSound coinSound = new CoinSound();
            coinSound.playMusic();
            score += ((Gold) c2).getScore();
            System.out.println("GOT GOLD! Current Score: " + score);
        }
    }

    public boolean checkForEnemies(Active[] actives){
        Active[] activelist = actives;
        if(invisible) {
            return false;
        }
        for(Active active : activelist){

            if(active instanceof Enemy){
                if(active.getPos().getRow() == getPos().getRow() && active.getPos().getCol() > getPos().getCol()){
                    return checkForEnemiesRight((Enemy) active);
                }
                if(active.getPos().getRow() == getPos().getRow() && active.getPos().getCol() < getPos().getCol()){
                    return checkForEnemiesLeft((Enemy) active);
                }
                if(active.getPos().getCol() == getPos().getCol() && active.getPos().getRow() > getPos().getRow()){
                    return checkForEnemiesDown((Enemy) active);
                }
                if(active.getPos().getCol() == getPos().getCol() && active.getPos().getRow() < getPos().getRow()){
                    return checkForEnemiesUp((Enemy) active);
                }
            }
        }

        return false;
    }


    public boolean checkForEnemiesUp(Enemy enemy){

        MapObject mapObject = Map.getMap()[getPos().getRow()][getPos().getCol()];

        int distanceInRowsUP = getPos().getRow() - enemy.getPos().getRow();

        int i = 0;

        if(enemy.getCurrentDirection() == Direction.UP){
            return false;
        }

        while (mapObject.getPos().getRow() > enemy.getPos().getRow()){

            if(mapObject.seeTrough) {
                i++;
                mapObject = Map.getMap()[getPos().getRow() - i][getPos().getCol()];
            }else {
                return false;
            }
        }
        if(i == distanceInRowsUP){
            System.out.println("Enemy UP sees you!");
            return true;
        }
        return false;

    }

    public boolean checkForEnemiesDown(Enemy enemy){

        MapObject mapObject = Map.getMap()[getPos().getRow()][getPos().getCol()];

        int distanceInRowsDOWN = - getPos().getRow() + enemy.getPos().getRow();

        int i = 0;

        if(enemy.getCurrentDirection() == Direction.DOWN){
            return false;
        }

        while (mapObject.getPos().getRow() < enemy.getPos().getRow()){
            if(mapObject.seeTrough){
                i++;
                mapObject = Map.getMap()[getPos().getRow()+i][getPos().getCol()];
            }else{
                return false;
            }
        }
        if(i == distanceInRowsDOWN){
            System.out.println("Enemy DOWN sees you!");
            return true;
        }
        return false;

    }

    public boolean checkForEnemiesRight(Enemy enemy){


        MapObject mapObject = Map.getMap()[getPos().getRow()][getPos().getCol()];

        int distanceInColumnsRIGHT = - getPos().getCol() + enemy.getPos().getCol();

        int i = 0;

        if(enemy.getCurrentDirection() == Direction.RIGHT){
            return false;
        }

        while (mapObject.getPos().getCol() < enemy.getPos().getCol()){
            if(mapObject.seeTrough){
                i++;
                mapObject = Map.getMap()[getPos().getRow()][getPos().getCol()+i];
            }else{
                return false;
            }
        }

        if(i == distanceInColumnsRIGHT){
            System.out.println("Enemy RIGHT sees you!");
            return true;
        }
        return false;
    }

    public boolean checkForEnemiesLeft(Enemy enemy){

        MapObject mapObject = Map.getMap()[getPos().getRow()][getPos().getCol()];

        int distanceInColumnsLEFT = getPos().getCol() - enemy.getPos().getCol();

        int i = 0;

        if(enemy.getCurrentDirection() == Direction.LEFT){
            return false;
        }

        while (mapObject.getPos().getCol() > enemy.getPos().getCol()){
            if(mapObject.seeTrough){
                i++;
                mapObject = Map.getMap()[getPos().getRow()][getPos().getCol()-i];
            }else{
                return false;
            }
        }

        if(i == distanceInColumnsLEFT){
            System.out.println("Enemy LEFT sees you!");
            return true;
        }
        return false;
    }

    public int getScore() {
        return score;
    }

    public int getStepCounter() {
        return stepCounter;
    }
}
