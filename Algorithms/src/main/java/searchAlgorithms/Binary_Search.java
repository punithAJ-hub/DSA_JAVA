package searchAlgorithms;

public class Binary_Search {

    public static void main(String[] args) {
        int[] arr= {1,4,5,9,14,18,21,30,44,89,112,145};
        System.out.println(search(arr,22));
    }

    public static int search(int[] arr , int target){
        int start=0;
        int end = arr.length;
        while(start<end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
