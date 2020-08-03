package product;
import java.util.Scanner;
import sale.*;
public class Item implements IDiscount{
    public String name;
    public int price, quantity;
    
    @Override
    public void displayDetails() {
        System.out.println("Name : "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total: "+quantity*price);
    }
     void Input(){
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter name : ");
                name = sc.nextLine().trim();
                if (name.length() > 0) {
                    break;
                }
                System.out.println("Name is not NULL !!!");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        try {
            while (true) {                
                System.out.print("Enter price: ");
                price = Integer.parseInt(sc.nextLine().trim());
                if (price>0) {
                    break;
                }
                System.out.println("Price > 0");
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        try {
            while (true) {                
                System.out.print("Enter quantity: ");
                quantity = Integer.parseInt(sc.nextLine().trim());
                if (quantity>0) {
                    break;
                }
                System.out.println("Quantity > 0");
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
