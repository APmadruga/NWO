package org.academiadecodigo.gitbusters.charlie;
import org.academiadecodigo.gitbusters.charlie.mapobjects.Key;
import org.academiadecodigo.gitbusters.charlie.maps.MapArray;
import org.academiadecodigo.gitbusters.charlie.utils.audio.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException, LineUnavailableException, UnsupportedAudioFileException {

        System.out.println("Welcome to the project");


        //UNCOMMENT FOR REAL GAME
        Menu menu = new Menu();
        menu.start();

        while(true){
            Game g=new Game(MapArray.map1, 200);


            g.init();
            g.start();

            if(g.gameOver){
                GameOver gameover = new GameOver();
                gameover.start();
            } else if(g.gameWon) {
                EndLevel1 gameWon = new EndLevel1();
                gameWon.start();
            }

            g = null;

        }



    }



}



