package FindString;

import java.util.LinkedList;
import java.util.Scanner;

public class findString {
    public static void findString(String str){
        //Tạo 2 stack để chứa phần tử
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        //Thuật toán tìm độ dài lớn nhất
        for (int i = 0; i <str.length() ; i++) {
               //Xét phần tử phải trên 2 && laasy phần tử cuối so sánh các phần tử vị trí i && kiểm tra phần tử đó có trong list không
            if (list.size() > 1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))) {
                //thỏa hết điều kiện thì xóa phần tử nhỏ nhất dựa vào bảng ASCII gì đấy :))
                list.clear();
            }
            //Rồi đưa vào list
            list.add(str.charAt(i));
            //tiếp tục từ list sang max
            if(max.size() < list.size()){
                max.clear();
                max.addAll(list);
            }
        }
        //In các phần tử của kết quả trong Stack max
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        String str = prompt.nextLine();
        findString(str);
    }
}
