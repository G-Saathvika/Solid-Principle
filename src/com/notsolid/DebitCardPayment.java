package com.notsolid;

class DebitCardPayment extends Transaction{
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Debit card:");
        System.out.println(amount);
    }
}
