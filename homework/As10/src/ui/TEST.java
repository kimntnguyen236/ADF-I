/*
Create main class TEST in package ui that allows user to manage the customers accepted into system through the menu system as follows:
1. Add a new customer
2. Search customers by name
3. Display
 */
package ui;
import data.*;
import java.util.Scanner;
public class TEST {

    public static void main(String[] args) {
        CustomerCatalog cc = new CustomerCatalog();
        while (true) {            
            Scanner sc = new Scanner(System.in);
            String op = " ";
            System.out.println(">>> MENU <<<");
            System.out.println("1. Add a new customer ");
            System.out.println("2. Search customers by name ");
            System.out.println("3. Display ");
            System.out.println("4. Exit");
            System.out.print("Choose [1-4]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1": cc.add(); break;
                case "2": 
                    String name;
                    System.out.println("Nhap ten nhan vien ban muon tim kiem: "); name = sc.nextLine().trim();
                    cc.searchByName(name);break;
                case "3": cc.displayAll();break;
                case "4": return;
            }
            
        }
    }
    
}
