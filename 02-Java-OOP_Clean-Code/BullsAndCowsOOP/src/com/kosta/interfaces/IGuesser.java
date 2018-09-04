package com.kosta.interfaces;

import com.kosta.core.Number;
import com.kosta.exceptions.InvalidNumberException;

import java.util.Scanner;

public interface IGuesser {
    void makeGuess(Scanner sc);

    void surrender();
}
