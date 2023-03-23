package ra.baitap6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String expression = new Scanner(System.in).nextLine();
        Boolean check = isTrueBracket(expression);
        System.out.println(check);

    }
    public static boolean isTrueBracket(String expression){
        Stack<Character> listCharacter = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '('){
                listCharacter.push(expression.charAt(i));
            }
            if (expression.charAt(i) == ')'){
                if(listCharacter.isEmpty()){
                    return false;
                }else {
                    listCharacter.pop();
                }
            }
        }
        if (listCharacter.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
