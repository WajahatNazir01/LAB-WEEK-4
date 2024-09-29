import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Shop {
    private String shopName="CASH AND CARRY";
    private String location="Johar town,Lahore";
    //Person person=new Person("HAMZA SAIF","ranahamzasaif@gmail.com");
    private Person person;
    private Product productList[] = new Product[500];
    private static int productCounter = 0;
    private static double revenue = 0;

    //constructors
    public Shop(String shopName, String location, Person person) {
        this.shopName = shopName;
        this.location = location;
        this.person = new Person("HAMZA SAIF", "ranahamzasaif@gmail.com");
        this.productList = new Product[100];
    }


    //creating a method to display shop info
    public String dislayShopInfo(){
        return String.format("Shopname : %s\nLocation : %s\nOwnername : %s\nEmail :%s\n"
        ,shopName,location,person.getName(),person.getEmail());

    }

    //making different methods for shop
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ADD MENU");
        System.out.println("Enter product name:");
        String name = sc.nextLine();
        System.out.println("Enter product price:");
        double price = sc.nextDouble();
        System.out.println("Enter product's quantity::");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCounter++] = product;
        System.out.println("PRODUCT ADDED!");
    }

    public void sale() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("SALE MENU");
        System.out.println("Enter product ID");
        String id = sc1.nextLine();
        for (int i = 0; i < productCounter; i++) {
            if (productList[i].getId().equals(id) && productList[i].getQuantity() > 0) {
                productList[i].setQuantity((productList[i].getQuantity() - 1));
                revenue += productList[i].getPrice();
                System.out.println("PRODUCT SOLD");
            } else {
                System.out.println("PRODUCT UNAVAILABLE");
            }
            break;
        }
    }

    public void delete() {
        System.out.println("REMOVING PRODUCT MENU");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter product ID");
        String id = sc2.nextLine();
        for (int i = 0; i < productCounter; i++) {
            if (productList[i].getId().equals(id) && productList[i].getQuantity() > 0) {
                productList[i].setQuantity((productList[i].getQuantity() - 1));
                revenue -= productList[i].getPrice();
                System.out.println("PRODUCT REMOVED DUE TO UNDEFINED REASONS");
            } else {
                System.out.println("PRODUCT UNAVAILABLE");
            }
            return;
        }
    }

    public void display() {

        System.out.println("DISPLAY MENU");
        System.out.println("Enter 1 to see all products:");
        System.out.println("Enter 2 to see any specific product:");
        Scanner sc3 = new Scanner(System.in);
        int k = sc3.nextInt();
        switch (k) {
            case 1: {
                for (int i = 0; i < productCounter; i++) {
                    System.out.println("------------------------");
                    System.out.println(productList[i].toString());
                    System.out.println("------------------------");
                }
                break;
            }
            case 2: {
                System.out.println("Enter product ID");
                Scanner sc4=new Scanner(System.in);
                String id = sc4.nextLine();
                for (int i = 0; i < productCounter; i++) {
                    if (productList[i].getId().equals(id)) {
                        System.out.println(productList[i].toString());
                    }else{
                        System.out.println("PRODUCT UNAVAILABLE");
                    }
                    return;
                }
            }
        }
    }           //end of display method

public void update(){
    System.out.println("UPDATING MENU");
    Scanner sc5=new Scanner(System.in);
    System.out.println("Enter product Id:");
    String id=sc5.nextLine();
    for (int i = 0; i < productCounter; i++) {
        if(productList[i].getId().equals(id)){
            Scanner sc6=new Scanner(System.in);
            System.out.println("Enter 1 if you want to update name:");
            System.out.println("Enter 2 if you want to update price:");
            System.out.println("Enter 3 if you want to update quantity:");
            int l=sc6.nextInt();
            switch (l){
                case 1:
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter new name:");
                    productList[i].setName(sc.nextLine());
                    //System.out.println(productList[i]);
                    System.out.println("UPDATED SUCCESSFULLY");
                    break;
                case 2:
                    Scanner sc1= new Scanner(System.in);
                    System.out.println("Enter new price:");
                    productList[i].setPrice(sc1.nextDouble());
                    //System.out.println(productList[i]);
                    System.out.println("UPDATED SUCCESSFULLY");
                    break;
                case 3:
                    Scanner sc3= new Scanner(System.in);
                    System.out.println("Enter new price:");
                    productList[i].setQuantity(sc3.nextInt());
                   // System.out.println(productList[i]);
                    System.out.println("UPDATED SUCCESSFULLY");
                    break;
            }
        }
    }
  }   //end of update method


    public void revenue(){
        System.out.printf("Total revenue is %f",revenue);
    }
}
