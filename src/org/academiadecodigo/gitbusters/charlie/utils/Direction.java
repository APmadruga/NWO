package org.academiadecodigo.gitbusters.charlie.utils;

import org.academiadecodigo.gitbusters.charlie.gfx.Position;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT,
    STILL;

    private Position objectPos;

    public boolean isOpposite(Direction dir) {
        return dir.equals(oppositeDirection());
    }

    public Direction oppositeDirection() {
        Direction opposite = null;
        switch (this) {
            case UP:
                opposite = Direction.DOWN;
                break;
            case DOWN:
                opposite = Direction.UP;
                break;
            case LEFT:
                opposite = Direction.RIGHT;
                break;
            case RIGHT:
                opposite = Direction.LEFT;
                break;
        }
        return opposite;
    }

    public Direction clockwiseDirection() {
        Direction clockwise = null;
        switch (this) {
            case UP:
                clockwise = Direction.RIGHT;
                break;
            case RIGHT:
                clockwise = Direction.DOWN;
                break;
            case DOWN:
                clockwise = Direction.LEFT;
                break;
            case LEFT:
                clockwise = Direction.UP;
                break;
        }
        return clockwise;
    }

    public Direction counterClockwiseDirection() {
        Direction counterClockwise = null;
        switch (this) {
            case UP:
                counterClockwise = Direction.LEFT;
                break;
            case LEFT:
                counterClockwise = Direction.DOWN;
                break;
            case DOWN:
                counterClockwise = Direction.RIGHT;
                break;
            case RIGHT:
                counterClockwise = Direction.UP;
                break;
        }
        return counterClockwise;
    }

}
