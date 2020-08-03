/*
Create sub class StudentFPT derives from Student, in package basic. Including:
- Fields: theoryMark, practiceMark, project.
- Constructors to initialise the all fields.
- public float getFinal() : return the final mark that calculated by formula : (theoryMark*2 + practiceMark + project*3)/6
- Override methods :
input(): allow user input more data into data fields theoryMark, practiceMark, project. Using try-catch exception for data validation: marks must be between 0 and 100
print():display detailed information of a student, including final mark.
 */
package basic;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class StudentFPT extends Student{
    public int theoryMark, practiceMark, project;

    public StudentFPT() {
    }

    public StudentFPT(int theoryMark, int practiceMark, int project, String id, String name, int yob) {
        super(id, name, yob);
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
        this.project = project;
    }
    
    public float getFinal(){
       return (theoryMark*2 + practiceMark +project*3)/6;
    }
    @Override
    public void print() {
        System.out.println(">>>> Information of a student");
        System.out.println("ID : "+id);
        System.out.println("Name: "+ name);
        System.out.println("Nam sinh: "+yob);
        System.out.println("Diem ly thuyet: "+theoryMark);
        System.out.println("Diem thuc hanh: "+practiceMark);
        System.out.println("Diem project: "+ project);
        System.out.println("Diem tong : "+getFinal());
    }

    @Override
    public void input() {
        super.input(); 
        Scanner o = new Scanner(System.in);
        while (true) {            
            try {
                System.out.print("Nhap diem ly thuyet: ");
                theoryMark = Integer.parseInt(o.nextLine().trim());
                if (theoryMark>0 && theoryMark <= 100) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi:"+e.getMessage());
            }
        }
        while (true) {            
            try {
                System.out.print("Nhap diem thuc hanh: ");
                practiceMark = Integer.parseInt(o.nextLine().trim());
                if (practiceMark>0 && practiceMark <= 100) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi:"+e.getMessage());
            }
        }
        while (true) {            
            try {
                System.out.print("Nhap diem project: ");
                project = Integer.parseInt(o.nextLine().trim());
                if (project>0 && project <= 100) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi:"+e.getMessage());
            }
        }
    }
    @Override
    public String toString(){
        return String.format("%s - %s - %d - %d - %d - %d - %.2f ",id,name,yob,theoryMark,practiceMark,project,getFinal());
    }
    
}
