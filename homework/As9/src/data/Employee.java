/*
Creates an abstract class named Employee in package data.
- Private Fields [ID, name]: string, [workedDays, salary]: int
- Constructors to initialize the above fields.
- Method:
- Proctected void accept() : allow user input data into data fields.
validation: ID, name is not null, workedDays, salary > 0.
ID is not duplicate.
- Public abtract void printInfo() : used to print the pay slip of any employee.
 */
package data;

import java.util.Scanner;

public abstract class Employee {
    private String ID, name;
    int workedDay;
    int salary;

    public Employee() {
    }

    public Employee(String ID, String name, int workedDay, int salary) {
        this.ID = ID;
        this.name = name;
        this.workedDay = workedDay;
        this.salary = salary;
    }
    protected void accept(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.print("Nhap ID"); ID= sc.nextLine().trim();
            if (ID.length()>0) {
                break;
            }
        }
        while (true) {            
            System.out.print("Nhap name"); name= sc.nextLine().trim();
            if (name.length()>0) {
                break;
            }
        }
        while (true) {            
            try {
                System.out.print("Nhap workedDay: ");
                workedDay = Integer.parseInt(sc.nextLine().trim());
                if (workedDay>0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi : "+e.getMessage());
            }
        }
        while (true) {            
            try {
                System.out.print("Nhap salary: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary>0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi: "+e.getMessage());
            }
        }
    }
    
    public abstract void printInfo();
}
