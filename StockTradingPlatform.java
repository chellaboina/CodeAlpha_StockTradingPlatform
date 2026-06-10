import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Stock apple=new Stock("APPLE",150);
        Stock tesla=new Stock("TESLA",200);

        User user=new User("Mahima",10000);

        int choice;

        do {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");

            System.out.println("1. View Stocks");
            System.out.println("2. Buy Apple");
            System.out.println("3. Buy Tesla");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            choice=sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("APPLE : ₹150");
                    System.out.println("TESLA : ₹200");

                    break;

                case 2:

                    System.out.print("Enter Quantity : ");

                    int qty1=sc.nextInt();

                    user.buyStock(
                    apple.getStockName(),
                    qty1,
                    apple.getPrice());

                    break;

                case 3:

                    System.out.print("Enter Quantity : ");

                    int qty2=sc.nextInt();

                    user.buyStock(
                    tesla.getStockName(),
                    qty2,
                    tesla.getPrice());

                    break;

                case 4:

                    user.showPortfolio();

                    break;

                case 5:

                    System.out.println("Thank You");

                    break;
            }

        } while(choice!=5);

        sc.close();
    }
}
