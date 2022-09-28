public class TestOrders {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
    
        Order order3=new Order("Sam");
        Order order4=new Order("Noah");
        Order order5=new Order("Jimmy");
    
        Item item1= new Item("drip coffee",1.50);
        Item item2= new Item("capuccino",3.50);
        Item item3= new Item("latte",4.50);
    
        order1.addItem(item1);
        order1.addItem(item3);

        order3.addItem(item3);
        order4.addItem(item2);
        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();
    }
}
