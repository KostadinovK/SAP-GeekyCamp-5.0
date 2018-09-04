package com.kosta;

import com.kosta.core.Computer;
import com.kosta.core.Engine;
import com.kosta.core.Guesser;

public class Main {
    public static void main(String [] args){
        Guesser player = new Guesser();
        Computer computer = new Computer();
        Engine e = new Engine(player,computer);

        e.drawIntro();
        e.gameLoop();

    }

}
