package com.kosta.core;

import com.kosta.exceptions.InvalidNumberException;

public class Number {

    private int value;
    private int cows;
    private int bulls;
    private boolean isValid;

    public Number() {
    }

    public Number(int num) throws InvalidNumberException {
        if (checkIfIsValid(num)) {
            this.value = num;
            this.cows = 0;
            this.bulls = 0;
            this.isValid = true;
        } else {
            throw new InvalidNumberException("This is an invalid number!");
        }
    }


    public int getValue() {
        return this.value;
    }

    public int getCows() {
        return this.cows;
    }

    public int getBulls() {
        return this.bulls;
    }

    public boolean getValidState() {
        return this.isValid;
    }

    public void addCow() {
        this.cows++;
    }

    public void addBull() {
        this.bulls++;
    }

    public boolean checkIfIsValid(int num) {
        String numStr = "" + num;
        if (numStr.length() != 4) {
            return false;
        }
        boolean[] digs = new boolean[10];
        while (num > 0) {
            if (digs[num % 10]) return false;
            digs[num % 10] = true;
            num /= 10;
        }
        return true;

    }

}
