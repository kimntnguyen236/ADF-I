
package data;
import basic.ICalculate;
import java.util.Scanner;
public class Worker implements ICalculate{
    
    public int workDays, baseSalary;
    public String name;

    public Worker() {
    }

    public Worker(int workDays, int baseSalary, String name) {
        this.workDays = workDays;
        this.baseSalary = baseSalary;
        this.name = name;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap du lieu cong nhan: ");
        System.out.print("Nhap ten: "); name = sc.nextLine();
        System.out.print("Nhap luong cb 1 ngay: ");
        baseSalary = Integer.parseInt(sc.nextLine());
        System.out.println("so ngay lam viec trong thang: ");
        workDays = Integer.parseInt(sc.nextLine());
    }
    
    
    @Override
    public int getSalary() {
        return workDays * baseSalary;
    }

    @Override
    public int getAllowance() {
        return 0;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %d - %d - %d", name, baseSalary, workDays, getSalary());
    }
    
}
