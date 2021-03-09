package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        BankAccount account = new BankAccount();
        System.out.println("Your deposit: "+account.deposit(20000));

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


            try {
                for (int i = 20000; i > 0; i=i-count){
                    System.out.println(i);
                    System.out.println("Withdrawing: "+account.withDraw(scanner.nextInt()));
                    if (i < 6000) break;
                }
            }
            catch (LimitException e) {
                System.out.println(e.getMessage());
            }
    }
}
