/*
class Student chua thong tin bao gom mo ta sinh vien :
id, name, batch, namsinh, gioi tinh
 */
package app;

/**
 *
 * @author Thien Kim
 */
public class Student {
    //Cac thuoc tinh cua sinh vien
    public int id,yob;
    public String name;
    public static String batch; // dung chung cho tat ca cac doi tuong -> Static
    public boolean gender;

    @Override
    public String toString() {
        return String.format("%8d, %-20s, %8s, %5d, %s", id,name,batch,yob,gender?"Nam":"Nu");
    } 
}
