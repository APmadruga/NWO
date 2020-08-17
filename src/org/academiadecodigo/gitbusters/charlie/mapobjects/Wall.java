package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.utils.GridColor;

public class Wall extends MapObject{

    public Wall(Position pos){
        seeTrough = false;
        walkTrough = false;
        objectPos = pos;
        objectPos.setColor(GridColor.DARKGRAY);
    }
}
