package Array;

public class SortedArray {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1,2,7,4,5},0));


    }

    private static boolean sorted(int[] arr, int index) {
        // if I reach the last index that means my array is sorted so return true
        if(index==arr.length-1)
            return true;

        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }


}
