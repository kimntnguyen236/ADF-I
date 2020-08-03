
package data;

import java.util.Scanner;

public class Student {
    // khai báo thuộc tính
    public String id, name;
    public boolean gender;
    public int theory,practice;
    
    // no-arg constructor
        public Student(){
            id="C01";
            name="Thien Kim";
            gender=true;
            theory=100;
            practice=99;
        }
    // parameterize constructor
        public Student(String id, String name, boolean gender, int theory, int practice){
            this.id=id;
            this.name=name;
            this.gender=gender;
            if (gender==true) {
                System.out.print("female");
            }
            else if (gender==false) {
                System.out.print("male");
            }
            this.theory=theory;
            this.practice=practice;
        }
    // nhập thông tin sinh viên, được gọi là hàm dựng không tham số
        private void input(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Student Information:  ");
        System.out.print("Inter your id: ");
        id=sc.nextLine();
        System.out.print("Inter your name: ");
        name=sc.nextLine();
        
        //Enter your theory mark [0-100]
        while(true)
        {
            System.out.print("Enter your theory mark [0-100] : ");
            theory=sc.nextInt();
            if(theory>=0 && theory<=100)
            {
                break;
            }
            System.out.println("Invalid mark. Please enter again!");
        }
        
        //Enter your practice mark [0-100]
        while(true)
        {
            System.out.print("Enter your practice mark [0-100] : ");
            practice=sc.nextInt();
            if(practice>=0 && practice<=100)
            {
                break;
            }
            System.out.println("Invalid mark. Please enter again!");
        }
        
        sc=new Scanner(System.in);
        //Enter your gender
        while(true)
        {
            System.out.print("Enter your gender [True/False] : ");
            if (gender==true) {
                System.out.print("female");
            }
            else if (gender==false) {
                System.out.print("male");
            }
            System.out.println("Giói tính không hợp lệ");
        }
    }
}
