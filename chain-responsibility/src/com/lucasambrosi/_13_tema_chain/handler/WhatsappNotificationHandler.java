package com.lucasambrosi._13_tema_chain.handler;

import com.lucasambrosi._13_tema_chain.request.Request;

public class WhatsappNotificationHandler extends NotificationHandler {

    private final static String TYPE = "whatsapp";

    public WhatsappNotificationHandler(NotificationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getType().equals(TYPE)){
            System.out.println("WhatsApp send: " + request.getMessage());
        } else if(nextHandler != null){
            nextHandler.processRequest(request);
        }
    }
}
