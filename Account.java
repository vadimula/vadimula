package sberPack;
import java.util.Date;
public class Account {
    private int id; //идентификатор счета
    private double balance; //остаток, баланс
    private static double annualInterestRate; //годовая процентная ставка
    Date dateCreated; //дата создания счета
    public double monthlyInterest; // ежемесячный процент
    // Конструктор
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    public Account(int _id, double _bal) {
        this.id = _id;
        this.balance = _bal;
        annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    // setter-методы
    public void setId(int id) { this.id = id; }
    public static void setAnnualInterestRate(double ai) { annualInterestRate = ai;}
    public void setBalance(double bl) {this.balance = bl;}
    // Getter-методы
    public int getId() { return id; }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getBalance() { return balance; }
    // methods
    public double getMonthlyInterest() {
        monthlyInterest = balance * (annualInterestRate / 1200) ;
        return monthlyInterest;
    }
    public void withdraw(double sum) { this.balance -= sum; }
    public void deposit(double sum) { this.balance += sum; }
}
