package ra.baitap4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int so = new Scanner(System.in).nextInt();
        Stack<Integer> listStack = new Stack<>();
        while(so!=0){
            int mod = so % 2;
            listStack.push(mod);
            so = so/2;
        }

        String bit = "";
        while (!listStack.isEmpty()){
            bit += listStack.pop();
        }
        System.out.println(" chuyển sang hệ nhị phân là "+ bit);
    }
}
