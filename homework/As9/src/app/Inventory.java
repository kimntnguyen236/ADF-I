/*
Create main class Inventory in package Application that allows user to manage the televisons accepted into system through the menu system as follows:
1. Add a new television
2. Search televisions by brand
3. Display all televisions
4. Display high-valued televisions
5. Exit
 */
package app;
import Electronics.*;
import java.util.Scanner;
public class Inventory {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        TelevisionCatalog o = new TelevisionCatalog();
        
        //menu
        while (true) {            
            System.out.println("\n\n == MENU ==");
            System.out.println("1. Them tivi");
            System.out.println("2. In ds tivi");
            System.out.println("3. Tim tivi theo thuong hieu");
            System.out.println("4. Tim tivi co don gia >= 500");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang (1-5): ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1" : o.add(); break;
                case "2" : o.displayAll(); break;
                case "3" : System.out.println("\n >>> Nhap ten thuong hieu : ");
                o.searchByBrand(sc.nextLine().trim());
                break;
                case "4": o.displayHighValue();break;
                case "5": return;
            }
        }
    }
    
}
