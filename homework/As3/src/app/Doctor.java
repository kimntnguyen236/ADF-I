/*
Tạo Java Class, Doctor (Doctor.java) với cấu trúc như sau :
a. Fields dữ liệu : docNo, name, specification (string), exp_years, salary (int)
b. Hàm dựng: khởi trị ban đầu cho các field dữ liệu, bao gồm hàm dựng
    i. Không tham số Doctor()
    ii. Có tham số Doctor(String, String, String, int, int)
c. Phương thức:
    i. void input () : nhập dữ liệu chi tiết của 1 bác sĩ . Yêu cầu kiểm tra tính hợp lệ của dữ liệu: docNo, name, specification -ko được để trống, exp_years, salary phải lớn hơn 0
    ii. void print() : in các thông tin chi tiết của 1 bác sĩ ra màn hình iii. void print(String id) : in ra hệ số cấp bậc của bác sĩ có mã số là id, dựa vào số năm kinh nghiệm (exp_years) như sau :
        1. ‘D’ nếu số năm kn >=15 năm
        2. ‘C’ nếu số năm kn >=10 năm và nhỏ hơn <15 năm
        3. ‘B’ nếu số năm kn >=5 năm và nhỏ hơn <10 năm
        4. ‘A’ nếu số năm kn <5 năm
    Lưu ý, chương trình sẽ thông báo lỗi nếu mã số id ko đúng.
    iv. int print(int days): tính và trả về thu nhập trong tháng của bác sĩ dựa vào số ngày làm việc (days) và số năm kinh nghiệm theo công thức sau : income = (salary * days)/24 + allowance (phụ cấp cấp bậc) , với allowance = 1000 nếu số năm kn >=15 năm
    600 nếu số năm kn >=10 năm và nhỏ hơn <15 năm
    300 nếu số năm kn >=5 năm và nhỏ hơn <10 năm
    100 nếu số năm kn <5 năm
 */
package app;

import java.util.Scanner;

public class Doctor {
    public String docNo,name,specification;
    public int exp_years,salary;

    public Doctor() {
    }

    public Doctor(String docNo, String name, String specification, int exp_years, int salary) {
        this.docNo = docNo;
        this.name = name;
        this.specification = specification;
        this.exp_years = exp_years;
        this.salary = salary;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        // nhập docNo
        while (true) {            
            System.out.print("Nhập docNo: ");
            docNo = sc.nextLine().trim();
            
            if (docNo.length()>0) {
                break;
            }
        }
        
        // nhập name
        while (true) {            
            System.out.print("Nhập name: ");
            name = sc.nextLine().trim();
            if (name.length()>0) {
                break;
            }
        }
        
        // nhập specification
        while (true) {            
            System.out.print("Nhập chuyên môn: ");
            specification = sc.nextLine().trim();
            if (specification.length()>0) {
                break;
            }
        }
        
        // nhập exp_years phải lớn hơn 0
        while (true) {            
            System.out.print("Nhập exp_years: ");
            exp_years = Integer.parseInt(sc.nextLine().trim());
            if (exp_years>0) {
                break;
            }
        }
        
        // nhập salary
        while (true) {            
            System.out.print("Nhập salary: ");
            salary = Integer.parseInt(sc.nextLine().trim());
            if(salary>0){
                break;
            }
        }
    }
    
    public void printInfo(){
        System.out.println(">>>> Thông tin của 1 bác sĩ: <<<<");
        System.out.println("Mã số: "+ docNo);
        System.out.println("Tên: "+ name);
        System.out.println("Chuyên môn: "+specification);
        System.out.println("Số năm kinh nghiệm: "+exp_years);
        System.out.println("Lương: "+ salary);
    }
    
    public void print(String id){
        String level;
        if (id.equalsIgnoreCase(docNo)) {
            if (exp_years>=15) {
            level = "D"; 
        } else if (exp_years>=10 && exp_years <15) {
            level = "C";
        }else if(exp_years>=5 && exp_years<10){
            level = "B";
        } else if(exp_years<5){
            level = "A";
        }else{
            level = "Cấp bậc không hợp lệ";
        }
        System.out.printf("Bác sĩ ID %s có hệ số lương là %s  ",docNo,level);
        return;
        }
        System.out.println("Khong có bác sĩ có mã số ID là"+id);
    }
    public int print(int days){
        int income =0;
        int allowance = 0;
        if (exp_years>=15) {
            allowance = 1000;
        }else if (exp_years>=10 && exp_years<15) {
            allowance = 600;
        }else if (exp_years>=5 && exp_years<10) {
            allowance = 300;
        }else if (exp_years<5) {
            allowance = 100;
        }
        
        income = (salary*days)/24 + allowance;
        return income;
    }
}
