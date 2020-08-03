
import java.util.Scanner;

public class IQTest {

    public static void main(String[] args) {
        IQTest o = new IQTest();
        o.menu();
    }
    // tạo các field dữ liệu (biến - variable)
    Scanner in; // lớp có hàm thư viên nhập liệu
    int marks = 0; // điểm tổng
    boolean ansE, ansM, ansA, ansG; // trạng thái trả lời của từng câu hỏi

    // Tạo các method (hàm - function) QuestionEnglish() , QuestionApt() , QuestionMath() và QuestionGK() thực hiện chức năng kiểm tra trình độ tiếng anh, kỹ năng, toán và kiến thức tổng quát.
    // Lưu ý, với mỗi loại câu hỏi người thi chỉ được trả lời 1 lần (dựa vào biến ansE, ansM, ansA, ansG).
    void QuestionEnglish() {
        if (ansE == false) {
            System.out.println("The meaning of 'Boy' is: ");
            System.out.println("1. Con trai");
            System.out.println("2. Con gai");
            System.out.println("3. Ong cu");
            System.out.println("4. Ba cu");
            System.out.print(">>>> The answer is (1-4): ");
            in = new Scanner(System.in); // khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 1) {
                marks += 10; // trả lời đúng: +10 điểm
            }
            ansE = true; // đánh dấu trạng thái đã trả lời câu hỏi tiếng anh
        } else {
            System.out.println(">>>> The question was answered already.");
        }
    }

    void QuestionApt() {
        if (ansA == false) {
            System.out.println("The meaning of 'Girl' is: ");
            System.out.println("1. Con trai");
            System.out.println("2. Con gai");
            System.out.println("3. Ong cu");
            System.out.println("4. Ba cu");
            System.out.print(">>>> The answer is (1-4): ");
            in = new Scanner(System.in); // khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 2) {
                marks += 10; // trả lời đúng: +10 điểm
            }
            ansA = true; // đánh dấu trạng thái đã trả lời câu hỏi 
        } else {
            System.out.println(">>>> The question was answered already.");
        }
    }

    void QuestionGK() {
        if (ansG == false) {
            System.out.println("The meaning of 'Dog' is: ");
            System.out.println("1. Con trai");
            System.out.println("2. Con gai");
            System.out.println("3. Con cho");
            System.out.println("4. Con meo");
            System.out.print(">>>> The answer is (1-4): ");
            in = new Scanner(System.in); // khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 3) {
                marks += 10; // trả lời đúng: +10 điểm
            }
            ansG = true; // đánh dấu trạng thái đã trả lời câu hỏi 
        } else {
            System.out.println(">>>> The question was answered already.");
        }
    }

    void QuestionMath() {
        if (ansM == false) {
            System.out.println("1 + 1 = ? : ");
            System.out.println("1. 5");
            System.out.println("2. 4");
            System.out.println("3. 3");
            System.out.println("4. 2");
            System.out.print(">>>> The answer is (1-4): ");
            in = new Scanner(System.in); // khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 4) {
                marks += 10; // trả lời đúng: +10 điểm
            }
            ansM = true; // đánh dấu trạng thái đã trả lời câu hỏi
        } else {
            System.out.println(">>>> The question was answered already.");
        }
    }

    // tạo method menu()
    // Thiết kế menu để người thi có thể chọn lựa câu hỏi muốn trả lời (do – while, swich case)
    //Chương trình chỉ dừng lại khi người chơi trả lời đủ 4 loại câu hỏi. Trước khi kết thúc chương trình, phải in ra điểm kết quả (= điểm tổng+ điểm thưởng) và đánh giá trình độ IQ của người chơi.
    void menu() {
        Scanner in = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Test IQ: ");
            System.out.println("1. English");
            System.out.println("2. Aptitude");
            System.out.println("3. General Knowledge");
            System.out.println("4. Mathematics");
            System.out.println("5. Exit");
            System.out.print("\t \t Please choose from 1 -5: ");

            op = in.nextInt();
            switch (op) {
                case 1:
                    QuestionEnglish();
                    break;
                case 2:
                    QuestionApt();
                    break;
                case 3:
                    QuestionGK();
                    break;
                case 4:
                    QuestionMath();
                    break;
                case 5:
                    if (ansA && ansE && ansG && ansM) {
                        // tính điểm bonus
                        int bonus;
                        bonus = in.nextInt();
                        if (marks == 40) {
                            bonus = 10;
                        } else if (marks == 30) {
                            bonus = 5;
                        } else if (marks == 20) {
                            bonus = 2;
                        }
                        // tính điểm kết quả
                        marks = marks + bonus;
                        // xuất điểm kết quả và nhận xét
                        if (marks == 50) {
                            System.out.println("U r a genius");
                        } else if (marks == 35) {
                            System.out.println("U r intelligent");
                        } else if (marks == 22) {
                            System.out.println("Ur IQ level is average");
                        } else {
                            System.out.println("Ur IQ level is below average");
                        }
                        break;
                    } else {
                        System.out.println("Cannot exit program !");
                    }
            }
        } while (op != 5);
    }
}
