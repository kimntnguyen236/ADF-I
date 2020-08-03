/*
Fields : salary, workedDays, position
- Constructors to initialize the all fields
- Override methods:
- accept() : allow user to input additional details for an employee:
invoke method accept() of super class.
using try-catch exception for validation: salary belongs to [200-10000], salary belongs to [0-27].
- printInfo() : display details of an employee including id, name, age, position, salary, worked days, income (salary* worked days/26)
- toString() : return a string presenting all the details of a employee.
 */
package data;

import java.time.Year;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class Employee extends Person {

    public int salary, workedDays;
    public String position;

    public Employee() {
    }

    public Employee(int salary, int workedDay, String position, String ID, String name, int yob) {
        super(ID, name, yob);
        this.salary = salary;
        this.workedDays = workedDay;
        this.position = position;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept();
        try {
            while (true) {
                System.out.print("Nhap salary [200-10000]: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary >= 200 && salary <= 10000) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi: "+e.getMessage());
        }
        
        try {
            while (true) {                
                System.out.print("Nhap workedDays: ");
                workedDays = Integer.parseInt(sc.nextLine().trim());
                if (workedDays>=0 && workedDays<=27) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi : "+ e.getMessage());
        }
        System.out.print("Nhap position: ");
        position = sc.nextLine().trim();
    }

    @Override
    public void printInfo() {
        System.out.println("Id : "+ ID);
        System.out.println("Name: "+name);
        System.out.println("Age: "+ (Year.now().getValue()-yob));
        System.out.println("Position: "+position);
        System.out.println("Salary: "+ salary);
        System.out.println("WorkedDays: "+ workedDays);
        System.out.println("Income: "+(salary*workedDays/26));
    }

    @Override
    public String toString() {
        return "\nID: " + ID + "\n" +
            "Ten: " + name + "\n" +
            "Tuoi: " + (Year.now().getValue()-yob) + "\n" +
            "Luong: " + salary + "\n" +
            "So ngay lam: " + workedDays + "\n" + 
            "Thu nhap: " + (salary*workedDays/26) + "\n";
    }
    
    

}
