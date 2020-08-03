/*
Fields ID, name, yob
- Default constructor to initialize the above fields.
- Method
- public void accept() : allow user input data into data fields.
Using try-catch exception for validation: ID, name not null- yob must be in range [1940-2000] .
- public abtract void printInfo() : print details of an person.
 */
package data;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public abstract class Person {

    public String ID, name;
    public int yob;

    public Person() {
    }

    public Person(String ID, String name, int yob) {
        this.ID = ID;
        this.name = name;
        this.yob = yob;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Nhap ID: ");
                ID = sc.nextLine().trim();
                if (ID.length() > 0) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi : "+e.getMessage());
        }
        try {
            while (true) {                
                System.out.print("Nhap ten: ");
                name = sc.nextLine().trim();
                if (name.length()>0) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi: "+e.getMessage());
        }
        try {
            while (true) {                
                System.out.print("Nhap yob [1940-2000]: ");
                yob = Integer.parseInt(sc.nextLine().trim());
                if (yob>=1940 && yob <= 2000) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi: "+e.getMessage());
        }
    }
    public abstract void printInfo();
}
