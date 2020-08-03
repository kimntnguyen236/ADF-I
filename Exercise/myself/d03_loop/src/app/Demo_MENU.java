/*
    Kiem thu cau truc vong lap WHILE-DO WHILE
 */
package app;

import java.util.Scanner;

public class Demo_MENU {

    public static void main(String[] args) {
        Demo_MENU def = new Demo_MENU();
        def.menu();
    }
    
    // thiet ke menu: cho phep chon chuc nang muon chay trong chuong trinh
    void menu(){
        Scanner sc = new Scanner(System.in);
        String op = "";
        do{
            System.out.println("\n >> Menu <<");
            System.out.println("1. In bang cuu chuong");
            System.out.println("2. In danh sach sinh vien [FOR-i]");
            System.out.println("3. In danh sach sinh vien [FOR-EACH]");
            System.out.println("4. Dung chuong trinh");
            System.out.print(" Vui long chon chuc nang tu [1-4] : ");
            op = sc.nextLine(); // cho user nhap 1 chuoi va luu gia tri vo bien op
            switch(op){
                case "1" : testFOR(); break;
                case "2" : inDS(); break;
                case "3" : inDS2(); break;
                case "4" : return; //dung ham menu;
                default:
                    System.out.println("Chon sai chuc nang roi !!!");
                    break;
            }
        }while(true);
    }
    
    
    void testFOR(){
        // chuong trinh in ra bang cuu chuong N
        Scanner sc = new Scanner(System.in);  // .in la 1 thuoc tinh cua scanner . Ten cac class trong java ky tu dau tien viet in hoa. class la kieu tham chieu
        int n=0;
        while(n<2 || n>9){
            System.out.print("Vui long nhap 1 so nguyen: ");
            n = sc.nextInt();
            if (n>=2 && n<=9){
                break;
            }
            System.out.println("GIA TRI KHONG HOP LE. VUI LONG NHAP LAI !!! "); 
            /* 
            neu while(true) -> if(n>=2 && n<=9) them break
            =================================
            while(true){
            System.out.print("Vui long nhap 1 so nguyen: ");
            n = sc.nextInt();
            if(n>=2 && n<=9){
                break;
            }
            System.out.println("GIA TRI KHONG HOP LE. VUI LONG NHAP LAI !!! "); 
            =================================
            */
            
        }
        System.out.println("== Bang cuu chuong " + n + "=="); 
        for (int i=1; i<10; i++ ){
            System.out.printf("%2d * %2d = %3d \n",n,i,n*i);
        }
    }
    
    
    // khai bao 1 mang chua ds ten cac sv 
    String[] ds = {"Hung", "Huy","Buu","Kim","Hung","An","Thu","Hoa"};
    
    void inDS(){
        System.out.println("\n >> Bang danh sach sinh vien <<");
        for (int i = 0; i < ds.length; i++) { //ds.length de dem phan tu trong mang
            System.out.println(ds[i]);
            // System.out.printf("%s , ",ds[i]);
        }
        System.out.printf("Tong cong %d sinh vien \n",ds.length);
    }
    
    
    void inDS2(){
        System.out.println("\n >> Bang danh sach sinh vien <<");
        for (String tenSV : ds) {  // tenSV : bien dai dien cho moi phan tu trong mang (ds)
            System.out.println(tenSV);
            // System.out.printf("%s , ",tenSV);
        }
    }
}
