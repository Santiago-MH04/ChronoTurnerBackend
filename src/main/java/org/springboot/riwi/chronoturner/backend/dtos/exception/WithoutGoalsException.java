package org.springboot.riwi.chronoturner.backend.dtos.exception;

public class WithoutGoalsException extends  RuntimeException{
    public WithoutGoalsException(String  message) {
        super(message);
    }
}
