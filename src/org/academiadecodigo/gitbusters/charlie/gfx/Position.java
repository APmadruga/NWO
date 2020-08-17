package org.academiadecodigo.gitbusters.charlie.gfx;

import org.academiadecodigo.gitbusters.charlie.utils.*;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Position extends AbstractGridPosition {

    private Rectangle rectangle;
    private Picture picture;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public Position(SimpleGfxGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        simpleGfxGrid = grid;
        int rectSetX = (getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX());
        int rectSetY = (getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY());
        if(picture == null){
            rectangle = new Rectangle(rectSetX, rectSetY, simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
            rectangle.fill();
        }

        show();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public Position(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        simpleGfxGrid = grid;
        int rectSetX = (getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX());
        int rectSetY = (getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY());
        if(picture == null && getColor() != GridColor.INVISIBLE){
            rectangle = new Rectangle(rectSetX, rectSetY, simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
            rectangle.fill();
        }
        show();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        if(picture == null && getColor() != GridColor.INVISIBLE){
            rectangle.fill();
        }

    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
        if(picture != null){
            picDelete();
        }
    }

    /**
     * @see GridPosition#moveInDirection(Direction, int)
     */
    @Override
    public void moveInDirection(Direction direction, int distance) {

        super.moveInDirection(direction, distance);
        if(picture != null) {
            int rectSetX = (simpleGfxGrid.getX()+getCol()*simpleGfxGrid.getCellSize())-picture.getX();
            int rectSetY = (simpleGfxGrid.getY()+getRow()*simpleGfxGrid.getCellSize())-picture.getY();
            picture.translate(rectSetX, rectSetY);
        } else {
            int rectSetX = (simpleGfxGrid.getX()+getCol()*simpleGfxGrid.getCellSize())-rectangle.getX();
            int rectSetY = (simpleGfxGrid.getY()+getRow()*simpleGfxGrid.getCellSize())-rectangle.getY();
            rectangle.translate(rectSetX, rectSetY);
        }
        //System.out.println("Current Col: " + getCol() + " Current Row: " + getRow());
        //System.out.println("Current X: " + rectangle.getX() + " Current Y: " + rectangle.getY());
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        if(color == GridColor.INVISIBLE){
            hide();
        }
    }


    //Player Movement
    public void PlayerMovement(int num){
        switch(num){
            case 1:
                //Right Movement
                picture = new Picture(getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX(), getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY(), "resources\\Images\\Player\\Player_Facing_Right.png");
                picture.draw();
                rectangle.delete();
                break;
            case 2:
                //Left Movement
                picture = new Picture(getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX(), getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY(), "resources\\Images\\Player\\Player_Facing_Left.png");
                picture.draw();
                rectangle.delete();
                break;
            case 3:
                //Up Movement
                picture = new Picture(getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX(), getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY(), "resources\\Images\\Player\\Player_Facing_Upward.png");
                picture.draw();
                rectangle.delete();
                break;
            case 4:
                //Down Movement
                picture = new Picture(getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX(), getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY(), "resources\\Images\\Player\\Player_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;
            default:
                picture = new Picture(getCol()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getX(), getRow()*simpleGfxGrid.getCellSize()+simpleGfxGrid.getY(), "resources\\Images\\Player\\Player_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;
        }

    }

    //EnemyBouncer Movement
    public void EnemyBouncer(int num){
        switch(num) {
            case 1:
                //Right Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyBouncer\\EnemyBouncer_Facing_Right.png");
                picture.draw();
                rectangle.delete();
                break;
            case 2:
                //Left Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyBouncer\\EnemyBouncer_Facing_Left.png");
                picture.draw();
                rectangle.delete();
                break;
            case 3:
                //Up Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyBouncer\\EnemyBouncer_Facing_Upward.png");
                picture.draw();
                rectangle.delete();
                break;
            case 4:
                //Down Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyBouncer\\EnemyBouncer_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;
            default:
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyBouncer\\EnemyBouncer_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;

        }
    }

    //EnemyCW Movement
    public void EnemyCW(int num){
        switch(num) {
            case 1:
                //Right Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCW\\EnemyCW_Facing_Right.png");
                picture.draw();
                rectangle.delete();
                break;
            case 2:
                //Left Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCW\\EnemyCW_Facing_Left.png");
                picture.draw();
                rectangle.delete();
                break;
            case 3:
                //Up Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCW\\EnemyCW_Facing_Upward.png");
                picture.draw();
                rectangle.delete();
                break;
            case 4:
                //Down Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCW\\EnemyCW_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;
            default:
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCW\\EnemyCW_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;

        }
    }

    //EnemyCCW Movement
    public void EnemyCCW(int num){
        switch(num) {
            case 1:
                //Right Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCCW\\EnemyCCW_Facing_Right.png");
                picture.draw();
                rectangle.delete();
                break;
            case 2:
                //Left Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCCW\\EnemyCCW_Facing_Left.png");
                picture.draw();
                rectangle.delete();
                break;
            case 3:
                //Up Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCCW\\EnemyCCW_Facing_Upward.png");
                picture.draw();
                rectangle.delete();
                break;
            case 4:
                //Down Movement
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCCW\\EnemyCCW_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;
            default:
                picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\EnemyCCW\\EnemyCCW_Facing_Downward.png");
                picture.draw();
                rectangle.delete();
                break;

        }
    }

    public void keyCardDesign(KeyDoorColor color){
        switch (color) {
            case YELLOW -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Keys\\Keycard_Pixel_Yellow.png");
            case RED -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Keys\\Keycard_Pixel_Red.png");
            case GREEN -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Keys\\Keycard_Pixel_Green.png");
            case BLUE -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Keys\\Keycard_Pixel_Blue.png");
            case PURPLE -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Keys\\Keycard_Pixel_Purple.png");
        }
        picture.draw();
        rectangle.delete();
    }

    public void doorDesign(KeyDoorColor color){
        switch (color) {
            case YELLOW -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Doors\\yellowdoor.png");
            case RED -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Doors\\reddoor.png");
            case GREEN -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Doors\\greendoor.png");
            case BLUE -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Doors\\bluedoor.png");
            case PURPLE -> picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Doors\\purpledoor.png");
        }
        picture.draw();
        rectangle.delete();
    }

    public void coinDesign(){
        picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Coin\\Coin.png");
        picture.draw();
        rectangle.delete();
    }

    public void terminalDesign(){
        picture = new Picture(getCol() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getX(), getRow() * simpleGfxGrid.getCellSize() + simpleGfxGrid.getY(), "resources\\Images\\Terminal\\terminal2.png");
        picture.draw();
        rectangle.delete();
    }

                              //Player Delete Picture
    public void picDelete(){
        picture.delete();
    }

}

