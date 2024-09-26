import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shop shop= new Shop(new Person("John", "email"),"Lahore");
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter 1 to add product:");
            System.out.println("Enter 2 to sale product:");
            System.out.println("Enter 3 to remove product:");
            System.out.println("Enter 4 to display product:");
            System.out.println("Enter 5 to update product");
                    int choice= sc.nextInt();
                    switch (choice) {
                        case 1:
                            shop.addProduct();
                            break;
                        case 2:
                            shop.sale();
                            break;
                        case 3:
                            shop.delete();
                            break;
                        case 4:
                            shop.display();
                            break;
                        case 5 :
                            shop.update();
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                    }
                }
            }
        }
