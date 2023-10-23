package org.example;

import java.util.Scanner;

public class FixedAmountAccount {
    protected double balance;
    Scanner in = new Scanner(System.in);
    public void TakeBalance(){
        System.out.println("Ввведите сумму для снятия");
        double take = in.nextDouble();
        if(take <=balance && take >=0){
            balance=balance - take;
        }else {
            throw new IllegalArgumentException("Неверная сумма");
        }
    }
    public void setGetBalance() {
        System.out.println("Введите сумму для пополнения счета: ");
        double put = in.nextDouble();
        if ( put >= 0){
            balance= balance + put;
        }else{
            throw new IllegalArgumentException("Неверная сумма");
        }
    }
}
