package product;

import java.util.Scanner;
import sale.*;
public class Test extends Invoice{
     public void menu() {
         Scanner read = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Create New Item");
            System.out.println("2. Search and display Item");
            System.out.println("3. Exit");
            System.out.print("Choose [1-3]: ");
            
            input = read.nextLine();
            switch (input) {
                case "1":
                    addItem();
                    break;
                case "2":
                    System.out.print("Enter name: ");
                    String search = read.nextLine();
                    searchItem(search);
                    break;
                case "3": return;
            }
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.menu();
    }
    
}
