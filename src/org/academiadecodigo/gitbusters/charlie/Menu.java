package org.academiadecodigo.gitbusters.charlie;
import org.academiadecodigo.gitbusters.charlie.utils.audio.MenuMusic;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;


public class Menu implements KeyboardHandler {

    private boolean isPressed;

    public void start() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        MenuMusic firstmusic = new MenuMusic();
        firstmusic.playMusic();

        long time = 100;
        setupKeys();

        Picture pic1 = new Picture(10, 10, "resources\\Images\\Menu\\text1.jpg");
        pic1.draw();
        Thread.sleep(time);
        Picture pic2 = new Picture(10, 10, "resources\\Images\\Menu\\text2.jpg");
        pic2.draw();
        Thread.sleep(time);
        Picture pic3 = new Picture(10, 10, "resources\\Images\\Menu\\text3.jpg");
        pic3.draw();
        Thread.sleep(time);
        Picture pic4 = new Picture(10, 10, "resources\\Images\\Menu\\text4.jpg");
        pic4.draw();
        Thread.sleep(time);
        Picture pic5 = new Picture(10, 10, "resources\\Images\\Menu\\text5.jpg");
        pic5.draw();
        Thread.sleep(time);
        Picture pic6 = new Picture(10, 10, "resources\\Images\\Menu\\text6.jpg");
        pic6.draw();
        Thread.sleep(time);
        Picture pic7 = new Picture(10, 10, "resources\\Images\\Menu\\text7.jpg");
        pic7.draw();
        Thread.sleep(time);
        Picture pic8 = new Picture(10, 10, "resources\\Images\\Menu\\text8.jpg");
        pic8.draw();
        Thread.sleep(time);
        Picture pic9 = new Picture(10, 10, "resources\\Images\\Menu\\text9.jpg");
        pic9.draw();
        Thread.sleep(time);
        Picture pic10 = new Picture(10, 10, "resources\\Images\\Menu\\text10.jpg");
        pic10.draw();
        Thread.sleep(time);
        Picture pic11 = new Picture(10, 10, "resources\\Images\\Menu\\text10.jpg");
        pic11.draw();
        Thread.sleep(5000);
        Picture pic12 = new Picture(10, 10, "resources\\Images\\Menu\\text9.jpg");
        pic12.draw();
        Thread.sleep(time);
        Picture pic13 = new Picture(10, 10, "resources\\Images\\Menu\\text8.jpg");
        pic13.draw();
        Thread.sleep(time);
        Picture pic14 = new Picture(10, 10, "resources\\Images\\Menu\\text7.jpg");
        pic14.draw();
        Thread.sleep(time);
        Picture pic15 = new Picture(10, 10, "resources\\Images\\Menu\\text6.jpg");
        pic15.draw();
        Thread.sleep(time);
        Picture pic16 = new Picture(10, 10, "resources\\Images\\Menu\\text5.jpg");
        pic16.draw();
        Thread.sleep(time);
        Picture pic17 = new Picture(10, 10, "resources\\Images\\Menu\\text4.jpg");
        pic17.draw();
        Thread.sleep(time);
        Picture pic18 = new Picture(10, 10, "resources\\Images\\Menu\\text3.jpg");
        pic18.draw();
        Thread.sleep(time);
        Picture pic19 = new Picture(10, 10, "resources\\Images\\Menu\\text2.jpg");
        pic19.draw();
        Thread.sleep(time);
        Picture pic20 = new Picture(10, 10, "resources\\Images\\Menu\\text1.jpg");
        pic20.draw();
        Thread.sleep(time);
        Picture pic21 = new Picture(10, 10, "resources\\Images\\Menu\\1.jpg");
        pic21.draw();
        Thread.sleep(time);
        Picture pic22 = new Picture(10, 10, "resources\\Images\\Menu\\2.jpg");
        pic22.draw();
        Thread.sleep(time);
        Picture pic23 = new Picture(10, 10, "resources\\Images\\Menu\\3.jpg");
        pic23.draw();
        Thread.sleep(time);
        Picture pic24 = new Picture(10, 10, "resources\\Images\\Menu\\4.jpg");
        pic24.draw();
        Thread.sleep(time);
        Picture pic25 = new Picture(10, 10, "resources\\Images\\Menu\\5.jpg");
        pic25.draw();
        Thread.sleep(time);
        Picture pic26 = new Picture(10, 10, "resources\\Images\\Menu\\6.jpg");
        pic26.draw();
        Thread.sleep(time);
        Picture pic27 = new Picture(10, 10, "resources\\Images\\Menu\\7.jpg");
        pic27.draw();
        Thread.sleep(time);
        Picture pic28 = new Picture(10, 10, "resources\\Images\\Menu\\8.jpg");
        pic28.draw();
        Thread.sleep(time);
        Picture pic29 = new Picture(10, 10, "resources\\Images\\Menu\\9.jpg");
        pic29.draw();
        Thread.sleep(time);
        Picture pic30 = new Picture(10, 10, "resources\\Images\\Menu\\10.jpg");
        pic30.draw();
        Thread.sleep(time);
        Picture pic31 = new Picture(10, 10, "resources\\Images\\Menu\\11.jpg");
        pic31.draw();
        Thread.sleep(time);
        Picture pic32 = new Picture(10, 10, "resources\\Images\\Menu\\12.jpg");
        pic32.draw();
        Thread.sleep(time);
        Picture pic33 = new Picture(10, 10, "resources\\Images\\Menu\\13.jpg");
        pic33.draw();
        Thread.sleep(time);
        Picture pic34 = new Picture(10, 10, "resources\\Images\\Menu\\14.jpg");
        pic34.draw();
        Thread.sleep(time);
        Picture pic35 = new Picture(10, 10, "resources\\Images\\Menu\\15.jpg");
        pic35.draw();
        Thread.sleep(time);
        Picture pic36 = new Picture(10, 10, "resources\\Images\\Menu\\16.jpg");
        pic36.draw();
        Thread.sleep(time);
        Picture pic38 = new Picture(10, 10, "resources\\Images\\Menu\\18.jpg");
        pic38.draw();
        Thread.sleep(time);
        Picture pic39 = new Picture(10, 10, "resources\\Images\\Menu\\19.jpg");
        pic39.draw();
        Thread.sleep(time);
        Picture pic40 = new Picture(10, 10, "resources\\Images\\Menu\\20.jpg");
        pic40.draw();
        Thread.sleep(time);
        Picture pic41 = new Picture(10, 10, "resources\\Images\\Menu\\21.jpg");
        pic41.draw();
        Thread.sleep(time);
        Picture pic42 = new Picture(10, 10, "resources\\Images\\Menu\\22.jpg");
        pic42.draw();
        Thread.sleep(time);
        Picture pic43 = new Picture(10, 10, "resources\\Images\\Menu\\23.jpg");
        pic43.draw();
        Thread.sleep(time);
        Picture pic44 = new Picture(10, 10, "resources\\Images\\Menu\\24.jpg");
        pic44.draw();
        Thread.sleep(time);
        Picture pic45 = new Picture(10, 10, "resources\\Images\\Menu\\25.jpg");
        pic45.draw();
        Thread.sleep(time);
        Picture pic46 = new Picture(10, 10, "resources\\Images\\Menu\\26.jpg");
        pic46.draw();
        Thread.sleep(time);
        Picture pic47 = new Picture(10, 10, "resources\\Images\\Menu\\27.jpg");
        pic47.draw();
        Thread.sleep(time);
        Picture pic48 = new Picture(10, 10, "resources\\Images\\Menu\\28.jpg");
        pic48.draw();
        Thread.sleep(time);
        Picture pic49 = new Picture(10, 10, "resources\\Images\\Menu\\29.jpg");
        pic49.draw();
        Thread.sleep(time);
        Picture pic50 = new Picture(10, 10, "resources\\Images\\Menu\\30.jpg");
        pic50.draw();
        Thread.sleep(time);
        Picture pic51 = new Picture(10, 10, "resources\\Images\\Menu\\31.jpg");
        pic51.draw();
        Thread.sleep(time);
        Picture pic52 = new Picture(10, 10, "resources\\Images\\Menu\\32.jpg");
        pic52.draw();
        Thread.sleep(time);
        Picture pic53 = new Picture(10, 10, "resources\\Images\\Menu\\33.jpg");
        pic53.draw();
        Thread.sleep(time);
        Picture pic54 = new Picture(10, 10, "resources\\Images\\Menu\\34.jpg");
        pic54.draw();
        Thread.sleep(time);
        Picture pic55 = new Picture(10, 10, "resources\\Images\\Menu\\35.jpg");
        pic55.draw();
        Thread.sleep(time);
        Picture pic56 = new Picture(10, 10, "resources\\Images\\Menu\\36.jpg");
        pic56.draw();
        Thread.sleep(time);
        Picture pic57 = new Picture(10, 10, "resources\\Images\\Menu\\37.jpg");
        pic57.draw();
        Thread.sleep(time);
        Picture pic58 = new Picture(10, 10, "resources\\Images\\Menu\\38.jpg");
        pic58.draw();
        Thread.sleep(time);
        Picture pic59 = new Picture(10, 10, "resources\\Images\\Menu\\39.jpg");
        pic59.draw();
        Thread.sleep(1800);
        Picture pic60 = new Picture(10, 10, "resources\\Images\\Menu\\40.jpg");

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
        pic11.delete();
        pic12.delete();
        pic13.delete();
        pic14.delete();
        pic15.delete();
        pic16.delete();
        pic17.delete();
        pic18.delete();
        pic19.delete();
        pic20.delete();
        pic21.delete();
        pic22.delete();
        pic23.delete();
        pic24.delete();
        pic25.delete();
        pic26.delete();
        pic27.delete();
        pic28.delete();
        pic29.delete();
        pic30.delete();
        pic31.delete();
        pic32.delete();
        pic33.delete();
        pic34.delete();
        pic35.delete();
        pic36.delete();
        pic38.delete();
        pic39.delete();
        pic40.delete();
        pic41.delete();
        pic42.delete();
        pic43.delete();
        pic44.delete();
        pic45.delete();
        pic46.delete();
        pic47.delete();
        pic48.delete();
        pic49.delete();
        pic50.delete();
        pic51.delete();
        pic52.delete();
        pic53.delete();
        pic54.delete();
        pic55.delete();
        pic56.delete();
        pic57.delete();
        pic58.delete();
        pic59.delete();

        while(!isPressed){
            pic60.draw();
        }
        pic60.delete();
        firstmusic.stopMusic();



    }


    private void setupKeys() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(space);
    }

    @Override
    public void keyPressed(KeyboardEvent event) {
        this.isPressed=true;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}


