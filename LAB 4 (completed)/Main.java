import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Shop shop=new Shop("CASH AND CARRY","johar town,lahore",new Person("HAMZA SAIF","ranahamzasaif@gmail.com"));

    System.out.println( shop.dislayShopInfo());
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 to add product:");
            System.out.println("Enter 2 to sale product:");
            System.out.println("Enter 3 to remove any product:");
            System.out.println("Enter 4 to display products:");
            System.out.println("Enter 5 to update products:");
            System.out.println("Enter 6 to check revenue:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    shop.add();
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
                case 5:
                    shop.update();
                    break;
                case 6:
                    shop.revenue();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}