package binary_search_problems;

public class Find_In_Mountain_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int end = findPeak(arr);
        System.out.println(end);
        System.out.println(findElementUsingBS(arr,2,0,end));
    }

    // find the peak element and use it as end index it makes it easy to find the lowest index of the element

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;

    }

    static int findElementUsingBS(int[] arr , int target , int start , int end){

        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==target){
              return mid;
            }
            else if (target>arr[mid]){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
