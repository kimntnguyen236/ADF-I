/*
Create class Television derives from Product and implements ITax, in package Electronics.
- Fields: pprice, QoH (quantity on hand) and brand.
- Constructors to initialise the all fields.
- Override methods:
protected void accept() : allow user to input additional details of a television
invoke method accept() of super class. public String toString() : return a string presenting all the details of a product as follows: id, name, price, QoH, cost, amount (=cost*QoH, cost: price after TAX)
 */
package Electronics;

import Goods.*;
import java.util.Scanner;
public class Television extends Product implements ITax{
    public String brand;
    public int price,qoh;

    public Television() {
    }

    public Television(String brand, int price, int qoh, String id, String name) {
        super(id, name);
        this.brand = brand;
        this.price = price;
        this.qoh = qoh;
    }

    @Override
    protected void accept() {
        super.accept(); //hàm này đã nhập id và name
        
// viết lệnh nhập thêm brand, price, qoh
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap brand: "); brand = sc.nextLine().trim();
        while (true) {            
            try {
                System.out.print("Nhap price: ");
                price = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Loi:"+e.getMessage());
            }
        }
        while (true) {            
            try {
                System.out.print("Nhap so luong ton kho: ");
                qoh = Integer.parseInt(sc.nextLine().trim());
                if (qoh>0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi:"+e.getMessage());
            }
        }
        
    }
    
    
    
    @Override
    public void printInfo() {
        System.out.println("\n Thong tin san pham: ");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Thuong hieu: "+brand);
        System.out.println("Don gia: "+price);
        System.out.println("Don gia + VAT : "+getCost());
        System.out.println("So luong ton kho: "+qoh);
        System.out.println("Tri gia ton kho: "+(qoh*getCost()));
    }

    @Override
    public float getCost() {
        return price + price*VAT_TAX_PERCENT;
    }
        @Override
    public String toString(){
        return String.format("%s - %s - %s - %d - %d - %.2f",this.id,this.name, this.brand,this.price,this.qoh,qoh*getCost());
    }
}
