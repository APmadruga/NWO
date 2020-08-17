package org.academiadecodigo.gitbusters.charlie;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.gitbusters.charlie.utils.audio.MenuMusic;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class EndLevel1 implements KeyboardHandler {

    private boolean isPressed;

    public void start() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        MenuMusic levelendmusic = new MenuMusic();
        levelendmusic.playMusic();

        long time = 100;
        setupKeys();

        Picture pic1 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le1.png");
        pic1.draw();
        Thread.sleep(time);
        Picture pic2 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le2.png");
        pic2.draw();
        Thread.sleep(time);
        Picture pic3 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le3.png");
        pic3.draw();
        Thread.sleep(time);
        Picture pic4 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le4.png");
        pic4.draw();
        Thread.sleep(time);
        Picture pic5 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le5.png");
        pic5.draw();
        Thread.sleep(time);
        Picture pic6 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le6.png");
        pic6.draw();
        Thread.sleep(time);
        Picture pic7 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le7.png");
        pic7.draw();
        Thread.sleep(time);
        Picture pic8 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le8.jpg");
        pic8.draw();
        Thread.sleep(time);
        Picture pic9 = new Picture(10, 10, "resources\\Images\\EndLevel1\\le9.jpg");
        pic9.draw();
        Thread.sleep(2000);
        Picture pic10 = new Picture(10, 10, "resources\\Images\\EndLevel1\\fundus.jpg");


        pic1.delete();
        pic2.delete();
        pic3.delete();
        pic4.delete();
        pic5.delete();
        pic6.delete();
        pic7.delete();
        pic8.delete();
        pic9.delete();
        pic10.delete();

        while(!isPressed){
            pic10.draw();
        }
        pic10.delete();
        levelendmusic.stopMusic();

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