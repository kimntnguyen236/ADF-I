
package demo;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class SinhVien {
    public String id, name;
    public int mark;

    public SinhVien() {
    }

    public SinhVien(String id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id : ");
        id = sc.nextLine().trim();
        System.out.print("Nhap name : ");
        name = sc.nextLine().trim();
        
        // diem kq phải la so nguyen 0-100
        while (true) {            
            System.out.print("Nhap mark : ");
            try {
                mark = Integer.parseInt(sc.nextLine().trim());
                if (mark>0 && mark <=100) {
                    break; //thoát khỏi vòng lặp nhập điểm
                }
                throw new ClassFormatError("Diem thi phai la so nguyen tu 0-100 !");
            } catch (IllegalFormatException e) {
                System.out.println("Loi: Nhap sai du lieu. Vui long nhap lai.");
                System.out.println("Loi he thong: " + e.getMessage());
            }
            catch(NumberFormatException e){
                System.out.println("Loi: Nhap sai inh dang du lieu. Vui long nhap lai.");
                System.out.println("Loi he thong: " + e.getMessage());
            } catch(Exception e){
                System.out.println("Loi: Vui long nhap lai.");
                System.out.println("Loi he thong: " + e.getMessage());
            }
            finally{
                System.out.println("Nhap du lieu xong!");
            }
        }    
    }
    @Override
    public String toString(){
        return String.format("%s - %s - %d", id, name, mark);
    }
}

