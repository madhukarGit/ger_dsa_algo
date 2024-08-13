package stringproblemsv1;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    /*
    * 1047. Remove All Adjacent Duplicates In String
    * */

    static String str = "abbaca";
    static Stack<Character> characters = new Stack<>();
    public static void main(String[] args) {
        System.out.println(removeAdjChars(str));
    }

    private static String removeAdjChars(String s){
        for (int i = 0 ; i < str.length(); i++){
            if(characters.empty() || characters.peek() != str.charAt(i)){
                characters.push(str.charAt(i));
            }else{
                characters.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        while(!characters.empty()){
            result.append(characters.pop());
        }
        return result.reverse().toString();
    }
}
