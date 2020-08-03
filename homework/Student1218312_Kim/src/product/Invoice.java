package product;

import java.util.Scanner;

public class Invoice extends Item {

    public int maxItem = 10, nextItem = 0;
    Item[] arrItem = new Item[maxItem];

   
    void addItem() {
        if(nextItem==maxItem){
            System.out.println("Hệ thống hết chỗ lưu trữ !! ");
            return;
        }
                      
        Item c=new Item();
        c.Input();
        
        arrItem[nextItem]=c;
        nextItem++;
    }
    
    void displayAll(){
        if (nextItem == 0) {
            System.out.println("Danh sach trong!");
        } else {
            for (int i = 0; i < nextItem; i++) {
                arrItem[i].displayDetails();
            }
        }
    }
    
    public void searchItem(String th){
        int cnt = 0;
        th = th.toLowerCase();
        for(int i = 0;i<nextItem;i++){
            if(arrItem[i].name.toLowerCase().contains(th)){
                arrItem[i].displayDetails();
                cnt++;
            }
            if(cnt==0){
                System.out.println("No item to display");
            }
        }
    }
}
