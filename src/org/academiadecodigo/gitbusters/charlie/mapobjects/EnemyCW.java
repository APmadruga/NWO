package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;

public class EnemyCW extends Enemy{

    public EnemyCW(Position pos, Direction startingDirection, Grid grid) {
        super(pos, startingDirection, grid);
        objectPos.EnemyCW(0);

        objectPos.picDelete();
        switch(currentDirection){
            case RIGHT:
                objectPos.EnemyCW(1);
                break;
            case LEFT:
                objectPos.EnemyCW(2);
                break;
            case UP:
                objectPos.EnemyCW(3);
                break;
            case DOWN:
                objectPos.EnemyCW(4);
                break;
        }
    }

    @Override
    public Direction changeDirection() {
        Direction newDirection = currentDirection.clockwiseDirection();
        while(isHittingWall(newDirection)){
            newDirection = newDirection.clockwiseDirection();
        }

        //EnemyCW Animations
        objectPos.picDelete();
        switch(newDirection){
            case RIGHT:
                objectPos.EnemyCW(1);
                break;
            case LEFT:
                objectPos.EnemyCW(2);
                break;
            case UP:
                objectPos.EnemyCW(3);
                break;
            case DOWN:
                objectPos.EnemyCW(4);
                break;
        }

        return newDirection;
    }
}
