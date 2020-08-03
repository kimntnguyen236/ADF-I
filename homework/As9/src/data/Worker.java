/*
Create class Worker derives from Employee and implements interfaces IAllowance, ITaxable, in package data, consists of:
- Private Field [overtime]: int
- Constructors to initialize the all fields.
- Override methods:
- proctected void accept() : allow user to input all details for a worker. (Hint: invoke super.accept() ) - validation: overtime >= 0
- public float getTax(): monthly sal = salary*(worked days + overtime*2) /26; tax = 0 if mothly sal < 400 else tax = monthly sal * income tax percent
- public float getAllowance(): 0
- public float getIncome(): monthly sal – tax
- public void printInfo() : print the pay slip of a worker
- public String toString() : return a string presenting all details of a worker .
 */
package data;

import java.util.Scanner;

public class Worker extends Employee implements ISalary,ITaxable{
    private int overtime;

    public Worker() {
    }

    public Worker(int overtime, String ID, String name, int workedDay, int salary) {
        super(ID, name, workedDay, salary);
        overtime = this.overtime;
        
    }

    @Override
    protected void accept() {
        super.accept(); 
        Scanner o = new Scanner(System.in);
        while (true) {            
            try {
                System.out.print("Nhap overtime: ");
                overtime = Integer.parseInt(o.nextLine().trim());
                if (overtime>=0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi: "+e.getMessage());
            }
        }
    }
    
    
    @Override
    public void printInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getAllowance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getIncome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
