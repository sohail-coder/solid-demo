package com.jetbrains.notifications;

public class EmailNotificationService implements Notificationservice {


    @Override
    public String sendRentRemainder() {
        System.out.println("Rent Remainder sent using Email");
        return "";

    }

}
