/*
Create abstract class Student in basic package that stores the following details:
- Protected Fields: id, name, yob(year of birth)
- Constructors to initialise the all fields.
- Methods:
public abstract void print()
public void input (): input data for a student with following constraints:
• ID, name is not null
• Age must be between 15 and 60
 */
package basic;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Student {

    protected String id, name;
    protected int yob;

    public Student() {
    }

    public Student(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public abstract void print();

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap id: ");
            id = sc.nextLine().trim();
            if (id.length() > 0) {
                break;
            }
        }
        while (true) {
            System.out.print("Nhap ten: ");
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;
            }
        }
        while (true) {
            try {
                Calendar calendar = Calendar.getInstance();
                System.out.print("Nhap nam sinh (1960-2004): ");
                yob = Integer.parseInt(sc.nextLine().trim());
                if (calendar.get(Calendar.YEAR) - yob >= 15 && calendar.get(Calendar.YEAR) - yob <= 60) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }

        }
    }
     

}
