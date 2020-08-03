/*
Fields: cList – array of customers, count – the number of customers stored in array.
- No-agr constructor to initialize the all the fields.
- Methods:
- add() - add a new customer into array
- searchByName(String name) - search customers having name passed by user.
- displayAll() - display all customers.
 */
package data;

import java.util.Scanner;

public class CustomerCatalog {
    int max=10, count=0;
    Customer[] cList = new Customer[max];

    public CustomerCatalog() {
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        if (count==max) {
            System.out.println("HT het bo nho luu tru! ");
            return;
        }
        Customer c = new Customer();
        c.accept();
        cList[count]=c;
        count++;
    }
    public void searchByName(String name){
        if (count==max) {
            System.out.println("HT chua co du lieu");
            return;
        }
        int cntName = 0;
        for (int i = 0; i < count; i++) {
            if (cList[i].name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(cList[i]);
                cntName++;
            }
        }
        if (cntName==0) {
            System.out.println("HT khong tim thay customer co ten "+name);
        } else{
            System.out.println("HT tim thay "+cntName+" customer co ten "+name);
        }
    }
    
    public void displayAll(){
        if (count==0) {
            System.out.println("HT chua co du lieu");
            return;
        }
        System.out.println(">>> Danh sach customer <<<");
        for (int i = 0; i < count; i++) {
            System.out.println(cList[i]);
        }
    }
}
