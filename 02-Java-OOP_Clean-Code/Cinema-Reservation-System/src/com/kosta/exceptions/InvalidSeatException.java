package com.kosta.exceptions;

public class InvalidSeatException extends Exception {
    public InvalidSeatException() {}
    public InvalidSeatException(String msg) { super(msg); }
    public InvalidSeatException(Throwable cause) { super(cause); }
    public InvalidSeatException(String msg, Throwable cause) { super(msg, cause); }
}
