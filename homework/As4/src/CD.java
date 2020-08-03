
import java.util.Scanner;

/*
i. Dữ liệu (fields – variable): id, title, type, price, year
ii. Hàm dựng (constructors):
        1. Không tham số CD() , gọi hàm input()
        2. Có tham số CD(String, String, String, int, int)
iii. Phương thức:
        1. void input() : cho phép nhập dữ liệu vô các fields của 1 đối tượng CD. Lưu ý: type chỉ nhận giá trị Audio, hoặc Video
        2. void print() : cho phép xuất thông tin chi tiết của 1 CD
 */
public class CD {
    public String id, title, type;
    public int price, year;

    public CD() {
    }

    public CD(String id, String title, String type, int price, int year) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id : "); id=sc.nextLine().trim();
        System.out.print("Nhap title : "); title = sc.nextLine().trim();
        while (true) {            
            System.out.print("Nhap type [Audio/Video]: ");
            type = sc.nextLine().trim();
            if(type.equalsIgnoreCase("Audio")|| type.equalsIgnoreCase("Video")){
                break;
            }
        }
        System.out.print("Nhap price: "); price = sc.nextInt(); // Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhap year: "); year = sc.nextInt(); //Integer.parseInt(sc.nextLine().trim()); 
    }
    public void print(){
        System.out.println("Thong tin chi tiet 1 CD: ");
        System.out.println("Id : "+this.id);
        System.out.println("Title : "+this.title);
        System.out.println("Type : "+this.type);
        System.out.println("Price : "+ this.price);
        System.out.println("Year : "+this.year);
    }
}
