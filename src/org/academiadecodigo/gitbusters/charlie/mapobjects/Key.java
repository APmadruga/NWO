package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;
import org.academiadecodigo.gitbusters.charlie.utils.KeyDoorColor;
import org.academiadecodigo.gitbusters.charlie.gfx.Position;

public class Key extends Active{

    protected KeyDoorColor colorCombo;
    protected boolean got;


    public Key(Position pos, KeyDoorColor newColor){
        got = false;
        seeTrough = true;
        walkTrough = true;
        objectPos = pos;
        colorCombo = newColor;
        switch (colorCombo){
            case YELLOW -> objectPos.setColor(GridColor.YELLOWD);
            case RED -> objectPos.setColor(GridColor.REDD);
            case GREEN -> objectPos.setColor(GridColor.GREEND);
            case BLUE -> objectPos.setColor(GridColor.BLUED);
            case PURPLE -> objectPos.setColor(GridColor.PURPLED);
        }
        objectPos.keyCardDesign(colorCombo);
        currentDirection = Direction.STILL;
        speed = 0;
    }

    public void get(){
        got = true;
        objectPos.setColor(GridColor.INVISIBLE);
        objectPos.hide();
    }

    public boolean isGot(){
        return got;
    }

    public KeyDoorColor getColorCombo() {
        return colorCombo;
    }
}
