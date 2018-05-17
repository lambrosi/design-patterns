package com.lucasambrosi._13_tema_chain.handler;

import com.lucasambrosi._13_tema_chain.request.Request;

public class EmailNotificationHandler extends NotificationHandler {

    private final static String TYPE = "email";

    public EmailNotificationHandler(NotificationHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getType().equals(TYPE)){
            System.out.println("Email send: " + request.getMessage());
        } else if(nextHandler != null){
            nextHandler.processRequest(request);
        }
    }
}
