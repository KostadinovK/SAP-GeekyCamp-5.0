package com.kosta.system.core;

import java.time.LocalDateTime;

public class Projection {
    private Movie movie;
    private Hall hall;
    private LocalDateTime date;

    public Projection(){

    }

    public Projection(Movie movie, Hall hall, LocalDateTime date){
        this.movie = movie;
        this.hall = hall;
        this.date = date;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public Hall getHall(){
        return this.hall;
    }

    public LocalDateTime getDate(){
        return this.date;
    }
}
