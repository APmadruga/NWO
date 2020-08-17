
package org.academiadecodigo.gitbusters.charlie.maps;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;
import org.academiadecodigo.gitbusters.charlie.gfx.SimpleGfxGrid;
import org.academiadecodigo.gitbusters.charlie.mapobjects.*;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;
import org.academiadecodigo.gitbusters.charlie.utils.KeyDoorColor;

public class Map {
    private static int rows;
    private static int cols;
    private static SimpleGfxGrid grid;
    private static MapObject[][] map;
    private static MapObject[] objects;

    public Map(SimpleGfxGrid ngrid, char[][] newMap, MapObject[] newobjects){
        rows = newMap.length;

        cols = newMap[0].length;
        grid = ngrid;
        objects = newobjects;
        map = new MapObject[rows][cols];
        for(int i = 0; i < newMap.length; i++){
            for(int j = 0; j < newMap[i].length; j++){
                switch (newMap[i][j]){
                    case '_'-> map[i][j] = new EmptySpot(new Position(j, i, grid));
                    case 'O'-> map[i][j] = new Glass(new Position(j, i, grid));
                    case 'X'-> map[i][j] = new Wall(new Position(j, i, grid));
                    case 'Y'-> map[i][j] = new Door(new Position(j, i, grid), KeyDoorColor.YELLOW);
                    case 'R'-> map[i][j] = new Door(new Position(j, i, grid), KeyDoorColor.RED);
                    case 'G'-> map[i][j] = new Door(new Position(j, i, grid), KeyDoorColor.GREEN);
                    case 'B'-> map[i][j] = new Door(new Position(j, i, grid), KeyDoorColor.BLUE);
                    case 'P'-> map[i][j] = new Door(new Position(j, i, grid), KeyDoorColor.PURPLE);
                }
            }
        }
    }

    public static int getRows(){
        return rows;
    }

    public static int getCols(){
        return cols;
    }

    public static SimpleGfxGrid getGrid(){
        return grid;
    }

    public static MapObject[][] getMap(){
        return map;
    }

    public static MapObject[] objects(){
        return objects;
    }

}
