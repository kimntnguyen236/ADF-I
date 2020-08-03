/*
Tạo lớp kiểm thử Java Main Class, DoctorTest.java , bao gồm 2 phương thức :
a. menu() : tạo thực đơn để thực hiện các chức năng : 1. nhập thông tin bác sĩ, 2. xuât thông tin bác sĩ, 3. in cấp bậc, 4. Nhập số ngày làm việc và tính thu nhập, 5. Thoát
b. main() : gọi phương thức menu() để thi hành chương trình.
 */
package app;

import java.util.Scanner;

public class DoctorTest {

    public static void main(String[] args) {
        DoctorTest a = new DoctorTest();
        a.menu();
    }
    public void menu(){
        String id;
        int days;
        Doctor d = new Doctor();
        String op = "";
        while (true) {
        Scanner sc = new Scanner(System.in);            
            System.out.println("\n \n >>> Menu <<<");
            System.out.println("1. Nhập thông tin bác sĩ");
            System.out.println("2. Xuất thông tin bác sĩ");
            System.out.println("3. In cấp bậc");
            System.out.println("4. Nhập số ngày làm việc và tính thu nhập");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn [1-5]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1":
                    d.input();
                    break;
                case "2":
                    d.printInfo();
                    break;
                case "3":
                    System.out.print("Nhập ID bác sĩ: ");
                    id=sc.nextLine().trim();
                    d.print(id);
                    break;
                case "4": 
                    System.out.print("Nhập số ngày làm việc của bác sỹ :");
                    days=sc.nextInt();
                    System.out.println("Thu nhập của bác sỹ là "+d.print(days));
                    break;
                case "5": 
                    return;
                    
            }
        }
    }
    
}
