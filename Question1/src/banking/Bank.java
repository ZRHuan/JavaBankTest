package banking;

public class Bank {
    private Customer[] customers = new Customer[5];
    private int numberOfCustomer = 0;


    public void addCustomer(String firstName,String lastName){
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomer] = customer;
        numberOfCustomer ++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomer;
    }

    public Bank() {

    }
    public Customer getCustomer(int i){
        return customers[i];
    }
}
