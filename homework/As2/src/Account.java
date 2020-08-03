
import java.util.Scanner;

/*
a. Fields dữ liệu : accNo, balance
b. Hàm dựng: khởi trị ban đầu cho các field dữ liệu.
i. Mặc định Account() – no-parameter constructor ( dòng 17-20 )
ii. Có tham số Account(String, int) - parameterized constructor (dòng 22-25)
c. Phương thức:
i. void deposit (int) : thực hiện chức năng gởi tiền vô tài khoản
ii. void withdraw(int) : thực hiện chức năng rút tiền.
iii. int getBalance() : trả về số dư tài khoản.
*/
public class Account {
    public String accNo;
    public int balance;

    public Account() {
        accNo = "C01";
        balance = 3000;
    }

    public Account(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>> Nhap thong tin tai khoan <<<<");
        System.out.print("Nhap stk: ");
        accNo = sc.nextLine().trim();
        System.out.print("Nhap so du ban dau: ");
        balance=Integer.parseInt(sc.nextLine().trim());
    }
    public void deposit(int amt){
        if (amt<100) {
            System.out.println("Xin vui long nhap so tien it nhat la 100$");
        }else{
            balance += amt;
            System.out.println("Ban da gui vao bank %d $"+amt);
        }
    }
    
    public void withdraw(int amt){
        if (amt>=100 && amt <= balance) {
            balance -= amt;
            System.out.println("Ban da rut tu bank %d $"+amt);
        }
       if (amt>balance) {
            System.out.println("So du trong tai khoan khong du de thuc hien giao dich");
        }
        else{
            System.out.println("Giao dich khong thanh cong. So tien toi thieu de rut la 100$");
        }
    }
    
    public int getBalance(){
        return balance;
    }
    @Override
    public String toString(){
        return String.format("%s : %d",accNo,balance);
    }
}
