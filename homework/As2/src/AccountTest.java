/*
 Tạo lớp kiểm thử Java Main Class, AccountTest.java , bao gồm 2 phương thức :
a. menu() : tạo thực đơn thực hiện chức năng gởi và rút tiền.
b. main() : gọi phương thức menu() để thi hành chương trình.
 */
import java.util.*;

public class AccountTest {

    Scanner sc=new Scanner(System.in);
    

    public static void main(String[] args) {
       AccountTest o=new AccountTest();
       o.menu();
    }
    
    
    void menu(){
        Account a=new Account();
        
        int opt=0;
        int amount=0;
        while(true){
            System.out.println("Hệ thống rút gửi tiền tự động");
            System.out.println("==MENU==");
            System.out.println("1. Nhập thông tin tài khoản");
            System.out.println("2. Gửi Tiền");
            System.out.println("3. Rút Tiền");
            System.out.println("4. Xem số dư");
            System.out.println("5. Xem thông tin tài khoản");
            System.out.println("6. Thoát");
            System.out.print("Xin vui lòng nhập số [1-6]: ");
            opt=sc.nextInt();

            switch(opt){
                case 1:
                    a.input();
                    break;
                case 2:
                    System.out.println("Xin vui long nhập số tiền cần gửi:");
                    amount=sc.nextInt();
                    a.deposit(amount);
                    break;
                case 3:
                    System.out.println("Xin vui lòng nhập số tiền cần rút:");
                    amount=sc.nextInt();
                    a.withdraw(amount);
                    break;
                case 4:
                    System.out.printf("Số dư : %d $\n",a.getBalance());
                    break;
                case 5:
                    System.out.printf("Account : %s - Số dư : %d $\n", a.accNo,a.balance);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Bạn nhập không hợp lệ! Xin vui lòng nhập lại");
                    System.out.print("Xin vui lòng nhập lại số [1-6]");
                    break;
            }
        }
        
    }
}
