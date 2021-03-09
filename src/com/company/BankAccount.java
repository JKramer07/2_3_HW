package com.company;

public class BankAccount {
    LimitException limit = new LimitException("Limit");

    double amount;

    public double getAmount(){
        return amount;
    }
    public double deposit(double sum){
        return sum;
    }
    public int withDraw(int sum) throws LimitException {

        if (sum < 6000){
            throw new LimitException("Not enough money!");
        }
        return sum;

    }
}
