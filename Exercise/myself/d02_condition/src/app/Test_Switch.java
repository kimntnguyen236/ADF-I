/*
Test Case cho cau truc lap trinh switch-case
 */
package app;

import java.util.*;
public class Test_Switch {

  
    public static void main(String[] args) {
         Test_Switch Kim = new Test_Switch();
        Kim.phanLoaiIQ();
    }
    
    void phanLoaiIQ(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem ket qua thi[0-100]: ");
        int m = sc.nextInt();
        char IQ = 'F';
        
        if(m>100 || m<0){
            System.out.println("DIEM KHONG HOP LE !!!");
        }
        else
        {
            // m co gia tri tu 0-100
            if(m>=90){
                IQ = 'A';
            }
            else if(m>=70){
                IQ = 'B';
            }
            else if(m>=50){
                IQ ='C';
            }
             else{
            IQ='D';
        }
            
        }
        
        switch(IQ){
            case 'A': 
                System.out.println("Ban qua tuyet voi !");
                break;
            case 'B': 
                System.out.println("Ban kha day !");
                break;
            case 'C': 
                System.out.println("Ban cung binh thuong thoi !");
                break;
            case 'D': 
                System.out.println("Thoi roi, con chi dau !");
                break;
            default: 
                System.out.println("NGOAI HANG, KHONG TINH");
                break;
        }
    }
}
