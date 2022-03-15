package com.jetbrains.notifications;

public class MobileNotificationService implements Notificationservice {

    @Override
    public void sendRentRemainder() {
        System.out.println("Rent Notification sent using SMS");
    }
}
