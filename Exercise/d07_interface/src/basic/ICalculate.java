/*
day la interface, khai bao cac phuong thuc tinh luong, tinh phu cap cho nguoi lam viec
 */
package basic;

public interface ICalculate {
    public int getSalary();
    public int getAllowance();
    
    //khai bao he so tang ca
    public static final int OT = 3; 
    
    //khai bao so ngay lam viec chuan trong thang cua nv van phong
    public static final int days = 24;
}