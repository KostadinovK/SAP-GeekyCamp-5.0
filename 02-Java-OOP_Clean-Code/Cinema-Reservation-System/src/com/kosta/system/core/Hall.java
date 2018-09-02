package com.kosta.system.core;

public class Hall {
    private int number;
    private int rows;
    private int rowSeats;

    public Hall(){

    }

    public Hall(int number,int rows,int rowSeats){
        this.number = number;
        this.rows = rows;
        this.rowSeats = rowSeats;
    }

    public int getNumber(){
        return this.number;
    }

    public int getRows(){
        return this.rows;
    }

    public int getRowsSeats(){
        return this.rowSeats;
    }
}
