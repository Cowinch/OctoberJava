public class Item {

    // MEMBER VARIABLES
    private String name;
    private double price;

    // CONSTRUCTOR
    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }
    // Takes a name and price as arguments
    // and sets them accordingly

    // GETTERS
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    // SETTERS
    public void setname(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
