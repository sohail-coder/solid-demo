package com.jetbrains.payment;

public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println(amount+" is paid using Credit card");
    }
}
