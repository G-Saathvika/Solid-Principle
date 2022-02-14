package com.notsolid;

class FineTransaction{
    //violates Dependency Inversion Principle
    private CreditCardPayment credit;

    public FineTransaction(CreditCardPayment credit) {
        this.credit = credit;
    }

    public void payFine(double amount){
        credit.doTransaction(amount);
    }
}

