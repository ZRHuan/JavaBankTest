package banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    //    @Override
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            if (overdraftProtection >= (amt - balance)) {
                overdraftProtection -= (amt - balance);
                balance = 0;
            }else {
                return false;
            }
        }
        return true;
    }

//    public boolean withdraw(double amt) {
//        if(balance >= amt){
//            balance -= amt;
//        }else{
//            if(overdraftProtection >= (amt - balance)){
//                overdraftProtection -= (amt - balance);
//                balance = 0;
//            }else{
//                return false;
//            }
//        }
//
//        return true;
//    }

}
