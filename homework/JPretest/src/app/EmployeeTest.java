/*
Fields: max, next – eList (array of employees)
- Methods:
- void add() - add a new employee 
- void display() - display all employees.
- void display ( String eName ) - search and display employees by the required name.
- void remove( String eID ) – remove an employee by ID.
- void menu() - allows to manage the list of employees through the menu system as follows.
1. Add a new employee
2. Display list of employee
3. Search employee by name
4. Remove employee by ID
5. Exit
 */
package app;
import data.*;
import java.util.Scanner;
public class EmployeeTest {
    public int max = 10, next =0;
    Employee[] eList = new Employee[max];
    
    void add(){
        if (next==max) {
            System.out.println("HT het bo nho luu tru. Tu choi them moi!!!");
        }else{
            Employee c = new Employee();
            c.accept();
            
            for (int i = 0; i < next; i++) {
                if (eList[i].ID.equals(c.ID)) {
                    System.out.println("ID da ton tai. Khong the them moi!!!");
                    return;
                }
            }
            eList[next++]=c;
        }
    }
    
    void display(){
        if (next==0) {
            System.out.println("Danh sach trong !!!");
        } else{
            for (int i = 0; i < next; i++) {
                eList[i].printInfo();
            }
        }
    }
    
    void display(String eName){
        if (next==0) {
            System.out.println("Danh sach trong!!!");
        }else{  
            int cnt=0;
            for(int i =0; i < next; i++){
                if (eList[i].name.contains(eName)) {
                    eList[i].printInfo();
                    cnt++;
                }
            }
            if (cnt==0) {
                System.out.println("Khong tim thay nhan vien co ten "+eName);
            }
        }
    }
    
    void remove(String eID){
        if (next==0) {
            System.out.println("Danh sach trong !!!");
        }else{
            for (int i = 0; i < next; i++) {
                if (eList[i].ID.equals(eID)) {
                    for (int j = 0; j < next-1; j++) {
                        eList[j] = eList[j+1];
                    }
                    next--;
                    System.out.println("Da xoa thanh cong");
                    return;
                }
            }
            System.out.println("Khong tim thay nhan vien co ma so "+eID);
        }
    }
    
    void menu(){
        Scanner sc = new Scanner(System.in);
        String op = " ";
        while (true) {            
            System.out.println("=== Chuong trinh quan ly nhan vien ===");
            System.out.println("1. Them nhan vien");
            System.out.println("2. In danh sach");
            System.out.println("3. Tim kiem nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5 Thoat chuong trinh");
            System.out.print("Chon [1-5]: ");
            op = sc.nextLine();
            switch(op){
                case "1" : add(); break;
                case "2" : display(); break;
                case "3" :
                    System.out.print("Nhap ten nguoi can tim: ");
                    String search = sc.nextLine();
                    display(search);
                    break;
                case "4" : 
                    System.out.println("Nhap ma so nhan vien muon xoa: ");
                    String searchID = sc.nextLine();
                    remove(searchID);
                    break;
                case "5" :return;
            }
        }
    }
    public static void main(String[] args) {
        EmployeeTest o = new EmployeeTest();
        o.menu();
    }
    
}
