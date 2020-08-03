/*
 la class kiem thu cac doi tuong Student
 */
package app;

public class TestStudent {

    public static void main(String[] args) {
        //khoi tao ma lop hoc cho cac sv thuoc class Student 
        Student.batch = "1907-M0";
        //tao doi tuong sinh vien thu 1 va cap phat bo nho = toan tu New
        Student sv1 = new Student();

        sv1.id = 1000;
        sv1.name = "Buu Buu";
        sv1.yob = 2000;
        sv1.gender = false;

        Student sv2 = new Student();

        sv2.id = 1001;
        sv2.name = "Thai Binh";
        sv2.yob = 2002;
        sv2.gender = true;
        
        //in ra thong tin sv1, sv2
        System.out.printf("id=%d, name=%s, batch=%s, year of birth: %d \n", sv1.id, sv1.name, Student.batch, sv1.yob);
        System.out.printf("id=%d, name=%s, batch=%s, year of birth: %d \n", sv2.id, sv2.name, Student.batch, sv2.yob);
        
        
        // in ra gia tri cua doi tuong sv1 va sv2
        System.out.println("==========");
        System.out.println(sv1);
        System.out.println(sv2);
    }

}
