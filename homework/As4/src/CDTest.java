
import java.util.Scanner;

/*
 Tạo Java Main Class CDTest, để thực hiện chức năng quản lý hệ thống kho dữ liệu CD, có nội dung như sau:
    i. Dữ liệu (fields – variable): - cdList (mảng chứa CD), - counter (biến đếm số lượng dĩa CD hiện đang lưu trữ trong danh sách cdList), - max (hằng, kích thước tối đa của mảng cdList).
    ii. Hàm dựng không tham số: khởi tạo mảng cdList (có kích thước theo hằng max), và reset biến counter về 0
    iii. Phương thức (Methods):
        1. void add(): thêm 1 CD mới vô cdList, nếu mảng không còn chổ trống in ra thông báo lỗi.
        2. void search(String cid): tìm kiếm CD trong danh sách theo mã số (cid) và in chi tiết cúa CD đó ra nếu tìm thấy, ngược lại thông báo lỗi.
        3. void displayAll (): In ra bảng danh sách các CD đang lưu trữ trong kho. Lưu ý sẽ in thông báo lỗi nếu kho chưa có dữ liệu
        4. void menu (): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách các CD có trong kho.
        5. static void main (): tạo 1 đối tượng kiểu CDTest, gọi phương thức menu() trên đối tượng này để thi hành chương trình.
 */

public class CDTest {
    int max = 10;
    int counter = 0;
    CD[] cdList = new CD[10];

    public CDTest() {
    }
    
    public CDTest(int max, int counter, CD[] cdList){
        max = this.max;
        counter = this.counter;
        cdList = this.cdList;
    }
    
    public void addCD(){
        if (counter==max) {
            System.out.print("Khong con cho trong!");
            return;
        }
        CD c = new CD();
        c.input();
        cdList[counter]=c;
        counter++;
    }
    
    public void searchCD(String cid){
        //xem hệ thống có dữ liệu không
        if (counter==0) {
            System.out.println("HT chua co du lieu! ");
            return;
        }
        int cntCD =0;
        for (int i = 0; i < counter; i++) {
            if (cdList[i].id.equalsIgnoreCase(cid)) {
                cdList[i].print();
                cntCD++;
            }
        }// kết thúc for
        if (cntCD==0) {
            System.out.println("Khong tim thay CD"+cid);
        }
    }
    
    public void displayAll(){
        if(counter==0){
            System.out.println("HT chua co du lieu !");
            return;
        }
        System.out.println("\n >>> Danh sach CD <<<");
        for (int i = 0; i < counter; i++) {
            System.out.println(cdList[i].toString());
        }
    }
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int op;
        
        while (true) {            
            System.out.println("\n \n >>>> Menu <<<<");
            System.out.println("1. Them 1 CD moi");
            System.out.println("2. Tim kiem CD ");
            System.out.println("3. In ds CD");
            System.out.println("4. Thoat");
            System.out.print(">>> Chon chuc nang [1-4]: ");
            op = sc.nextInt();
            
            switch(op){
                case 1: addCD(); break;
                case 2: Scanner sc3=new Scanner(System.in);
                    String cid;
                    System.out.println("Nhập ID của CD bạn cần tìm : ");
                    cid=sc3.nextLine().trim();
                    searchCD(cid);
                    break;
                case 3: displayAll(); break;
                case 4 : return;
            }
        }
    }
    public static void main(String[] args) {
        CDTest o = new CDTest();
        o.menu();
    }
    
}
