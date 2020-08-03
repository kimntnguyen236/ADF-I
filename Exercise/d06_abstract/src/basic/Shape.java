// shape là lớp cha tổng quát, khai báo cách tính diện tích, chu vi của 1 đối tượng hình học 2D bất kì
package basic;

public abstract class Shape {
    public static final float PI=3.1415f; // khai báo hằng số PI
    
    public abstract float area();
    public abstract float perimeter();
    
    @Override
    public String toString(){
        return String.format("DT : %8.2f, CV: %8.2f", area(), perimeter());
    }
}
