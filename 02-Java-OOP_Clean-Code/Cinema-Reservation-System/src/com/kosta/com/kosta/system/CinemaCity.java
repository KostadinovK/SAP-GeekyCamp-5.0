package com.kosta.com.kosta.system;

import com.kosta.exceptions.*;
import com.kosta.system.core.Movie;
import com.kosta.system.core.Projection;
import com.kosta.system.core.Ticket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CinemaCity implements CinemaReservationSystem {

    private HashMap<Movie, ArrayList<Projection>> cinemaProgram;

    public CinemaCity(){}

    public CinemaCity(HashMap<Movie, ArrayList<Projection>> cinemaProgram){
        this.cinemaProgram = cinemaProgram;
    }

    public HashMap<Movie, ArrayList<Projection>> getCinemaProgram(){
        return this.cinemaProgram;
    }


    @Override
    public void bookTicket(Ticket ticket) throws AlreadyReservedException, ProjectionNotFoundException, InvalidSeatException, ExpiredProjectionException {
        
    }

    @Override
    public void cancelTicket(Ticket ticket) throws ReservationNotFoundException, ProjectionNotFoundException {

    }

    @Override
    public int getFreeSeats(Projection projection) throws ProjectionNotFoundException {
        return 0;
    }

    @Override
    public Collection<Movie> getSortedMoviesByGenre() {
        return null;
    }
}
