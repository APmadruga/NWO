package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;

public class EmptySpot extends MapObject{
    public EmptySpot(Position pos){
        seeTrough = true;
        walkTrough = true;
        objectPos = pos;
        objectPos.setColor(GridColor.WHITE);
    }
}
