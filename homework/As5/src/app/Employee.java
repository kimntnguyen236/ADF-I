/*
Tạo project As5
Tạo Java Class Employee để mô tả cấu trúc 1 nhân viên như sau:
    i. Dữ liệu (fields – variable): id, name, position, baseSalary (100- 2000USD)
    ii. Hàm dựng (constructors):
        1. Không tham số Employee()
        2. Có tham số Employee(String, String, String, int)
    iii. Phương thức:
        1. void input() : nhập dữ liệu cho các thuộc tính của nhân viên
        2. void print() : xuất thông tin chi tiết của đối tượng nhân viên
 */
package app;

import java.util.Scanner;

public class Employee {
    public String id,name,position;
    public int baseSalary;

    //hàm dựng không tham số
    public Employee() {
    }

    // hàm dựng có tham số
    public Employee(String id, String name, String position, int baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }
    
    //input
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        // nhập id
        while (true) {            
            System.out.print("Enter your id: ");
            id = sc.nextLine().trim();
            if (id.length()>0) {
                break;
            }
        }
        // nhập name
        while (true) {            
            System.out.print("Enter your name: ");
            name = sc.nextLine().trim();
            if (name.length()>3) {
                break;
            }
        }
        // nhập position
        while (true) {            
            System.out.print("Enter your position: ");
            position = sc.nextLine().trim();
            if (position.length()>3) {
                break;
            }
        }
        // nhập baseSalary
        while (true) {            
            try {
                System.out.print("Enter your baseSalary: ");
                baseSalary = Integer.parseInt(sc.nextLine().trim());
                if (baseSalary >=100 && baseSalary <= 2000) {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Loi sai: "+e.getMessage());
            }
        }
    }
    
    //print
    public void printInfo(){
        System.out.println(">>>> Information of employee: <<<<");
        System.out.println("Id: "+ this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Position: "+this.position);
        System.out.println("baseSalary: "+this.baseSalary);
    }
}   
