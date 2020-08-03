/*
Fields : id, name, gender(boolean), theory[0-100], practice [0-100]
    ii. Constructors: no-arg constructor , parameterize constructor
    iii. Methods:
        1. private void input() : nhập thông tin sinh viên, được gọi trong hàm dựng không tham số
        2. public void print() : xuất thông tin sinh viên
        3. public String toString(): biểu diễn đối tượng sinh viên dưới dạng chuỗi bao gồm : Id, name, (male/female), theory, practice, average
 */
package data;

import java.util.Scanner;

public class Student {

    public String id, name;
    public boolean gender;
    public int theory, practice;

    public Student() {
    }

    public Student(String id, String name, boolean gender, int theory, int practice) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.theory = theory;
        this.practice = practice;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>Nhap thong tin sinh vien: ");
        while (true) {
            System.out.print("Nhap id: ");
            id = sc.nextLine().trim();
            if (id.length() > 0) {
                break;
            }
        }

        while (true) {
            System.out.print("Nhap name: ");
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;
            }
        }
        System.out.print("Nhap gioi tinh [Nam/Nu]: ");
        gender = sc.nextLine().trim().equalsIgnoreCase("Nam");
        while (true) {
            try {
                System.out.print("Nhap diem ly thuyet [0-100]: ");
                theory = Integer.parseInt(sc.nextLine().trim());
                if (theory >= 0 && theory <= 100) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.print("Nhap diem thuc hanh: ");
            practice = Integer.parseInt(sc.nextLine().trim());
            if (practice >= 0 && practice <= 100) {
                break;
            }
            } catch (Exception e) {
                System.out.println("Loi: "+e.getMessage());
            }
            
        }
        
    }
    public float getAverage(){
        return (theory+practice)/2;
    }

    public void print() {
        System.out.println(">>> Thong tin sinh vien: ");
        System.out.println("ID : " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gioi tinh: " + (this.gender ? "Nam" : "Nữ"));
        System.out.println("Diem ly thuyet: " + this.theory);
        System.out.println("Diem thuc hanh: " + this.practice);
        System.out.println("Diem trung binh: "+ getAverage());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d - %d - %.2f", id, name, gender, theory, practice,getAverage());
    }
    
}
