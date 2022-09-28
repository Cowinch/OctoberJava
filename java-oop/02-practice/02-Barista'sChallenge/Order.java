import java.util.*;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items= new ArrayList<Item>(); // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name="Guest";
        this.ready=false;
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name=name;
        this.ready=false;
    }

    // ORDER METHODS
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public String getStatusMessage(){
        if(this.ready==true){
            return "Your ready is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double sum=0;
        for(Item i: this.items){
            sum+=i.getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.println("Customer Name: "+this.name);
        for(Item i: this.items){
            System.out.format(i.getName()+" - $%.2f%n",i.getPrice());
        }
        System.out.format("Total: $%.2f%n",getOrderTotal());
    }
    // Most of your code will go here,
    // so implement the getters and setters first!

    // GETTERS
    public String getName(){
        return this.name;
    }
    public String getReady(){
        return this.name;
    }
    public ArrayList<Item> getItem(){
        return  items;
    }
    //SETTERS
    public void setName(String name){
        this.name=name;
    }
    public void setReady(boolean ready){
        this.ready=ready;
    }
    public void setItems(ArrayList<Item> items){
        this.items=items;
    }

}
