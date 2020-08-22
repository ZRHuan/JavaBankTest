package banking;

/**
 * @author zhangruhuan
 * @create 2020-08-22 12:10
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double money){
        return balance + money;
    }
}
