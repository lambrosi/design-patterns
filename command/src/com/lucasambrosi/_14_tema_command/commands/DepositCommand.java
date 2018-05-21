package com.lucasambrosi._14_tema_command.commands;

import com.lucasambrosi._14_tema_command.bank.Bank;

public class DepositCommand extends BaseCommand {

    public DepositCommand(Bank bank, double amount){
        super(bank, amount);
    }

    @Override
    public double execute() {
        return bank.deposit(amount);
    }
}
