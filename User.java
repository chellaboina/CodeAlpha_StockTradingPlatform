import java.util.HashMap;

public class User {

    private String name;
    private double balance;
    private HashMap<String,Integer> portfolio;

    public User(String name,double balance) {
        this.name=name;
        this.balance=balance;
        portfolio=new HashMap<>();
    }

    public double getBalance() {
        return balance;
    }

    public void buyStock(String stock,int quantity,double price) {

        double total=quantity*price;

        if(balance>=total) {

            balance-=total;

            portfolio.put(stock,
            portfolio.getOrDefault(stock,0)+quantity);

            System.out.println("Stock Purchased Successfully");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showPortfolio() {

        System.out.println("\nPortfolio");

        for(String stock:portfolio.keySet()) {

            System.out.println(stock+
            " : "+portfolio.get(stock)+" shares");
        }

        System.out.println("Remaining Balance: "+balance);
    }
}
