package org.academiadecodigo.gitbusters.charlie.utils.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class GameOverMusic {

    File musicPath = new File("resources\\Sound\\Game Over With Voice.wav");
    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
    Clip clip = AudioSystem.getClip();

    public GameOverMusic() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
    }

    public void playMusic(){

        try{

            if(musicPath.exists()){
                this.clip.open(audioInput);
                this.clip.loop(Clip.LOOP_CONTINUOUSLY);


            } else {

                System.out.println("Cant find file");

            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public void stopMusic(){
        this.clip.stop();
    }


}
