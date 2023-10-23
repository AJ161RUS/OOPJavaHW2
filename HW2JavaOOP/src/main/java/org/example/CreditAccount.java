package org.example;

public class CreditAccount extends AbstractAccount {

    public CreditAccount(String nameAccount, double balance){
        super(nameAccount, balance);

    }
    public double TakeBalance2(){
        System.out.println("Ввведите сумму для снятия c процентом");
        double take = in.nextDouble();
        take += take*0.01;
        if(take <= balance && take >=0){
            balance=balance - take;
        }else {
            throw new IllegalArgumentException("Неверная сумма");
        }
        return balance;

    }

    @Override
    public double setBalance() {
        return balance;
    }



}
