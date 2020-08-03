/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public class Car extends Vehicle {
    private boolean gps;

    public Car() {
        super();
        gps=false;
    }
    
    protected void accept(){
        super.accept();
        System.out.print("Nhap Gps (Y/N): ");
        Scanner sc=new Scanner(System.in);
        gps=sc.nextLine().trim().equalsIgnoreCase("y");
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Gps: "+(gps?"Co":"Khong"));
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Brand: %s, Speed: %d, Weight: %d, Price: %d, GPS: %s",id,name,brand,speed,weight,price,gps?"Co":"Khong");
    }
    public boolean getGps(){
        return gps;
    }
}
