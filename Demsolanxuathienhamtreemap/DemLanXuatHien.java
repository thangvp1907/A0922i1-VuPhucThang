package Demsolanxuathienhamtreemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemLanXuatHien {
    public static void main(String[] args) {
        String  st1 ="Hello World";
        //đưa vào mảng và bỏ khoảng cách
        String [] arrSt1= st1.split(" ");
        //tạo Map
        Map<String,Integer> data = new HashMap<>();

        //dùng hàm for để đếm
        for(String s : arrSt1){
            if(data.containsKey(s)){
                //xuất hiện từ lấy ra và +1 giá trị khi nó tiếp tục xuất hiện
                data.replace(s,data.get(s)+1);
            }else{
                //nếu xuất hiện đầu,lấy ra và đặt giá trị là 1
                data.put(s,1);
            }
        }
        System.out.println(data.toString());
    }
}
