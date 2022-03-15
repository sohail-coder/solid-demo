package com.jetbrains.notifications;

import com.jetbrains.payment.BankCard;

public class SendNotification implements Notificationservice{
    private Notificationservice notificationservice;

 public SendNotification(Notificationservice notificationservice){
     this.notificationservice=notificationservice;
 }


    @Override
    public void sendRentRemainder() {
    notificationservice.sendRentRemainder();
    }
}
