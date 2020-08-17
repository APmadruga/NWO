
package org.academiadecodigo.gitbusters.charlie.maps;

import org.academiadecodigo.gitbusters.charlie.mapobjects.*;
import org.academiadecodigo.gitbusters.charlie.utils.Direction;
import org.academiadecodigo.gitbusters.charlie.utils.Grid;
import org.academiadecodigo.gitbusters.charlie.utils.KeyDoorColor;

public class MapArray {

    public static final int map0Doors = 0;
    public static final int map1Doors = 14;

    public static final char[][] map0=
        {       {'X','X','X','X','X','X','X','X','X','X','X','X'},
                {'X','_','_','_','_','_','_','_','_','X','_','X'},
                {'X','X','X','X','X','_','_','X','_','X','_','X'},
                {'X','_','_','_','_','_','_','X','_','X','_','X'},
                {'X','_','X','X','_','_','_','_','_','_','_','X'},
                {'X','_','_','_','_','X','_','_','X','X','X','X'},
                {'X','X','_','_','_','X','_','_','_','_','_','X'},
                {'X','_','_','X','X','X','X','_','_','_','_','X'},
                {'X','_','_','_','_','_','_','_','_','_','_','X'},
                {'X','_','X','_','X','_','X','_','X','_','_','X'},
                {'X','X','X','X','X','X','X','X','X','X','X','X'}};

    public static final char[][] map1={
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
            {'X','_','_','X','_','_','_','_','_','_','_','_','_','O','_','_','_','X','_','_','_','_','_','_','_','_','_','_','X','_','_','_','X','X','_','_','_','_','X','_','X','_','_','_','_','_','_','X','_','_','_','X'},
            {'X','_','_','X','_','_','_','_','_','_','_','_','_','X','_','_','_','X','O','X','O','X','O','X','O','X','_','_','X','_','_','_','X','X','_','X','X','_','X','_','X','_','X','X','R','X','_','X','_','_','_','X'},
            {'X','_','X','X','O','O','O','O','O','O','O','O','O','X','_','_','_','X','_','X','_','X','_','X','_','X','_','_','X','X','R','X','X','X','_','X','_','_','X','_','X','_','_','O','_','_','_','X','_','_','_','X'},
            {'X','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','X','_','X','_','X','_','X','_','_','X','_','_','_','_','X','_','X','_','_','X','_','X','_','_','O','_','_','_','X','_','_','_','X'},
            {'X','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','X','_','X','_','X','_','X','_','_','X','_','_','_','_','_','_','X','X','X','X','_','X','_','_','O','_','_','_','X','_','_','_','X'},
            {'X','_','_','_','_','_','X','X','X','X','X','X','X','X','_','_','_','X','X','X','X','X','X','X','X','X','_','_','X','_','_','_','_','X','_','_','_','_','_','_','X','_','_','O','_','_','_','X','X','G','X','X'},
            {'X','_','_','X','_','_','X','X','_','Y','_','P','_','X','_','X','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','X','X','X','X','X','X','O','X','_','_','O','_','X','X','X','X','B','X','X'},
            {'X','_','_','_','_','_','_','X','X','X','_','X','_','X','_','_','_','X','O','X','X','O','X','X','O','X','_','_','X','_','_','_','_','_','_','_','_','_','_','_','X','_','_','O','_','_','X','_','_','_','_','X'},
            {'X','_','_','_','_','_','_','X','_','R','_','X','_','X','_','_','_','X','_','X','X','_','X','X','_','X','_','_','X','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','X','X','X'},
            {'X','_','_','X','_','_','_','X','X','X','_','X','_','X','_','_','_','X','_','X','X','_','X','X','_','X','X','Y','X','X','X','X','X','X','X','X','X','X','X','_','X','_','_','O','_','_','X','_','_','O','_','X'},
            {'X','_','_','_','_','_','_','X','_','G','_','X','_','X','_','_','_','X','_','X','X','_','X','X','_','X','_','_','X','_','_','_','X','_','_','_','X','_','_','_','X','_','_','O','_','_','X','_','_','O','_','X'},
            {'X','_','_','_','_','_','_','X','X','X','_','X','X','X','X','_','_','X','O','X','X','O','X','X','O','X','_','_','X','_','X','_','X','_','X','_','X','_','X','_','X','_','_','O','_','_','X','_','_','X','_','X'},
            {'X','_','_','X','_','_','_','X','_','B','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','X','_','_','_','X','_','_','_','_','O','_','_','X','_','_','O','_','X'},
            {'X','_','_','_','_','_','_','X','X','X','X','X','X','X','X','X','X','X','X','X','_','X','X','X','X','X','X','X','G','X','X','X','X','X','X','X','X','X','X','X','X','B','X','X','X','X','X','_','_','O','_','X'},
            {'X','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','X','_','_','_','X','_','_','_','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','X','X','X'},
            {'X','_','_','X','_','_','_','X','_','_','X','_','_','_','X','_','_','_','X','_','_','X','_','_','_','_','X','_','X','_','O','_','O','O','O','O','O','O','O','_','X','_','_','X','_','_','X','_','_','_','_','X'},
            {'X','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','X','_','X','_','O','_','O','_','_','_','_','_','O','_','X','_','_','O','_','_','X','_','_','_','_','X'},
            {'X','_','_','_','_','_','_','X','_','X','X','X','X','X','X','X','X','X','X','X','X','X','_','_','_','_','X','_','X','_','O','_','O','_','X','X','X','_','O','_','X','_','_','X','_','X','X','X','X','X','_','X'},
            {'X','_','_','X','_','_','_','X','_','_','_','_','_','_','_','_','_','_','X','_','_','X','_','_','_','_','X','_','X','_','O','_','O','_','X','_','X','_','O','_','X','_','_','O','_','O','_','_','_','X','_','X'},
            {'X','_','_','_','_','_','_','X','_','_','_','_','X','_','_','_','_','_','_','_','_','X','_','_','_','_','X','_','X','_','O','_','O','_','X','_','X','_','O','_','X','_','_','X','_','X','_','_','_','O','_','X'},
            {'X','_','_','_','_','_','_','X','X','O','O','O','X','X','X','O','O','O','X','X','X','X','_','_','_','_','X','_','X','_','O','_','O','_','X','_','X','_','O','_','X','_','_','O','_','O','_','_','_','X','_','X'},
            {'X','_','_','X','_','_','_','X','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','X','_','X','_','O','_','O','_','X','X','X','_','O','_','X','_','_','X','_','X','X','X','X','X','_','X'},
            {'X','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','X','_','X','_','O','_','O','_','_','_','_','_','O','_','X','_','_','O','_','_','_','_','_','_','_','X'},
            {'X','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','_','_','_','_','_','X','_','_','_','_','X','_','X','_','O','_','O','O','O','O','O','O','O','_','X','_','_','X','_','_','X','_','_','_','_','X'},
            {'X','_','_','X','_','_','X','X','O','X','X','X','O','O','O','X','X','X','O','O','O','X','_','X','X','_','X','_','X','_','X','_','_','_','_','_','_','_','_','_','X','_','_','O','_','_','X','_','_','_','_','X'},
            {'X','X','_','X','_','_','_','_','_','_','X','_','_','_','_','_','X','_','_','_','_','X','_','_','_','_','X','_','X','_','X','X','X','X','X','X','X','X','X','X','X','_','_','X','X','X','X','_','_','_','_','X'},
            {'X','_','_','X','_','_','_','_','_','_','Y','_','_','X','_','_','_','_','_','X','_','_','_','_','_','_','_','_','X','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','B','_','_','_','_','X'},
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
    };

    public static Active[] map1Actives(Grid grid, Player player){
        Active[] actives = new Active[58];

        //Keys
        actives[0] = new Key(grid.makeGridPosition(18, 1), KeyDoorColor.YELLOW);
        actives[1] = new Key(grid.makeGridPosition(25, 15),KeyDoorColor.RED);
        actives[2] = new Key(grid.makeGridPosition(30, 1),KeyDoorColor.GREEN);
        actives[3] = new Key(grid.makeGridPosition(45, 3),KeyDoorColor.BLUE);
        actives[4] = new Key(grid.makeGridPosition(49, 4),KeyDoorColor.PURPLE);
        //Objective
        actives[5] = new Objective(grid.makeGridPosition(49, 2));
        //Player
        actives[6] = player;
        //Enemies (21)
        actives[7] = new EnemyBouncer(grid.makeGridPosition(4,1), Direction.RIGHT, grid);
        actives[8] = new EnemyBouncer(grid.makeGridPosition(6,8), Direction.DOWN, grid);
        actives[9] = new EnemyCW(grid.makeGridPosition(8,22), Direction.RIGHT, grid);
        actives[10] = new EnemyBouncer(grid.makeGridPosition(11,16), Direction.RIGHT, grid);
        actives[11] = new EnemyBouncer(grid.makeGridPosition(17,16), Direction.LEFT, grid);
        actives[12] = new EnemyBouncer(grid.makeGridPosition(14,11), Direction.UP, grid);
        actives[13] = new EnemyBouncer(grid.makeGridPosition(18,11), Direction.UP, grid);
        actives[14] = new EnemyBouncer(grid.makeGridPosition(21,9), Direction.DOWN, grid);
        actives[15] = new EnemyBouncer(grid.makeGridPosition(24,11), Direction.UP, grid);
        actives[16] = new EnemyBouncer(grid.makeGridPosition(25,19), Direction.LEFT, grid);
        actives[17] = new EnemyCW(grid.makeGridPosition(31,15), Direction.RIGHT, grid);
        actives[18] = new EnemyCCW(grid.makeGridPosition(33,23), Direction.RIGHT, grid);
        actives[19] = new EnemyBouncer(grid.makeGridPosition(29,5), Direction.RIGHT, grid);
        actives[20] = new EnemyCCW(grid.makeGridPosition(36,3), Direction.DOWN, grid);
        actives[21] = new EnemyBouncer(grid.makeGridPosition(44,13), Direction.UP, grid);
        actives[22] = new EnemyBouncer(grid.makeGridPosition(50,10), Direction.DOWN, grid);
        actives[23] = new EnemyBouncer(grid.makeGridPosition(44,15), Direction.DOWN, grid);
        actives[24] = new EnemyCW(grid.makeGridPosition(46,19), Direction.RIGHT, grid);
        actives[25] = new EnemyBouncer(grid.makeGridPosition(18,4), Direction.UP, grid);
        actives[26] = new EnemyBouncer(grid.makeGridPosition(20,4), Direction.DOWN, grid);
        actives[27] = new EnemyBouncer(grid.makeGridPosition(22,4), Direction.UP, grid);
        actives[28] = new EnemyBouncer(grid.makeGridPosition(24,4), Direction.DOWN, grid);
        //Doors (14)
        actives[29] = new Door(grid.makeGridPosition(9,7),KeyDoorColor.YELLOW);
        actives[30] = new Door(grid.makeGridPosition(27,10),KeyDoorColor.YELLOW);
        actives[31] = new Door(grid.makeGridPosition(10,27),KeyDoorColor.YELLOW);
        actives[32] = new Door(grid.makeGridPosition(9,9),KeyDoorColor.RED);
        actives[33] = new Door(grid.makeGridPosition(30,3),KeyDoorColor.RED);
        actives[34] = new Door(grid.makeGridPosition(44,2),KeyDoorColor.RED);
        actives[35] = new Door(grid.makeGridPosition(9,11),KeyDoorColor.GREEN);
        actives[36] = new Door(grid.makeGridPosition(28,14),KeyDoorColor.GREEN);
        actives[37] = new Door(grid.makeGridPosition(49,6),KeyDoorColor.GREEN);
        actives[38] = new Door(grid.makeGridPosition(9,13),KeyDoorColor.BLUE);
        actives[39] = new Door(grid.makeGridPosition(41,14),KeyDoorColor.BLUE);
        actives[40] = new Door(grid.makeGridPosition(46,27),KeyDoorColor.BLUE);
        actives[41] = new Door(grid.makeGridPosition(49,7),KeyDoorColor.BLUE);
        actives[42] = new Door(grid.makeGridPosition(11,7),KeyDoorColor.PURPLE);
        //Gold (15)
        actives[43] = new Gold(grid.makeGridPosition(2,1));
        actives[44] = new Gold(grid.makeGridPosition(8,7));
        actives[45] = new Gold(grid.makeGridPosition(8,9));
        actives[46] = new Gold(grid.makeGridPosition(8,11));
        actives[47] = new Gold(grid.makeGridPosition(8,13));
        actives[48] = new Gold(grid.makeGridPosition(12,7));
        actives[49] = new Gold(grid.makeGridPosition(12,8));
        actives[50] = new Gold(grid.makeGridPosition(12,9));
        actives[51] = new Gold(grid.makeGridPosition(12,10));
        actives[52] = new Gold(grid.makeGridPosition(12,11));
        actives[53] = new Gold(grid.makeGridPosition(16,1));
        actives[54] = new Gold(grid.makeGridPosition(20,19));
        actives[55] = new Gold(grid.makeGridPosition(22,15));
        actives[56] = new Gold(grid.makeGridPosition(45,25));
        actives[57] = new Gold(grid.makeGridPosition(49,26));

        return actives;
    }

}

