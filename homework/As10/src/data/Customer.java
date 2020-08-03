/*
Creates a class named Customer in package data.
- Fields ID, name,address,bonus
- No-arg / parametter constructor to initialise the above fields.
- Method
- void accept() : allow user input data into data fields.
Using try-catch exception for validation: ID, name is not null. bonus must be greater than zero and less than 1000.
toString() : return a string presenting all the details of a customer
 */
package data;

import java.util.Scanner;

public class Customer {
    public String ID,name,address;
    public int bonus;

    public Customer() {
    }

    public Customer(String ID, String name, String address, int bonus) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.bonus = bonus;
    }
    
    public void accept(){
        Scanner sc = new Scanner(System.in);
        // nhập id : not null
        while (true) { 
            try {
                System.out.print("Nhap ID: ");
            ID = sc.nextLine().trim();
            if (ID.length()>0) {
                break;
            }
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }
        // nhập tên : not null
        while (true) { 
            try {
                System.out.print("Nhap name: ");
            name = sc.nextLine().trim();
            if (name.length()>=3) {
                break;
            }
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }
        while (true) { 
            try {
                System.out.print("Nhap address: ");
            address = sc.nextLine().trim();
            if (address.length()>=3) {
                break;
            }
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }
        // nhập bonus : 0<bonus<1000
        while (true) { 
            try {
                System.out.print("Nhap bonus [0-1000]: ");
            bonus = Integer.parseInt( sc.nextLine().trim());
            if (bonus>=0 && bonus<=1000) {
                break;
            }
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d",ID,name,address,bonus);
    }
    
    
}
