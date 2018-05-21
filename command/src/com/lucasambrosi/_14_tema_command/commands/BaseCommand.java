package com.lucasambrosi._14_tema_command.commands;

import com.lucasambrosi._14_tema_command.bank.Bank;

public abstract class BaseCommand {

    protected Bank bank;
    protected double amount;

    public BaseCommand(Bank bank, double amount){
        this.bank = bank;
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public abstract double execute();
}
