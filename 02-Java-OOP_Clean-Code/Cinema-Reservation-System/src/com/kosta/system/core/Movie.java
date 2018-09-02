package com.kosta.system.core;

import com.kosta.enums.MovieGenre;

public class Movie {
    private String name;
    private int duration;
    private MovieGenre genre;

    public Movie(){

    }

    public Movie(String name,int duration, MovieGenre genre){
        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }

    public int getDuration(){
        return this.duration;
    }

    public MovieGenre getMovieGenre(){
        return this.genre;
    }
}
