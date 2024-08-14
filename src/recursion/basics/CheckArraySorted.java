package recursion.basics;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};
        System.out.println(checkSorted(arr, 0));;
    }

    private static boolean checkSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && checkSorted(arr, index+1);
    }
}
