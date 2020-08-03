// Su dụng các tính cua lop ShapeCollection thong qua 1 he thong moi
package app;

import java.util.Scanner;

public class TestShape {

    public static void main(String[] args) {
        TestShape p = new TestShape();
        p.menu();
    }
    
    void menu(){
        String op="";
        ShapeCollection o = new ShapeCollection();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Them 1 hinh tron");
            System.out.println("2. Them 1 hinh chu nhat");
            System.out.println("3. In danh sach cac hinh");
            System.out.println("4. In danh sach co dien tich >= 50");
            System.out.println("5. In danh sach cac hinh tron");
            System.out.println("6. Thoat");
            System.out.println("Vui long chon chuc nang [1-6]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1": o.addCircle(); break;
                case "2": o.addRectangle();break;
                case "3": o.display();break;
                case "4":break;
                case "5":break;
                case "6": return; 
            }
        }
    }
}
