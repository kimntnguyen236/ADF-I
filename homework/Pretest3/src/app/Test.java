/*
Create a main class named Test in app package, manage a list of StudentFPT, declares : Fields:
    - StudentFPT[ ] arr: store array of the students
    - max: the maximum of the number of students in the array.
    - next: the actual number of students in the array.
Methods:
    - add(): create a new studentFPT and then save into the array. However, if the array is full, display an error message.
    - displayAll(): list all students
    - displayPass(): display list of the students passed the examinations (each mark must be greater than 40 and final mark >=50 )
    ADF-I Pretest 3 Page. 2
    - displayTop1(): display list of the students had the highest score.
    - main(): to invoke above functions through a menu system.
        Use the switch-case and loop statements to displays a following menu.
            1. Add new student
            2. Display all students
            3. Display students passed the examinations
            4. Display Top 1 Students
            5. Exit
 */
package app;
import basic.*;
import java.util.Scanner;
public class Test {
    int max = 10,next=0;
    StudentFPT[] StuList = new StudentFPT[max];
    
    //thêm một Student mới vô mảng (Hàm nhập)
    public void add(){
        if (max==next) {
            System.out.println("HT het bo nho luu tru! Tu choi them moi.");
            return; // trừ khi viết else mới không biết câu lệnh return
        }
        
        // tạo 1 đối tượng
        StudentFPT stu = new StudentFPT();
        stu.input(); // gọi hàm input cho phép người dùng nhập chi tiết thông tin
        
        StuList[next] = stu;
        next++; // sau khi nhập xong tăng biến đếm next lên 1 đơn vị
    }
    
    public void displayAll(){
        if(next==0){
            System.out.println("HT chua co du lieu!");
            return;
        }
        
        for (int i = 0; i < next; i++) {
                System.out.println(StuList[i]); //dùng toString thì viết theo cách này
        }// kết thúc for
    }
    
    public void displayPass(){
        if(next==0){
            System.out.println("HT chua co du lieu!");
            return;
        }
        
        int cnt = 0;
        for (int i = 0; i < next; i++) {
            if (StuList[i].practiceMark>=40 && StuList[i].theoryMark>=40 && StuList[i].project>=40 && StuList[i].getFinal() >= 50  ) {
                System.out.println(StuList[i]);
                cnt++;
            }
        }// kết thúc for
        
        if (cnt==0) {
            System.out.println("Khong tim thay danh sach hoc sinh passed the examinations");
        }
    }
    
    public void displayTop1(){
        if (next==0) {
            System.out.println("HT chua co du lieu");
            return;
        }
        float topPrice = StuList[0].getFinal(); 
        for (int i = 1; i < next; i++) {
            if (topPrice<StuList[i].getFinal()) {
                topPrice = StuList[i].getFinal();
            }
        }
        
        // in ra danh sách tivi co don gia = topPrice
        for (int i = 0; i < next; i++) {
            if (StuList[i].getFinal()==topPrice) {
                System.out.println(StuList[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        Test o = new Test();
        
        //menu
        while (true) {            
            System.out.println("\n\n == MENU ==");
            System.out.println("1. Them sv");
            System.out.println("2. In ds sv");
            System.out.println("3. In sv passed the exams");
            System.out.println("4. In ds top 1");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang (1-5): ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1" : o.add(); break;
                case "2" : o.displayAll(); break;
                case "3" : o.displayPass();break;
                case "4": o.displayTop1(); break;
                case "5": return;
            }
        }
    }
    
}
