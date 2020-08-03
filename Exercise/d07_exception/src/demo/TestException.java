/*
Kiểm thử một số dạng lỗi sai Exception
 */
package demo;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        System.out.println("---- DEMO EXCEPTION ----");
        Scanner sc = new Scanner(System.in);
        
        try {
             System.out.print("Nhap so thu 1: ");
        int n1 = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhap so thu 2: ");
        int n2 = Integer.parseInt(sc.nextLine().trim());
        
        System.out.printf("%d / %d = %.2f \n", n1,n2, (float)n1/n2);
        System.out.printf("%d * %d = %d \n", n1,n2, n1*n2);
        System.out.printf("%d + %d = %d \n", n1,n2, n1+n2);
        
        } catch (NumberFormatException e) {
            System.out.println("loi sai: "+e.getMessage());
        }
        System.out.println("\n ==== FINISHED ====");
        
        
        
//        System.out.print("Nhap so thu 1: ");
//        int n1 = Integer.parseInt(sc.nextLine().trim());
//        System.out.print("Nhap so thu 2: ");
//        int n2 = Integer.parseInt(sc.nextLine().trim());
//        
//        System.out.printf("%d / %d = %.2f \n", n1,n2, (float)n1/n2);
//        System.out.printf("%d * %d = %d \n", n1,n2, n1*n2);
//        System.out.printf("%d + %d = %d \n", n1,n2, n1+n2);
//        System.out.println("\n ==== FINISHED ====");
        
    }
    
}
