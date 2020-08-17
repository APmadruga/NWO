package org.academiadecodigo.gitbusters.charlie.utils;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;

public interface Grid {

    /**
     * Initializes the grid
     */
    public void init();

    /**
     * Gets the number of columns in the grid
     *
     * @return the number of columns
     */
    public int getCols();

    /**
     * Gets the number of rows in the grid
     *
     * @return the number of rows
     */
    public int getRows();

    /**
     * Create a random grid position
     *
     * @return the new grid position
     */
    public Position makeGridPosition();

    /**
     * Creates a a grid position in a specific column and row
     *
     * @param col   the position column
     * @param row   the position row
     * @return the new grid position
     */
    public Position makeGridPosition(int col, int row);

}
