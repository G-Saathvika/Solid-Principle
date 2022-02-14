package com.notsolid;

class CreditCardPayment extends Transaction{
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Credit card:");
        System.out.println(amount);
    }

}