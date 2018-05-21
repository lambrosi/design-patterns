package com.lucasambrosi._14_tema_command.bank;

import com.lucasambrosi._14_tema_command.commands.BaseCommand;
import com.lucasambrosi._14_tema_command.commands.DepositCommand;

import java.util.*;

public class BankController {

    private static List<BaseCommand> commandHistory;

    public BankController(){
        commandHistory = new ArrayList<>();
    }

    public void execute(BaseCommand operation){
        operation.execute();
        commandHistory.add(operation);
    }

    public void getBalance(){
        double balance = 0;
        System.out.println("===Historico da conta===");
        for(BaseCommand command : commandHistory){
            if(command instanceof DepositCommand){
                System.out.println("Deposito: R$ " + command.getAmount());
                balance += command.getAmount();
            } else{
                System.out.println("Saque...: R$ " + command.getAmount());
                balance -= command.getAmount();
            }
        }
        System.out.println("-----------------------\nSaldo atual: R$ " + balance);
    }
}
