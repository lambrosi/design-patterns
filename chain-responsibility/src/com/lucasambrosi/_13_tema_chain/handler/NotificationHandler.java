package com.lucasambrosi._13_tema_chain.handler;

import com.lucasambrosi._13_tema_chain.request.Request;

public abstract class NotificationHandler {

    protected NotificationHandler nextHandler;

    public NotificationHandler(NotificationHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void processRequest(Request request);
}
