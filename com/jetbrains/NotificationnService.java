package com.jetbrains;

public class NotificationnService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            System.out.println("email sent");
            //write email related logic
            //use JavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //logic
            System.out.println("SMS sent");
        }
//        if()
    }
}
