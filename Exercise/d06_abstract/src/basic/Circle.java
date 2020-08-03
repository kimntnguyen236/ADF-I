/*
Là lớp con của lớp Shape
 */
package basic;

import java.util.Scanner;

public class Circle extends Shape{
    public float  r; // bán kính r

    @Override
    public float area() {
        return r*r*PI;
    }
    
    @Override
    public float perimeter() {
        return 2*r*PI;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh hinh tron: ");
        r = Float.parseFloat(sc.nextLine().trim());
    }
    
}
