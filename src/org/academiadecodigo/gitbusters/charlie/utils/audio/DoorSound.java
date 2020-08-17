package org.academiadecodigo.gitbusters.charlie.utils.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class DoorSound {

    private File musicPath = new File("resources\\Sound\\doorSound.wav");
    private AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
    private Clip clip = AudioSystem.getClip();

    public DoorSound() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        this.clip.open(audioInput);
    }

    public void playMusic(){

        try{

            if(musicPath.exists()){

                this.clip.start();

            } else {

                System.out.println("Cant find file");

            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public void stopMusic() {
        this.clip.stop();
    }

}