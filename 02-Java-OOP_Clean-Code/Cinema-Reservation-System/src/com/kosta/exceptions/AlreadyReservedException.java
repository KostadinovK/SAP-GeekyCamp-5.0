package com.kosta.exceptions;

public class AlreadyReservedException extends Exception {
    public AlreadyReservedException() {}
    public AlreadyReservedException(String msg) { super(msg); }
    public AlreadyReservedException(Throwable cause) { super(cause); }
    public AlreadyReservedException(String msg, Throwable cause) { super(msg, cause); }

}
