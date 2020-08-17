package org.academiadecodigo.gitbusters.charlie;
import org.academiadecodigo.gitbusters.charlie.utils.audio.CoinSound;
import org.academiadecodigo.gitbusters.charlie.utils.audio.GameOverMusic;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class GameOver implements KeyboardHandler {

    private boolean isPressed;

    public void start() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        GameOverMusic gameovermusic = new GameOverMusic();
        gameovermusic.playMusic();

        long time = 100;
        setupKeys();

        Picture pic1 = new Picture(10, 10, "resources\\Images\\GameOver\\go1.png");
        pic1.draw();
        Thread.sleep(time);
        Picture pic2 = new Picture(10, 10, "resources\\Images\\GameOver\\go2.png");
        pic2.draw();
        Thread.sleep(time);
        Picture pic3 = new Picture(10, 10, "resources\\Images\\GameOver\\go3.png");
        pic3.draw();
        Thread.sleep(time);
        Picture pic4 = new Picture(10, 10, "resources\\Images\\GameOver\\go4.png");
        pic4.draw();
        Thread.sleep(time);
        Picture pic5 = new Picture(10, 10, "resources\\Images\\GameOver\\go5.png");
        pic5.draw();
        Thread.sleep(time);
        Picture pic6 = new Picture(10, 10, "resources\\Images\\GameOver\\go6.png");
        pic6.draw();
        Thread.sleep(time);
        Picture pic7 = new Picture(10, 10, "resources\\Images\\GameOver\\go7.png");
        pic7.draw();
        Thread.sleep(1000);
        Picture pic8 = new Picture(10, 10, "resources\\Images\\GameOver\\go8.jpg");

        pic1.delete();
        pic2.delete();
        pic3.delete();
        pic4.delete();
        pic5.delete();
        pic6.delete();
        pic7.delete();
        while(!isPressed){
            pic8.draw();
        }
        pic8.delete();
        gameovermusic.stopMusic();

    }

    private void setupKeys() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(space);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        this.isPressed=true;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
