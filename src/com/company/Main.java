package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();
        account.deposit(20000);

        while (true){
            System.out.println("Current balance: "+account.getAmount());
            System.out.println("Enter amount:");
            int requestCount = scanner.nextInt();
            try {
                account.withDraw(requestCount);
            }
            catch (LimitException e) {
                System.out.println(e.getMessage()+e.getRemainingAmount());
                if (account.getAmount() > 0){
                    System.out.println("Withdrawal: "+e.getRemainingAmount());
                    System.out.println(+e.getRemainingAmount() - account.amount);
                }
                break;
            }
        }
    }
}
