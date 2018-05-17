package com.lucasambrosi._13_tema_chain.handler;

import com.lucasambrosi._13_tema_chain.request.Request;

public class SMSNotificationHandler extends NotificationHandler {

    private final static String TYPE = "sms";

    public SMSNotificationHandler(NotificationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getType().equals(TYPE)){
            System.out.println("SMS send: " + request.getMessage());
        } else if(nextHandler != null){
            nextHandler.processRequest(request);
        }
    }
}
