package com.lld.lowleveldesign.exception;

/**
 * @author nevinsunny
 * date 24/03/24
 * time 3:28 pm
 */
public class AppException extends Exception{
    public AppException() {
        super("App Exception");
    }

    public AppException(String message) {
        super(message);
    }
}
