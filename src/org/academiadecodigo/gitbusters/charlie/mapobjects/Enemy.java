package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;

public abstract class Enemy extends Active{

    public Enemy(Position pos, Direction startingDirection, Grid grid){
        seeTrough = false;
        walkTrough = false;
        objectPos = pos;
        speed = 1;
        objectPos.setColor(GridColor.RED);
        currentDirection = startingDirection;
        setGrid(grid);
    }









}




