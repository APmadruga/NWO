package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;

public class EnemyCCW extends Enemy{

    public EnemyCCW(Position pos, Direction startingDirection, Grid grid) {
        super(pos, startingDirection, grid);
        objectPos.EnemyCCW(0);

        objectPos.picDelete();
        switch(currentDirection){
            case RIGHT:
                objectPos.EnemyCCW(1);
                break;
            case LEFT:
                objectPos.EnemyCCW(2);
                break;
            case UP:
                objectPos.EnemyCCW(3);
                break;
            case DOWN:
                objectPos.EnemyCCW(4);
                break;
        }
    }

    @Override
    public Direction changeDirection() {
        Direction newDirection = currentDirection.counterClockwiseDirection();


        while(isHittingWall(newDirection)){
            newDirection = newDirection.counterClockwiseDirection();

        }

        //EnemyCCW Animations
        objectPos.picDelete();
        switch(newDirection){
            case RIGHT:
                objectPos.EnemyCCW(1);
                break;
            case LEFT:
                objectPos.EnemyCCW(2);
                break;
            case UP:
                objectPos.EnemyCCW(3);
                break;
            case DOWN:
                objectPos.EnemyCCW(4);
                break;
        }

        return newDirection;
    }
}
