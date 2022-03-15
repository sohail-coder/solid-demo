package com.jetbrains.payment;

public class PayUsing implements BankCard {
    private BankCard bankCard;

    public PayUsing(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    @Override
    public void doTransaction(long amount) {
        bankCard.doTransaction(amount);
    }
}
