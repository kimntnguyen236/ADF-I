/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as3.app;
import java.util.Scanner;
import java.util.Date;
import java.time.YearMonth;
public class Doctor {
    String docNo,name,specification;
    int salary,exp_years;
    public Doctor (){
        this.docNo = "001";
        this.name = "Thanh An";
        this.specification = "da lieu";
        this.salary = 45000000;
        this.exp_years = 2019;
    }
    public Doctor (String doc,String nam,String spe, int sal, int exp){
        this.docNo = doc;
        this.name = nam;
        this.specification = spe;
        this.salary =  sal;
        this.exp_years = exp;
        
    }
    public void input(){
       Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma so bac si:");
        docNo = in.nextLine();
        if("".equals(docNo)== true){
            System.out.println("Ma so không không được để trống");
            System.out.println("vui long nhap lai ma so:");
            docNo = in.nextLine();
        }
        System.out.println("Nhap ten:");
        name = in.nextLine();
        if("".equals(name)==true){
            System.out.println("Tên Không được để trống");
            System.out.println("Vui lòng nhập lại tên:");
        name = in.nextLine();
        }
        System.out.println("Nha chuyen mon:");
        specification = in.nextLine();
        if("".equals(specification) == true){
            System.out.println("Chuyên ngành không được để trống");
            System.out.println("Vui lòng nhập đúng chuyên ngành");
             specification = in.nextLine();
        }
        System.out.println("Nhập tiền lương cơ bản");
        salary = in.nextInt();
        if(salary <=0){
            System.out.println("tiền lương cơ bản phải lớn hơn 0:");
            System.out.println("vui long nhập lại tiền lương cơ bản");
                salary = in.nextInt();
        }
        System.out.println(" Nhập nam vào làm việc");
        exp_years  = in.nextInt();
        if(exp_years <=0){
            System.out.println("Nam vao lam khong duoc nho hơn khong");
            System.out.println("Vui kong nhap lại năm vao lam");
              exp_years  = in.nextInt();
        }
        }
    public void print(){
      
            System.out.println("Ma so: "+ docNo);
            System.out.println("Ten: "+name);
            System.out.println("Chuyen mon: "+specification);
            System.out.println("Luong: "+salary);
            System.out.println("Nam vao lam: "+exp_years);                  
    }
     public void print(String id){
         
         int year = YearMonth.now().getYear();
          
            if(year- exp_years >= 15){
                id = "D";
            }else if(year-exp_years <15 && year-exp_years >=10 ){
                id = "C";
            }else if(year-exp_years <10 && year-exp_years >=5){
                id = "B";                              
            }else if(year-exp_years <5){
                  id = "A";   
            }           
            else{
                id="Cap bat khong hop le";
            }
             System.out.println("Cap bac:"+id);
         
     }  
    public void print(int days){
        int allaowance;          
         int year = YearMonth.now().getYear();
   
            if(year- exp_years >= 15){
                allaowance = 1000;
            }else if(year-exp_years <15 && year-exp_years >=10 ){
                allaowance = 600;
            }else if(year-exp_years <10 && year-exp_years >=5){
                allaowance = 300;
            }else{
                allaowance = 100;
            }
         int income = (salary*days)/24 + allaowance;
         System.out.println("Phu cap bac: "+allaowance);
         System.out.println("Tong thu nhap: "+ income);
     }

    }

