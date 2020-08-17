package org.academiadecodigo.gitbusters.charlie.utils.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class GameMusic {


    private File musicPath = new File("resources\\Sound\\something.wav");
    private AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
    private Clip clip = AudioSystem.getClip();


    public GameMusic() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
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
