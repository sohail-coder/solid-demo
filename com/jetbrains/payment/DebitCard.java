package com.jetbrains.payment;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println(amount+" is paid using Debit card");
    }
}
