package com.kosta.main;

import com.kosta.system.core.Ticket;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Ticket> tickets;


    public Person(){}
    public Person(String name){
        this.name = name;
        tickets = new ArrayList<Ticket>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Ticket> getTickets(){
        return this.getTickets();
    }
}
