public class Customer {
    private String name;
    private double balance;
    public Customer(){
    }
    public Customer(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double cash){
   if(cash<=balance){
       balance-=cash;
   }
   else {
       throw new IllegalArgumentException("You don't have enough money");
   }

    }
}
