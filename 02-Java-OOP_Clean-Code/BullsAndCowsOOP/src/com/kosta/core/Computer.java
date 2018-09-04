package com.kosta.core;

import com.kosta.exceptions.InvalidNumberException;
import com.kosta.interfaces.IComputer;

import java.util.Random;

public class Computer implements IComputer {
    private Number number;

    public Computer() {

    }

    public Computer(int num) {
        try {
            Number n = new Number(num);
            this.number = n;
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }


    }

    public Number getNumber() {
        return this.number;
    }

    @Override
    public void generateNumber() {
        Random gen = new Random();
        int num = 0;
        while (hasDupes(num = (gen.nextInt(9000) + 1000))) ;
        try {
            Number n = new Number(num);
            this.number = n;
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean hasDupes(int num) {
        boolean[] digs = new boolean[10];
        while (num > 0) {
            if (digs[num % 10]) return true;
            digs[num % 10] = true;
            num /= 10;
        }
        return false;
    }

}
