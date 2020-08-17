package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;

public class Glass extends MapObject{

    public Glass(Position pos){
        seeTrough = true;
        walkTrough = false;
        objectPos = pos;
        objectPos.setColor(GridColor.LIGHTGRAY);
    }
}
