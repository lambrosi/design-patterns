package com.lucasambrosi._14_tema_command.bank;

public class Bank {

    private double balance;

    public double deposit(double amount){
        if(amount > 0){
            balance += amount;
            return amount;
        }
        return 0;
    }

    public double withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            return amount;
        } else {
            double returnAmount = balance;
            System.out.println("Retirado o valor total da conta de R$" + balance);
            balance = 0;
            return returnAmount;
        }
    }
}
