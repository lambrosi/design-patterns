package com.lucasambrosi._13_tema_chain.request;

public class Request {

    private String message;
    private String type;

    public Request(String message, String type){
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }
}
