/*
Create class Cylinder derives from Shape, implements IGeometry in package data, consists of:
- Fields : radius, height
- Constructors to initialize the all fields
- Override methods of Shape and IGeometry:
- accept() :
using try-catch exception for validation: radius, height must be greater than zero.
- printInfo() : display detailed information of a cylinder including radius, height, peripheral, area, volume
- toString() : return a string presenting all the details of a cylinder
 */
package data;

import java.util.Scanner;

public class Cylinder extends Shape implements IGeometry {

    public float radius, height;

    public Cylinder() {
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Nhap height: ");
                height = Float.parseFloat(sc.nextLine().trim());
                if (height > 0) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
        try {
            while (true) {                
                System.out.print("Nhap radius: ");
                radius = Float.parseFloat(sc.nextLine().trim());
                if (radius>0) {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void printInfo() {
        System.out.println(">>>>Information of a cylinder<<<<");
        System.out.println("Height: "+height);
        System.out.println("Radius: "+ radius);
        System.out.println("Peripheral: "+ peripheral());
        System.out.println("Area: %.2f "+area());
        System.out.println("Volume: %.2f "+volume());
    }

    @Override
    public double area() {
        double dtday = PI * radius * radius;
        double dtxq = height *peripheral();
        return dtday *2 + dtxq;
    }

    @Override
    public double peripheral() {
        return radius*2*PI;
    }

    @Override
    public double volume() {
        double dtday = PI *radius * radius;
        return dtday *height;
    }

    @Override
    public String toString() {
        return String.format("\n height: %7.2f \n radius: %7.2f \n peripheral: %7.2f \n area: %7.2f \n volume: %7.2f ",height,radius,peripheral(),area(),volume());
    }
    
}
