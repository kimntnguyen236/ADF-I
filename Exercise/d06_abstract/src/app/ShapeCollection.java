/*
- Quan ly danh sach đối tượng hình học: hình tròn, hình chữ nhật.
- Bao gồm các chức năng: thêm 1 đối tượng hình học mới vô ds, liệt kê ds, tìm kiếm, xóa 
 */
package app;

import basic.*;
public class ShapeCollection {
    public int max=10;
    public int index = 0;
    Shape[] ds = new Shape[max];
    
    // hàm thêm 1 đối tượng hình tron vô ds
    
    public void addRectangle(){
        // kiểm tra mảng ds có còn chỗ trống hay không
        if(index==max){
            System.out.println("HT het cho luu tru. Tu choi them moi");
            return; // kết thúc hàm
        }
        
        Rectangle r = new Rectangle();
        r.input();
        
        ds[index] = r;
        
        index++;
    }
    public void addCircle(){
        // kiểm tra mảng ds có còn chỗ trống hay không
        if(index==max){
            System.out.println("HT het cho luu tru. Tu choi them moi");
            return; // kết thúc hàm
        }
        
        Circle r = new Circle();
        r.input();
        
        ds[index++] = r;
    }
    
    // hàm in ra tất cả các đối tượng hình học (tròn/ chữ nhật) trong ds
    public void display(){
        // kiểm tra dach sach có dữ liệu hay không?
        if(index == 0){
            System.out.println("He thong chua co du lieu!!!");
            return;
        }
        for(int i=0; i<=index; i++){
            System.out.println(ds[i]);//ds[i].toString()
        }
    }
    
    // in danh sách các hình có diện tích >= 50
    public void display50(){
        
    }
    
    // in danh sách các hình tròn
    public void displayCircle(){
        
    }
}
