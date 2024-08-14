package stringproblemsv1;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    /*
    * 1047. Remove All Adjacent Duplicates In String
    * https://www.hackerrank.com/challenges/reduced-string/problem
    * */

    static String str = "abba";
    static Stack<Character> characters = new Stack<>();
    public static void main(String[] args) {
        System.out.println(removeAdjChars(str));
    }

    private static String removeAdjChars(String s){
        for(int i = 0 ; i < s.length() ; i++){
            if(characters.empty() || characters.peek() != s.charAt(i)){
                characters.push(s.charAt(i));
            }else {
                characters.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!characters.empty()){
            sb.append(characters.pop());
        }
        return !sb.isEmpty() ? sb.reverse().toString() : "";
    }
}
