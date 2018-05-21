package com.lucasambrosi._14_tema_command.commands;

import com.lucasambrosi._14_tema_command.bank.Bank;

public class WithdrawCommand extends BaseCommand {

    public WithdrawCommand(Bank bank, double amount){
        super(bank, amount);
    }

    @Override
    public double execute() {
        return bank.withdraw(amount);
    }
}
