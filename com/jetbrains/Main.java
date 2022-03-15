package com.jetbrains;

import com.jetbrains.notifications.*;
import com.jetbrains.payment.*;
import com.jetbrains.utilities.GetDiaryService;
import com.jetbrains.utilities.GetPlumberService;
import com.jetbrains.utilities.GetWatchManService;
import com.jetbrains.utilities.diaryService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        //getting home address
        String address;
        House house = new House();
        house.addHome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current location: ");
        address =scanner.nextLine();
        int cost = house.showHouse(address);


        /*
                utilities function
         */
        System.out.println("Would you like to have any of the below mentioned utilities");
        System.out.println("Please enter your choice");

        System.out.println("1.Diary service\n2.Watchman service\n3.Plumber service\n4.None");
        String optionsUtilities;
        int value;
//        scanner.nextLine();
        optionsUtilities = scanner.nextLine();
        if(optionsUtilities.length()>0 && optionsUtilities.contains("4")){
            System.out.printf("Wrong option chosen we will remind you later");
        }
        else{
            for(int i=0;i<optionsUtilities.length();i++){
                if(i%2==0){
                    value = Integer.parseInt(optionsUtilities.charAt(i)+"");
                    switch (value){
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


                }
            }
        }



        //notification service

        System.out.println();
        System.out.println("would you like us to send you remainders of rent payment");
        System.out.println("Choose any one option from the below mentioned methods");
        System.out.println("1.Email\n2.SMS\n3.WhatsApp\n4.None");
        String optionsNotifications;
        int val;
//        scanner.nextLine();
        optionsNotifications = scanner.nextLine();
        if(optionsNotifications.length()>0 && optionsNotifications.contains("4")){
            System.out.printf("Wrong option chosen we will remind you later");
        }
        else{
            Notificationservice notificationservice;
            for(int i=0;i<optionsNotifications.length();i++){
                if(i%2==0){
                    val =Integer.parseInt(optionsNotifications.charAt(i)+"");
                    switch (val){
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
                }
            }
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
                PayUsing.doTransaction(cost);
                break;
            case 2:
                bankCard = new DebitCard();
                PayUsing = new PayUsing(bankCard);
                PayUsing.doTransaction(cost);
                break;

        }
        System.out.println("\n\n\n\t\tThank you for using our application\n\n\n");
        }
    }

