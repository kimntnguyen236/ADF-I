package demo;
import java.util.Scanner;

public class Student {

    String name, id, batch;
    int mark;
    
    void input(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập id: ");
        id=sc.nextLine();
        
        System.out.println("Nhập ten: ");
        name=sc.nextLine();
        
        System.out.println("Nhập ma lop: ");
        batch=sc.nextLine();
        
        System.out.println("Nhập diem ket qua: ");
        mark=sc.nextInt();
    }
    
    void output(){
        System.out.println("Thong tin sinh vien :");       
        System.out.println("Ten SV : "+name);
        System.out.println("Id : "+id);
        System.out.println("Ma Lop : "+batch);
        System.out.println("Diem : "+mark);
    }
    
    public static void main(String[] args){
        Student sv=new Student();
        sv.input();
        sv.output();
    }
}