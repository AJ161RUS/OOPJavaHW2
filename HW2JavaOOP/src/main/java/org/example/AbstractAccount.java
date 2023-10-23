package org.example;

import java.util.Scanner;

public abstract class AbstractAccount implements HasBalance{

protected String nameAccount;
protected double balance;
Scanner in = new Scanner(System.in);
public  AbstractAccount(String nameAccount, double balance){
    this.nameAccount=nameAccount;
    this.balance=balance;
    setNameAccount(nameAccount);
    setBalance(balance);

    }
    public void setNameAccount(String nameAccount) {

    this.nameAccount = nameAccount;
    }
    public String getNameAccount(){
    return nameAccount;
}
    public void setBalance(double balance){
    this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }



    public double setGetBalance() {
        System.out.println("Введите сумму для пополнения счета: ");
        double put = in.nextDouble();
        if ( put >= 0){
            balance= balance + put;
        }else{
            throw new IllegalArgumentException("Неверная сумма");
        }
        return balance;
    }

    public double TakeBalance(){
        System.out.println("Ввведите сумму для снятия");
        double take = in.nextDouble();
        if(take <=balance && take >=0){
            balance=balance - take;
        }else {
            throw new IllegalArgumentException("Неверная сумма");
        }
return balance;
}



}









