package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;
import org.academiadecodigo.gitbusters.charlie.utils.KeyDoorColor;
import org.academiadecodigo.gitbusters.charlie.gfx.Position;

public class Door extends Active{
    protected KeyDoorColor colorCombo;
    protected boolean open;


    public Door(Position pos, KeyDoorColor newColor){
        open = false;
        seeTrough = false;
        walkTrough = false;
        objectPos = pos;
        colorCombo = newColor;
        objectPos.doorDesign(colorCombo);
        switch (colorCombo){
            case YELLOW -> objectPos.setColor(GridColor.YELLOWD);
            case RED -> objectPos.setColor(GridColor.REDD);
            case GREEN -> objectPos.setColor(GridColor.GREEND);
            case BLUE -> objectPos.setColor(GridColor.BLUED);
            case PURPLE -> objectPos.setColor(GridColor.PURPLED);
        }
        speed = 0;
        currentDirection = Direction.STILL;


    }

    public void open(){
            open = true;
            seeTrough = true;
            walkTrough = true;
            objectPos.setColor(GridColor.INVISIBLE);
            objectPos.hide();
    }

    public KeyDoorColor getColorCombo() {
        return colorCombo;
    }
}
