/*
Fields: max, next – cList (array of cylinders)
- Methods:
- void add() - add a new cylinder
- void display() - display all cylinders.
- void display( float v ) - display cylinder having volume greater than v.
- void menu() - allows to manage the list of cylinders through the menu system as follows.
1. Add a new cylinder
2. Display all cylinders
3. Display all cylinders having required volume
4. Exit
 */
package app;
import data.*;
import java.util.Scanner;
public class Test {
    int max = 10, next =0;
    Cylinder[] cList = new Cylinder[max];
    
    void add(){
        if (next==max) {
            System.out.println("HT het bo nho luu tru. Tu choi them moi");
            return;
        }
        
        Cylinder c = new Cylinder();
        c.accept();
        cList[next++]=c;
        
    }
    
    void display(){
        if (next==0) {
            System.out.println("HT chua co du lieu. ");
            return;
        }
        for (int i = 0; i < next; i++) {
            System.out.println(cList[i]);
        }
    }
    
    void display(float v){
        if (next == 0) {
            System.out.println("HT chua co du lieu!!!");
            return;
        }
        int cntv=0;
        for (int i = 0; i < next; i++) {
            if (cList[i].volume()>=v) {
                cList[i].printInfo();
                cntv++;
            }
        }//thoát khỏi vòng lặp for
        if (cntv==0) {
            System.out.println("Khong co hinh tru the tich > "+v);
        }
    }
    
    public void menu(){
        Scanner o = new Scanner(System.in);
        String op = " ";
        while (true) {            
            System.out.println("==== MENU ====");
            System.out.println("1. Add a new cylinder");
            System.out.println("2. Display all cylinders");
            System.out.println("3. Display all cylinder having required volume");
            System.out.println("4. Exit");
            System.out.print("\t Please choose [1-4]: ");
            op = o.nextLine();
            switch(op){
                case "1": add(); break;
                case "2": display(); break;
                case "3": try {
                        System.out.print("Input volume: ");
                        float v = Float.parseFloat(o.nextLine().trim());
                        display(v);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                break;
                case "4": return;
                default:
                    System.out.println("Wrong input!!!");
                    break;
            }
            
        }
    }
    
    public static void main(String[] args) {
        Test sc = new Test();
        sc.menu();
    }
    
}
