/*
Create class TelevisionCatalog in package Electronics for managing a collection of Televisions:
- Fields: [max, count] int, tvList – array of Television.
- Default constructor to initialise the all the fields.
- Methods:
- Public void add() - add a new television into array
- Public void searchByBrand() - search televisions belong a brand name accepted by user.
- Public void displayAll() - display all televisions.
- Public void displayHighValue() – display televisions with the price above 500.
 */
package Electronics;

public class TelevisionCatalog {
    int max = 10,count=0;
    Television[] tvList = new Television[max];
    
    //thêm một tivi mới vô mảng (Hàm nhập)
    public void add(){
        if (max==count) {
            System.out.println("HT het bo nho luu tru! Tu choi them moi.");
            return; // trừ khi viết else mới không biết câu lệnh return
        }
        
        // tạo 1 đối tượng tivi
        Television tv = new Television();
        tv.accept(); // gọi hàm accept cho phép người dùng nhập chi tiết thông tin tv
        
        tvList[count] = tv;
        count++; // sau khi nhập xong tăng biến đếm count lên 1 đơn vị
    }
    
    //tìm kiếm các tivi theo thương hiệu người dùng nhập vào
    public void searchByBrand(String th){
        if(count==0){
            System.out.println("HT chua co du lieu!");
            return;
        }
        
        int cntTH=0;
        th = th.toLowerCase(); // đổi thành chữ thường
        for (int i = 0; i < count; i++) {
            if(tvList[i].brand.toLowerCase().contains(th)){
                // System.out.println(tvList[i]); dùng toString thì viết theo cách này
                tvList[i].printInfo();
                cntTH++;
            }
        }// kết thúc for
        if (cntTH==0) {
            System.out.println("Khong tim thay thuong hieu tivi : "+th);
        }
    }
    
    public void displayAll(){
        if(count==0){
            System.out.println("HT chua co du lieu!");
            return;
        }
        
        for (int i = 0; i < count; i++) {
                System.out.println(tvList[i]); //dùng toString thì viết theo cách này
        }// kết thúc for
    }
    
    
    // in ds tivi co don gia >=500
    public void displayHighValue(){
        if(count==0){
            System.out.println("HT chua co du lieu!");
            return;
        }
        
        int cnt500 = 0;
        for (int i = 0; i < count; i++) {
            if (tvList[i].price>=500) {
                System.out.println(tvList[i]);
                cnt500++;
            }
        }// kết thúc for
        
        if (cnt500==0) {
            System.out.println("Khong tim thay TIVI co don gia < 500");
        }
    }
    
    //in ds tivi co gia cao nhat
    public void displayMax(){
        if (count==0) {
            System.out.println("HT chua co du lieu");
            return;
        }
        int topPrice = tvList[0].price; // gia su tivi dau tien co gia cao nhat
        // tim don gia tivi cao nhat
        for (int i = 1; i < count; i++) {
            if (topPrice<tvList[i].price) {
                topPrice = tvList[i].price;
            }
        }
        
        // in ra danh sách tivi co don gia = topPrice
        for (int i = 0; i < count; i++) {
            if (tvList[i].price==topPrice) {
                System.out.println(tvList[i]);
            }
        }
    }
}
