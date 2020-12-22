package com.example.frameworkstudy.exception;

public class AuthorityException extends RuntimeException {

    public AuthorityException() {
        super();
    }

    public AuthorityException(String msg) {
        super(msg);
    }

    public AuthorityException(Throwable cause, String msg) {
        super(msg, cause);
    }
}
