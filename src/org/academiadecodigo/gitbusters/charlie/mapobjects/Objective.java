package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;

public class Objective extends Active{

    public Objective(Position pos){
        seeTrough = true;
        walkTrough = true;
        objectPos = pos;
        speed = 0;
        objectPos.setColor(GridColor.CYAN);
        objectPos.terminalDesign();
        currentDirection = Direction.STILL;
        speed = 0;
    }
}
