package com.jetbrains;

import com.jetbrains.notifications.*;
import com.jetbrains.payment.*;
import com.jetbrains.utilities.GetDiaryService;
import com.jetbrains.utilities.GetPlumberService;
import com.jetbrains.utilities.GetWatchManService;
import com.jetbrains.utilities.diaryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        //getting home address
        String address;
        House house = new House();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current location: ");
        address =scanner.nextLine();
        house.showHouse(address);


        /*
                utilities function
         */
        System.out.println("Would you like to have any of the below mentioned utilities");
        System.out.println("Please enter your choice");
        int option;
        System.out.println("1.Diary service\n2.Watchman service\n3.Plumber service\n4.None");
        option = scanner.nextInt();
        switch (option){
            case 1:
                    GetDiaryService getDiaryService = new GetDiaryService();
                    getDiaryService.getDiaryService();
                    break;
            case 2:
                    GetWatchManService getWatchManService = new GetWatchManService();
                    getWatchManService.getWatchmanService();
                    break;
            case 3:
                    GetPlumberService getPlumberService = new GetPlumberService();
                    getPlumberService.getPlumberService();
                    break;
            case 4:
                    System.out.println("None of the service have been selected");
                    break;
            default:
                    System.out.printf("Wrong choice");
                    System.out.println();
        }



        //notification service

        System.out.println();
        System.out.println("would you like us to send you remainders of rent payment");
        System.out.println("Choose any one option from the below mentioned methods");
        System.out.println("1.Email\n2.SMS\n3.WhatsApp\n4.None");
        int notifOption;
        notifOption = scanner.nextInt();
        Notificationservice notificationservice;
        switch (notifOption){
            case 1:
                notificationservice  = new EmailNotificationService();
                notificationservice.sendRentRemainder();
                break;
            case 2:
                notificationservice = new MobileNotificationService();
                notificationservice.sendRentRemainder();
                break;
            case 3:
                notificationservice = new WhatsAppNotificationService();
                notificationservice.sendRentRemainder();
                break;
            case 4:
                System.out.println("None selected");
                System.out.println();
                break;
            default:
                System.out.println("we will remind you later.");
                break;
        }
        System.out.println();



         /*
        payment
         DebitCard debitCard=new DebitCard();
         CreditCard creditCard=new CreditCard();
        */
        System.out.println();
        System.out.println("How would you like to do payment....");
        System.out.println("1.Credit Card\n2.Debit Card\nEnter your choice");
        int paymentOption;
        paymentOption = scanner.nextInt();
        BankCard bankCard;
        PayUsing PayUsing;
        switch (paymentOption){
            case 1:
                bankCard  = new CreditCard();
                PayUsing = new PayUsing(bankCard);
                PayUsing.doTransaction(5000);
                break;
            case 2:
                bankCard = new DebitCard();
                PayUsing = new PayUsing(bankCard);
                PayUsing.doTransaction(5000);
                break;

        }

        }
    }

