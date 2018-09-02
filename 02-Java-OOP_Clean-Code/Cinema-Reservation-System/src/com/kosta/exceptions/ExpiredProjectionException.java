package com.kosta.exceptions;

public class ExpiredProjectionException extends Exception {
    public ExpiredProjectionException() {}
    public ExpiredProjectionException(String msg) { super(msg); }
    public ExpiredProjectionException(Throwable cause) { super(cause); }
    public ExpiredProjectionException(String msg, Throwable cause) { super(msg, cause); }
}
