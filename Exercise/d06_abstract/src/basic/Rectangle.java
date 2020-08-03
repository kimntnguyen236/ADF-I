/*
La con cua lop Shape
 */
package basic;

import java.util.Scanner;

public class Rectangle extends Shape{
    public float w,h; // khai báo biến rộng và dài của hcn

    @Override
    public float area() {
        return w*h;
    }

    @Override
    public float perimeter() {
        return (w+h)*2;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai hcn : ");
        h = Float.parseFloat(sc.nextLine().trim());
        System.out.print("nhap chieu rong hcn : ");
        w = Float.parseFloat(sc.nextLine().trim());
    }
    
}
