package org.academiadecodigo.gitbusters.charlie.mapobjects;

import org.academiadecodigo.gitbusters.charlie.utils.Grid;
import org.academiadecodigo.gitbusters.charlie.gfx.Position;

public abstract class MapObject {
    protected boolean walkTrough;
    protected boolean seeTrough;
    protected Position objectPos;
    protected Grid grid;

    public boolean isWalkTrough(){
        return walkTrough;
    }

    public boolean isSeeTrough(){
        return seeTrough;
    }

    public Position getPos(){
        return objectPos;
    }
}
