package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;

public class EnemyRandom extends Enemy{

    public EnemyRandom(Position pos, Direction startingDirection, Grid grid) {
        super(pos, startingDirection, grid);
    }

    public Direction chooseDirection() {
        // Sometimes, we want to change direction...
        if (Math.random() > ((double) directionChangeLevel) / 10) {
            currentDirection = changeDirection();
        }

        return currentDirection;

    }

    public void setDirectionChangeLevel(int directionChangeLevel) {
        this.directionChangeLevel = directionChangeLevel;
    }

    @Override
    public Direction changeDirection(){
        Direction newDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];
        while(isHittingWall(newDirection)){
            newDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];
        }
        return newDirection;
    };


}
