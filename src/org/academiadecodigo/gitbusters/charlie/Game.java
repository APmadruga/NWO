package org.academiadecodigo.gitbusters.charlie;
import org.academiadecodigo.gitbusters.charlie.gfx.SimpleGfxGrid;
import org.academiadecodigo.gitbusters.charlie.mapobjects.*;
import org.academiadecodigo.gitbusters.charlie.maps.Map;
import org.academiadecodigo.gitbusters.charlie.maps.MapArray;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.KeyDoorColor;
import org.academiadecodigo.gitbusters.charlie.utils.audio.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;


public class Game implements KeyboardHandler{
    private SimpleGfxGrid grid;
    private Active[] actives;
    public Player player;
    public Map gameMap;
    private int delay;
    private int totalObjectSize = 58;
    public static boolean REALTIME = false;
    public boolean mainMenu = true;
    public boolean gameOver = false;
    public boolean gameWon = false;

    public boolean keyYellowGotActive = false;
    public boolean keyRedGotActive = false;
    public boolean keyGreenGotActive = false;
    public boolean keyBlueGotActive = false;
    public boolean keyPurpleGotActive = false;
    private Picture level;
    private GameMusic gameMusic = new GameMusic();
    private EnemySound es = new EnemySound();
    private EnemySound1 es1 = new EnemySound1();
    private EnemySound2 es2 = new EnemySound2();
    private EnemySound3 es3 = new EnemySound3();




    Game(char[][] charMap, int delay) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        grid = new SimpleGfxGrid(charMap[0].length, charMap.length);
        this.delay = delay;
        gameMap = new Map(grid, charMap, null);

    }

    public void init() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        level = new Picture(10, 10, "resources\\Images\\Maps\\lvl1.1.2.png");;
        level.draw();
        grid.init();
        player = new Player(grid.makeGridPosition(1, 27), Direction.RIGHT, this, grid);
        actives = MapArray.map1Actives(grid, player);
        gameMusic.playMusic();

    }

    public void setupKeys(){
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightArrow = new KeyboardEvent();
        rightArrow.setKey(KeyboardEvent.KEY_RIGHT);
        rightArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftArrow = new KeyboardEvent();
        leftArrow.setKey(KeyboardEvent.KEY_LEFT);
        leftArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent upArrow = new KeyboardEvent();
        upArrow.setKey(KeyboardEvent.KEY_UP);
        upArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent downArrow = new KeyboardEvent();
        downArrow.setKey(KeyboardEvent.KEY_DOWN);
        downArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent spacebar = new KeyboardEvent();
        spacebar.setKey(KeyboardEvent.KEY_SPACE);
        spacebar.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent zKey = new KeyboardEvent();
        zKey.setKey(KeyboardEvent.KEY_Z);
        zKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent xKey = new KeyboardEvent();
        xKey.setKey(KeyboardEvent.KEY_X);
        xKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightArrow);
        keyboard.addEventListener(leftArrow);
        keyboard.addEventListener(upArrow);
        keyboard.addEventListener(downArrow);
        keyboard.addEventListener(spacebar);
        keyboard.addEventListener(zKey);
        keyboard.addEventListener(xKey);

    }


    public void start() throws InterruptedException {
        int k = 0;
        setupKeys();
        while (!gameWon && !gameOver) {
            if(gameWon || gameOver){
                break;
            }
            //System.out.println(k%100000);
            if(k % 1000000000 == 0){
                System.out.println("Botalume");
            }
            k++;
            continue;
        }
        System.out.println("Final Score: " + player.getScore() + " Steps Taken: " + player.getStepCounter());
        gameMusic.stopMusic();
        for(int i = 0; i < actives.length; i++){
            actives[i] = null;
        }
        gameMap = null;
        grid = null;
        level.delete();
    }

    public void moveAllActives(boolean playerToo) {
        if(gameWon || gameOver){
            return;
        }
        for (Active c : actives) {
            if(!playerToo && c instanceof Player){
                continue;
            }
            c.move();
        }

    }

    public void detectCollisions(){
        if(gameWon || gameOver){
            return;
        }
        for(Active c : actives) {
            for(Active c2 : actives){
                if(c != c2 && c.getPos().getCol() == c2.getPos().getCol() && c.getPos().getRow() == c2.getPos().getRow()){
                    //System.out.println("Collision between " + c.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());
                    try{
                        c.handleCollision(c2);
                    } catch (InterruptedException e) {
                        System.out.println("There was big exception");
                    } catch (LineUnavailableException e) {
                        System.out.println("There was big exception");
                    } catch (IOException e) {
                        System.out.println("There was big exception");
                    } catch (UnsupportedAudioFileException e) {
                        System.out.println("There was big exception");
                    }
                }
            }
        }
    }

    public void keyGet(KeyDoorColor keyDoorColor){
        switch (keyDoorColor){
            case YELLOW -> keyYellowGotActive = true;
            case RED -> keyRedGotActive = true;
            case GREEN -> keyGreenGotActive = true;
            case BLUE -> keyBlueGotActive = true;
            case PURPLE -> keyPurpleGotActive = true;
        }
        for(int i = 0; i < gameMap.getMap().length; i++){
            for(int j = 0; j < gameMap.getMap()[i].length; j++){
                if(gameMap.getMap()[i][j] instanceof Door){
                    if(((Door) gameMap.getMap()[i][j]).getColorCombo() == keyDoorColor){
                        ((Door) gameMap.getMap()[i][j]).open();
                    }
                }
            }
        }
        for(Active doorMaybe : actives){
            if(doorMaybe instanceof Door){
                if(((Door) doorMaybe).getColorCombo() == keyDoorColor){
                    ((Door) doorMaybe).open();
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(gameOver || gameWon){
            return;
        }
        try {
            player.changeDirection(keyboardEvent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_Z){
            player.triggerInvisibility();
        } else  if(keyboardEvent.getKey() == KeyboardEvent.KEY_X) {
            player.triggerGhostmove();
        } else {
                if(!REALTIME){
                    moveAllActives(true);
                    detectCollisions();
                    if(player.checkForEnemies(actives)){
                        int random = (int)(Math.random()*4);
                        switch (random) {
                            case 0 -> es.playMusic();
                            case 1 -> es1.playMusic();
                            case 2 -> es2.playMusic();
                            case 3 -> es3.playMusic();
                        }



                        //Enemy Sound (Throws exception for whatever reason)

                        System.out.println("YOU HAVE BEEN DETECTED! GAME OVER!");
                        //Send for GAME OVER
                        gameOver = true;

                    };
                }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public Active[] getActives() {
        return actives;
    }
}