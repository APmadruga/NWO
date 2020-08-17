package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.maps.Map;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public abstract class Active extends MapObject{
    protected int speed;
    protected Direction currentDirection;
    protected int directionChangeLevel;
    protected boolean ghostmove = false;



    public boolean isHittingWall(Direction potentialDirection) {
        if(ghostmove){
            return false;
        }

        switch (potentialDirection) {
            case LEFT:
                if (getPos().getCol() <= 0 || !Map.getMap()[getPos().getRow()][getPos().getCol()-1].isWalkTrough()) {
                    return true;
                }
                break;
            case RIGHT:
                if (getPos().getCol() >= grid.getCols() - 1 || !Map.getMap()[getPos().getRow()][getPos().getCol()+1].isWalkTrough()) {
                    return true;
                }
                break;
            case UP:
                if (getPos().getRow() <= 0 || !Map.getMap()[getPos().getRow()-1][getPos().getCol()].isWalkTrough()) {
                    return true;
                }
                break;
            case DOWN:
                if (getPos().getRow() >= grid.getRows() - 1 || !Map.getMap()[getPos().getRow()+1][getPos().getCol()].isWalkTrough()) {
                    return true;
                }
        }

        return false;

    }

    public void move() {
        accelerate(chooseDirection(), speed);
    }

    /**
     * Accelerates the car towards a specific direction,
     * in which case we bounce back
     * as long as we have not bumped against the wall,
     *
     * @param direction the direction to which accelerate
     * @param speed     the speed to accelerate at
    public void accelerate(GridDirection direction, int speed) {
     */
    public void accelerate(Direction direction, int speed) {
        // Crashed cars can not accelerate
        Direction newDirection = direction;
        // Accelerate in the chosen direction
        this.currentDirection = newDirection;
        for (int i = 0; i < speed; i++) {
            getPos().moveInDirection(currentDirection, 1);
        }
    }

    public Direction chooseDirection() {
        // Sometimes, we want to change direction...
        if(isHittingWall(currentDirection)){
            currentDirection = changeDirection();
        }

        return currentDirection;

    }

    public Direction changeDirection(){

        return currentDirection;
    };

    public void handleCollision(Active c2) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
}
