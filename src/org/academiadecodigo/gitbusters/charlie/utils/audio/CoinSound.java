package org.academiadecodigo.gitbusters.charlie.utils.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class CoinSound {

    File musicPath = new File("resources\\Sound\\coinSound.wav");
    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
    Clip clip = AudioSystem.getClip();

    public CoinSound() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        this.clip.open(audioInput);
    }

    public void playMusic(){

        try{

            if(musicPath.exists()){
                this.clip.start();
                //this.clip.loop(0);


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