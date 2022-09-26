import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum=0;
        for(int i=1;i<numWeeks;i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum=0;
        for(double price: prices){
            sum+=price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
            System.out.println(i+" "+menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("\nPlease enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, "+userName);
        System.out.println("There are "+customers.size()+" people in front of you");
        customers.add(userName);
        System.out.println("\nCustomer List:");
        for(String customer : customers){
            System.out.println(customer);
        }
    }
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double sum=price;
        for(int i=0;i<maxQuantity;i++){
            System.out.format((i+1)+" - $%.2f%n",sum);
            sum=(sum+price)-.5;
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        return false;
    }
}
