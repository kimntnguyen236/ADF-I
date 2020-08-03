/*
Creates an abstract class named Product in package Goods.
- Protected Fields id, name
- Public constructor to initialise the above fields.
- Method:
- Protected void accept() : allow user input data into data fields.
- Public abstract void printInfo() : abtract method used to print details of an product.
 */
package Goods;

import java.util.Scanner;

public abstract class Product {
    protected String id,name;

    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }
    protected void accept(){ // hàm nhập liệu, protected chỉ có lớp con mới sd được
        Scanner sc = new Scanner(System.in); // nhập liệu thì sử dụng Scanner
        //nhập id
        System.out.print(">>> Nhap id: ");
        id = sc.nextLine().trim();
        // nhập name
        System.out.print(">>> Nhap name: ");
        name = sc.nextLine().trim();
    }
    
    // phương thức trừu tượng printInfo
    public abstract void printInfo();

}
