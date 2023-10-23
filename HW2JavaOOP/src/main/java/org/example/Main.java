package org.example;
/*
1. Создать класс "Счет в банке" - Account.
У этого класса должно быть поле с текущем колличеством средств на счете
У этого класса должно быть 3 метода
* -(put) Пополнить счет - принимает положительное число, увеличивает текущий баланс.
* - (take) Вывести средства - принимает положительное число, уменьшает текущий баланс.
* - (getAccaount) показать баланс - ничего не принимает, возвращает текущий баланс(getter).
*
* 2. Создать несколько наследников
* - Кредитный счет (CreditAccaount)
* Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
* То есть, усли снимем 100 т.е., то снять нужно 101.
*** - Депозитный счет (DepositAccount) ***
* Особенность: нельзя снимать средства чаще, чем раз в месяц
* То есть, нужно завести поле с датой последнего снятия, и использовать его.
* ()
*/

public class Main {
    public static void main(String[] args) {

    String nameAccount = "Андрей Жулай";
    double balance = 1000;

        AbstractAccount account = new AbstractAccount(nameAccount, balance) {
        @Override
        public double setBalance() {
            return balance;
        }
    };
    String accountName = account.getNameAccount();


       System.out.println(accountName);
       System.out.println(account.getBalance());

        System.out.println("--------------");


        System.out.println(account.getNameAccount());
        System.out.println(account.setGetBalance());

        System.out.println("--------------");


        System.out.println(account.TakeBalance());

        System.out.println("--------------");

        balance = account.getBalance();

        CreditAccount credit = new CreditAccount(nameAccount, balance);

        System.out.println(credit.TakeBalance2());






    }
}