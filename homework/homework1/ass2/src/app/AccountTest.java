
package app;

import java.util.*;
public class AccountTest {
void menu(){
    Scanner in = new Scanner(System.in);
    Account a = new Account();
    int option, amt;
    

do{
            System.out.println("Hệ Thống Rút và Gửi Tiền Tự Động");
            System.out.println("1.Gửi Tiền");
            System.out.println("2.Rut tien");
            System.out.println("3.Xem so du");
            System.out.println("4.Thoat");
            System.out.println("\t Chon chuc nang (1-4): ");
            option = in.nextInt();
            switch(option){
                case 1:
                    System.out.println("Nhap so tien muon gui");
                    amt = in.nextInt();
                    a.deposit(amt);
                    break;
                case 2:
                    System.out.println("Nhap so tien muon rut");
                    amt = in.nextInt();
                    a.withdraw(amt);
                    break;
                case 3:
                    System.out.printf("So du = %d\n", a.getBalance());
                    break;
                
            }
}while(option != 4);
    System.out.println("Cam on quy khach da su dung he thong!!!bey bey.......");
   }
    public static void main(String[] args) {
        AccountTest o = new AccountTest();
        o.menu();
    }
    
}
