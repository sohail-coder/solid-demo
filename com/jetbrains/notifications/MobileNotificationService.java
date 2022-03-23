package com.jetbrains.notifications;

public class MobileNotificationService implements Notificationservice {

    @Override
    public String sendRentRemainder() {
        System.out.println("Rent Notification sent using SMS");
        return "";
    }
}
