import java.util.Objects;
public class Product {
    private String id;
    private String name;
    private double price;
    private  int quantity;
    public static int counter=0;   //used for generating random id

    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //constructor
    public Product(String name,double price, int quantity){
        this.id=String.format("%03d",++counter);
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public Product(String name,double price){
        this(name,price,0);
    }
    public Product(String name){
        this(name,0,0);
    }

    @Override
    public  boolean equals(Object o){
        Product product=(Product)o;
        return Objects.equals(id,product.id);
    }
    @Override
    public String toString() {
        return String.format("Product id : %s \nName : %s\nPrice : %f\nQuantity : %d",id,name, price, quantity);
    }
}
