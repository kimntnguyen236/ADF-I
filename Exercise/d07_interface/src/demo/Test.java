/*
 Kiểm thử các lớp Worker, Employee
 */
package demo;
import data.*;
public class Test {

    public static void main(String[] args) {
        Worker w = new Worker();
        w.input();
        
        Employee e = new Employee();
        e.input();
        
        // in ra chi tiết lương
        System.out.println("\n Chi tiet luong cong nhan: ");
        System.out.println(w);
        System.out.println("\n Chi tiet luong nhan viên: ");
        System.out.println(e);
    }
    
}
