package sberPack;
import java.util.*;
public class clientApp {
    public static void main(String[] args) {
        Account acc001 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        acc001.deposit(3000);
        acc001.withdraw(2500);
        System.out.println("Баланс счета: " + acc001.getBalance());
        System.out.println("Ежемесячные проценты: " + acc001.getMonthlyInterest());
        System.out.println("Дата создания: " + acc001.dateCreated);
    }
}
