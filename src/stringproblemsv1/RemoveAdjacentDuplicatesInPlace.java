package stringproblemsv1;

public class RemoveAdjacentDuplicatesInPlace {
    /*
     * 1047. Remove All Adjacent Duplicates In String
     * https://www.hackerrank.com/challenges/reduced-string/problem
     * */

    public static void main(String[] args) {
        System.out.println(removeAdjCharactersInPlace("abbaca"));
    }

    private static String removeAdjCharactersInPlace(String str){
        StringBuilder sb = new StringBuilder(str);
        removeAdjacent(sb,str.length());
        return sb.toString();
    }

    private static void removeAdjacent(StringBuilder sb, int n){
        int k = 0; //to store the index of string
        for(int i = 0 ; i < n ;i++){
            if(i < n-1 && sb.charAt(i) == sb.charAt(i+1)){
                while(i < n-1 && sb.charAt(i) == sb.charAt(i+1)){
                    i++;
                }
            }else {
                sb.setCharAt(k++,sb.charAt(i));
            }
        }
        sb.setLength(k);
        if(k != n){
            removeAdjacent(sb,k);
        }
    }
}
