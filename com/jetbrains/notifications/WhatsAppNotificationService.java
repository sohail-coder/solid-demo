package com.jetbrains.notifications;

public class WhatsAppNotificationService implements Notificationservice {
//    @Override
//    public void sendOTP() {
//        //logic
//        System.out.println("otp sent using WhatsApp");
//    }

    @Override
    public String  sendRentRemainder() {
        System.out.println("Rent Notification sent using WhatsApp");
        return "";
    }
}
