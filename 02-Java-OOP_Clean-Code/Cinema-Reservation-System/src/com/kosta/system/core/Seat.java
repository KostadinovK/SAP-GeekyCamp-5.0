package com.kosta.system.core;

public class Seat {
    private int row;
    private int seat;

    public Seat(){

    }

    public Seat(int row, int seat){
        this.row = row;
        this.seat = seat;
    }

    public int getRow(){
        return this.row;
    }

    public int getSeat(){
        return this.seat;
    }
}
