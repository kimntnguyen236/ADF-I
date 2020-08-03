/*
Lop nhan vien - se có cách tính lương mô tả ở interface ICalculate
*/

package data;
import basic.*;
import java.util.*;

public class Employee implements ICalculate {

    public String name;
    public int basicSalary, workedDays;
    public String level;

    public Employee() {

    }

    public Employee(String name, int basicSalary, int workedDays, String level) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.workedDays = workedDays;
        this.level = level;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap du lieu nhan vien: ");
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap bac luong [A/B/C]: ");
        level = sc.nextLine();
        System.out.print("Nhap luong cb 1 thang: ");
        basicSalary = Integer.parseInt(sc.nextLine());
        System.out.print("So ngay lam viec trong thang: ");
        workedDays = Integer.parseInt(sc.nextLine());
    }

    @Override
    public int getSalary() {
        int income = 0;
        if (workedDays > 24) {
            income = basicSalary + (basicSalary / days * (workedDays - days) * OT);
        } else {
            income = basicSalary * workedDays / days;
        }
        return income;
    }

    @Override
    public int getAllowance() {
        int allowance = 0;
        switch (level) {
            case "A":
                allowance = 1000;
                break;
            case "B":
                allowance = 500;
                break;
            case "C":
                allowance = 100;
                break;
        }
        return allowance;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d - %d -d", name, level, basicSalary, workedDays, getSalary() + getAllowance());
    }

}