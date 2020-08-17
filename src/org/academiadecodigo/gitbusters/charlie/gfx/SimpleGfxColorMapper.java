package org.academiadecodigo.gitbusters.charlie.gfx;

import org.academiadecodigo.gitbusters.charlie.utils.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class SimpleGfxColorMapper {

    private static final Color colors[] = {
            Color.ORANGE,
            Color.GREEN,
            Color.BLUE,
            Color.MAGENTA,
            Color.DARK_GRAY,
            Color.LIGHT_GRAY,
            Color.WHITE,
            Color.YELLOW,
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.MAGENTA,
            Color.CYAN,
            Color.WHITE
    };

    public static Color getColor(GridColor color){

        Color sGfxColor = null;

        switch (color) {
            case RED -> sGfxColor = colors[0];
            case GREEN -> sGfxColor = colors[1];
            case BLUE -> sGfxColor = colors[2];
            case MAGENTA -> sGfxColor = colors[3];
            case DARKGRAY -> sGfxColor = colors[4];
            case LIGHTGRAY -> sGfxColor = colors[5];
            case WHITE -> sGfxColor = colors[6];
            case YELLOWD -> sGfxColor = colors[7];
            case REDD -> sGfxColor = colors[8];
            case GREEND -> sGfxColor = colors[9];
            case BLUED -> sGfxColor = colors[10];
            case PURPLED -> sGfxColor = colors[11];
            case CYAN -> sGfxColor = colors[12];
            case INVISIBLE -> sGfxColor = colors[13];
            case GOLD -> sGfxColor = colors[0];
            default -> System.out.println("something went terribly wrong...");
        }

        return sGfxColor;
    }
}
