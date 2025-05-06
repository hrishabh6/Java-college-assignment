package src;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class SavingsAccount {
    int accountNumber;
    double balance;

    void depositAmount(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter Account Number: ");
        sa.accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        sa.balance = sc.nextDouble();

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        sa.depositAmount(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();

        try {
            sa.withdrawAmount(wd);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
