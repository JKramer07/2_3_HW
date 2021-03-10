package com.company;

public class BankAccount {

    double amount;

    public double getAmount(){
        return amount;
    }
    public double deposit(double sum){
        amount += sum;
        return amount;
    }
    public double withDraw(int sum) throws LimitException {
        if(sum <= amount){
            amount -= sum;
        } else if (amount < sum){
            throw new LimitException("Not enough money! Current balance: ", amount);
        }
        return amount;

    }
}
