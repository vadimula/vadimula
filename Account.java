package sberPack;
import java.util.Date;
public class Account {
    int id; //идентификатор счета
    double balance; //остаток, баланс
    double annualInterestRate; //годовая процентная ставка
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
        id = _id;
        balance = _bal;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    // setter-методы
    public void setId(int id) { this.id = id; }
    public void setAnnualInterestRate(double ai) { this.annualInterestRate = ai;}
    public void setBalance(double bl) {this.balance = bl;}
    // Getter-методы
    public int getId() { return id; }
    public double getAnnualInterestRate() {

        return annualInterestRate; }
    public double getBalance() { return balance; }
    // methods
    public double getMonthlyInterest() {
        monthlyInterest = balance * annualInterestRate / 12;
        return monthlyInterest;
    }
    public void withdraw() {}
    public void deposit() {}
}
