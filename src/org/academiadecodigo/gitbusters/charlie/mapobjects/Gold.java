package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;

public class Gold extends Active{
    protected boolean got;
    private int score;

    public Gold(Position pos){
        got = false;
        score = 500;
        currentDirection = Direction.STILL;
        speed = 0;
        objectPos = pos;
        objectPos.setColor(GridColor.GOLD);
        objectPos.coinDesign();
    }

    public void get(){
        got = true;
        objectPos.setColor(GridColor.INVISIBLE);
        objectPos.hide();
    }

    public boolean isGot(){
        return got;
    }

    public int getScore() {
        return score;
    }
}
