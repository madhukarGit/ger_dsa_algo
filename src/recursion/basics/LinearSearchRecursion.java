package recursion.basics;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 9;
        System.out.println(linearSearch(arr,0,target));
    }

    private static int linearSearch(int[] arr, int index , int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return linearSearch(arr, index+1, target);
        }
    }
}
