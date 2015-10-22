package com.github.aparsons.fink.exception;

public class SerializationException extends RuntimeException {

    public SerializationException() {
        super();
    }

    public SerializationException(final String msg) {
        super(msg);
    }

    public SerializationException(final Throwable cause) {
        super(cause);
    }

    public SerializationException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

}
