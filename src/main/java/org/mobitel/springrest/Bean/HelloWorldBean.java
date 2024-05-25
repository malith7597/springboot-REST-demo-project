package org.mobitel.springrest.Bean;

public class HelloWorldBean {
    private final String message;

    public String getMessage() {
        return message;
    }

    public HelloWorldBean(String message) {
        this.message= message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
