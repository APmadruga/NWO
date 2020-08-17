package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;

public class EnemyBouncer extends Enemy{

    public EnemyBouncer(Position pos, Direction startingDirection, Grid grid) {
        super(pos, startingDirection, grid);
        objectPos.EnemyBouncer(0);

        objectPos.picDelete();
        switch(currentDirection){
            case RIGHT:
                objectPos.EnemyBouncer(1);
                break;
            case LEFT:
                objectPos.EnemyBouncer(2);
                break;
            case UP:
                objectPos.EnemyBouncer(3);
                break;
            case DOWN:
                objectPos.EnemyBouncer(4);
                break;
        }
    }

    @Override
    public Direction changeDirection() {
        Direction newDirection = currentDirection.oppositeDirection();

        //EnemyBouncer Animations
        objectPos.picDelete();
        switch(newDirection){
            case RIGHT:
                objectPos.EnemyBouncer(1);
                break;
            case LEFT:
                objectPos.EnemyBouncer(2);
                break;
            case UP:
                objectPos.EnemyBouncer(3);
                break;
            case DOWN:
                objectPos.EnemyBouncer(4);
                break;
        }

        return newDirection;
    }
}
