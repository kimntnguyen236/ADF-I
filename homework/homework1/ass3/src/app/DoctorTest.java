/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as3.app;

import java.util.*;
public class DoctorTest {

void menu (){
     Scanner in = new Scanner(System.in);
   Doctor a = new Doctor();
    int option,days;
    do{
        System.out.println("He Thong Quan Ly Bac Si");
        System.out.println("1: Nhap Thong tin bac si.");
        System.out.println("2: Hien thi thong tin bac si.");
        System.out.println("3: In cap bac.");
        System.out.println("4: Nhap so ngay lam viec vaf tinhs thu nhap.");
        System.out.println("5: Thoat");
        System.out.println("\t Chon chuc nang (1-5).");
        option = in.nextInt();
    switch(option){
        case 1:
            a.input();
            break;
        case 2:
            a.print();
            break;
        case 3:
            a.print(null);
            break;
        case 4: 
            days =in.nextInt();
            a.print(days);
            break;
            
    }
    }while(option !=5);
}
    public static void main(String[] args) {
DoctorTest o = new DoctorTest();
o.menu();
    }
    
}
