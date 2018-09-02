package com.kosta.exceptions;

public class ProjectionNotFoundException extends Exception {
    public ProjectionNotFoundException() {}
    public ProjectionNotFoundException(String msg) { super(msg); }
    public ProjectionNotFoundException(Throwable cause) { super(cause); }
    public ProjectionNotFoundException(String msg, Throwable cause) { super(msg, cause); }
}
