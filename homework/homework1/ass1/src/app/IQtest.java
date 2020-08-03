
package app;

import java.util.*;
public class IQtest {
     int mark = 0;
     boolean ansE = false;
     boolean ansM = false;
     boolean ansA = false;
     boolean ansG = false;
   public static void main(String[] args){
          IQtest o = new IQtest();
          o.menu();
    }
    void QuestionE (){
        System.out.println("The meaning of 'girl' is:");
        System.out.println("1.con trai");
        System.out.println("2.con gai");
        System.out.println("3.Dan ong");
        System.out.println("4.Dan ba");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if(ans==2){
            System.out.println("Exacly");
           mark +=10;
           ansE =true;
        }
        else{
            System.out.println("Incorrect answer");
        }   
    }
    void QuestionM(){
        
        System.out.println("Please select the correct answer: 10/2 =???");
         System.out.println("1.  4");
        System.out.println("2.  5");
        System.out.println("3.  2");
        System.out.println("4.  3");
             Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if(ans==2){
            System.out.println("Exacly");
           mark +=10;
           ansM =true;
        }
        else{
            System.out.println("Incorrect answer");
        }  
    }
       void QuestionA(){
        
        System.out.println("What color is the hair?");
         System.out.println("1.Red");
        System.out.println("2.Blue");
        System.out.println("3.Black");
        System.out.println("4.prik");
             Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if(ans==3){
            System.out.println("Exacly");
           mark +=10;
           ansA =true;
        }
        else{
            System.out.println("Incorrect answer");
        }  
    }
              void QuestionG(){ 
        System.out.println("What color is the tooth?");
         System.out.println("1.Red");
        System.out.println("2.Blue");
        System.out.println("3.Black");
        System.out.println("4.White");
             Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if(ans==4){
            System.out.println("Exacly");
           mark +=10;
           ansG =true;
        }
        else{
            System.out.println("Incorrect answer");
        }  
    }
   void menu(){   
         Scanner sc = new Scanner(System.in);
         int option =0;
         do{
             System.out.println("Test IQ");
             System.out.println("1. English");
             System.out.println("2. Aptitude");
             System.out.println("3. math");
             System.out.println("4. General Kowledge");
             System.out.println("5. Exit");  
             System.out.println(">> Please choose from 1-5");
             option =sc.nextInt();
             switch(option){
                 case 1:
                     QuestionE();
                     break;
                 case 2:
                     QuestionA();
                     break;
                 case 3:
                     QuestionM();
                     break;
                 case 4:
                     QuestionG();
                     break;
                 case 5:
             if(mark==40){
                 mark +=10;
                 System.out.printf("bonus= 10.\n");
                 System.out.printf("mark result: %d.\n", mark);
                 System.out.printf("You are a genius.\n");
             }
             else if(mark==30){
                 mark +=5;
                 System.out.printf("bonus= 5.\n");
                 System.out.printf("mark result: %d.\n", mark);
                 System.out.printf("You are intelligen.\n"); 
             }
                 else if(mark==20){
                 mark +=2;
                 System.out.printf("bonus= 2.\n");
                 System.out.printf("mark result: %d.\n", mark);
                 System.out.printf("Your IQ level is average.\n"); 
             }
                 else{
                       System.out.printf("Your IQ level is below averag"); 
                 }
         }
         }while(option!=5);
   
   }
}
