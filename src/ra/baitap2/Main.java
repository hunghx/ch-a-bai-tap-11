package ra.baitap2;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Map ( key : value )
        System.out.println("Nhập vào 1 chuỗi");
        Map<String,Integer> treeMap = new TreeMap<>();
        String string = new Scanner(System.in).nextLine();
        //string = chương trình sử dụng một TreeMap để lưu trữ
        String[] arrayString = string.split(" ");
        for (int i = 0; i < arrayString.length; i++){
            // duyệt mảng các từ rồi thêm vào treemap
            if(treeMap.containsKey(arrayString[i])){
                int value = treeMap.get(arrayString[i]);
                treeMap.put(arrayString[i], value+1);
            }else {
                treeMap.put(arrayString[i],1);
            }
        }
        Set<String> listKey = treeMap.keySet();
        for (String word: listKey) {
            System.out.printf("Từ %s xuất hiện %d lần \n",word,treeMap.get(word));

        }
    }
}
