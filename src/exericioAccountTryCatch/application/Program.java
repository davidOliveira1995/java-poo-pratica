package exericioAccountTryCatch.application;

import exericioAccountTryCatch.entities.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();

        System.out.print("Holder: ");
        String holder = scan.next();

        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = scan.nextDouble();

        System.out.println();

        try {
            System.out.print("Enter amount for withdraw: ");
            double amount = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a number.");
            scan.next(); // limpa o scanner
        }


        Account acc = new Account(number, withdrawLimit, balance, holder);

        double amount = 0.0;
        try {
            acc.withdraw(amount);
            System.out.println("Withdrawal successful!");
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        System.out.println("Balance: $" + acc.getBalance());
    }
}
