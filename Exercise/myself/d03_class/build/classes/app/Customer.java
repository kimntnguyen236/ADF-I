/*
  Class mo ta info cua 1 Customer, bao gom 
- thuoc tinh: ma so, ten, email,nam sinh, gioi tinh
- phuong thuc xu ly : nhap du lieu, xuat du lieu
 */
package app;

import java.util.Scanner;

public class Customer {
    // khai bao cac thuoc tinh
    public String id, name, email;
    public int yob;
    public boolean gender;
    
    // ham dung khong tham so

    public Customer() {
        id = "C00";
        name = "Khach vang lai";
        email = "Khong biet";
        yob = 2010;
        gender = true;
    }
    
    // ham dung co tham so

    public Customer(String id, String name, String email, int yob, boolean gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.yob = yob;
        this.gender = gender;
    }
    
    
    
    
    // phuong thuc nhap thong tin khach hang
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin khach hang: ");
        
        System.out.print("Nhap ma so: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        
        // nhap nam sinh [1900-2015]
        while(true){
            System.out.print("Nhap nam sinh [1900-2015]: ");
            yob = sc.nextInt();
            if(yob >= 1900 && yob<= 2015){
                break;
            }
            System.out.println("Nam sinh khong hop le. Vui long nhap lai !!!");
        }
        
        sc = new Scanner(System.in);
        //nhap gioi tinh [nam/nu]
        while (true){
            System.out.print("Nhap gioi tinh [nam/nu]: ");
            String s = sc.nextLine().trim().toLowerCase(); 
            
            if(s.equals("nam") ||s.equals("nu") ){
                gender = s.equals("nam");
                break;
            }
            System.out.println("Gioi tinh khong hop le. Vui long nhap lai !!!");
        }
        
    }
    
    // phuong thuc xuat thong tin khach hang
    public void display(){
        System.out.println("\n >> Thong tin chi tiet cua khach hang: ");
        System.out.println("Ma so : " + id);
        System.out.println("Ten : " + name);
        System.out.println("Email : " + email);
        System.out.printf("Nam sinh : %d - Tuoi : %d \n ", yob, 2020-yob);
        System.out.printf("Gioi tinh : %s \n", gender?"nam":"nu");
    }
    
}
