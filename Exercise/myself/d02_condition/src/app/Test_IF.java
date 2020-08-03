/*
Test Case cho cau truc lap trinh IF_ELSE
 */
package app;

import java.util.*; // nhung thu vien chua lop Scanner

public class Test_IF {

    public static void main(String[] args) {
        Test_IF o = new Test_IF();
        o.kiemTraNamNhuan();
    }
    
    void kiemTraNamNhuan(){
        // khai bao bien doi tuong sc de thuc hien chuc nang nhap lieu 
        Scanner sc= new Scanner(System.in); 
        System.out.print("Nhap nam muon kiem tra ");
        int year = sc.nextInt();    //ham cho nhap 1 so nguyen
        
        // kiem tra gia tri cua bien year
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.printf("%d la nam nhuan \n",year);
        }
        else{
            System.out.printf("%d khong phai la nam nhuan \n",year);
        }
    }
    
}
