
import java.util.Scanner;

public class Employee {
    // khai báo thuộc tính
    public String id,name, position;
    private int baseSalary;
    // hàm dựng không tham số (Default Constructor or no-arg Constructor)
        public Employee(){
            id = "C01";
            name = "Hoang Minh Tam";
            position = "Director";
            baseSalary = 2000;
        }
    // hàm dựng có tham số (Parameterized Constructor)
        public Employee(String id, String name,String position, int baseSalary){
            this.id = id;
            this.name= name;
            this.position = position;
            this.baseSalary = baseSalary;
        }
    // nhập dữ liệu cho các thuộc tính của nhân viên
        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your id: ");
            id=sc.nextLine();
            
            System.out.print("Enter your name: ");
            name=sc.nextLine();
            
            System.out.print("Enter your position: ");
            position=sc.nextLine();
            
            System.out.print("Enter your salary: ");
            baseSalary=sc.nextInt();
        }
        
    // xuất thông tin chi tiết cho đối tượng sinh viên
        public void output(){
            System.out.println("---------------------------");
            System.out.println(">>> Employee information : ");
            System.out.println("    Id: "+ id);
            System.out.println("    Name: "+name);
            System.out.println("    Position: "+position);
            System.out.println("    Salary: "+baseSalary);
        }
        
    public static void main(String[] args) {
        Employee o = new Employee();
        o.input();
        o.output();
    }
}
