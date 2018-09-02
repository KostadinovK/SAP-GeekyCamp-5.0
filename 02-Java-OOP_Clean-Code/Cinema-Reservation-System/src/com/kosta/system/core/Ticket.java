package com.kosta.system.core;

public class Ticket {
    private Projection projection;
    private Seat seat;
    private String owner;

    public Ticket(){}

    public Ticket(Projection p, Seat s, String owner){
        this.projection = p;
        this.seat = s;
        this.owner = owner;
    }

    public Projection getProjection(){
        return this.projection;
    }

    public Seat getSeat(){
        return this.seat;
    }

    public String getOwner(){
        return this.owner;
    }

}
