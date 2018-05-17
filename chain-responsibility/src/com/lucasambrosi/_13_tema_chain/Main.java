package com.lucasambrosi._13_tema_chain;

import com.lucasambrosi._13_tema_chain.handler.*;
import com.lucasambrosi._13_tema_chain.request.Request;

public class Main {

    public static void main(String[] args){

        NotificationHandler emailHandler = new EmailNotificationHandler(null);
        NotificationHandler whatsappHandler = new WhatsappNotificationHandler(emailHandler);
        NotificationHandler smsHandler = new SMSNotificationHandler(whatsappHandler);

        Request request = new Request("Você tem novas mensagens!", "email");
        smsHandler.processRequest(request);
    }
}
