package com.kosta.exceptions;

public class ReservationNotFoundException extends Exception {
    public ReservationNotFoundException() {}
    public ReservationNotFoundException(String msg) { super(msg); }
    public ReservationNotFoundException(Throwable cause) { super(cause); }
    public ReservationNotFoundException(String msg, Throwable cause) { super(msg, cause); }
}
