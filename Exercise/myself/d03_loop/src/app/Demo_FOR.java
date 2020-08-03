/*
 kiem thu cac loai vong lap FOR
 */
package app;

import java.util.*;
public class Demo_FOR {

    public static void main(String[] args) {
        Demo_FOR abc = new Demo_FOR();
        abc.testFOR();
        abc.inDS();
        abc.inDS2();
    }
    
    void testFOR(){
        // chuong trinh in ra bang cuu chuong N
        Scanner sc = new Scanner(System.in);  // .in la 1 thuoc tinh cua scanner . Ten cac class trong java ky tu dau tien viet in hoa. class la kieu tham chieu
        System.out.print("Vui long nhap 1 so nguyen: ");
        int n = sc.nextInt();
        
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
