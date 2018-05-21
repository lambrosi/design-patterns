package com.lucasambrosi._14_tema_command;

import com.lucasambrosi._14_tema_command.bank.Bank;
import com.lucasambrosi._14_tema_command.bank.BankController;
import com.lucasambrosi._14_tema_command.commands.DepositCommand;
import com.lucasambrosi._14_tema_command.commands.WithdrawCommand;

public class Main {

    public static void main(String[] args){

        Bank bank = new Bank();
        DepositCommand depositCommand = new DepositCommand(bank, 40);
        WithdrawCommand withdrawCommand = new WithdrawCommand(bank, 30);

        BankController controller = new BankController();
        controller.execute(depositCommand);
        controller.execute(withdrawCommand);

        depositCommand = new DepositCommand(bank, 50);
        controller.execute(depositCommand);

        controller.getBalance();
    }
}
