package binary_search_problems;

public class PeakIndex_InAMountain {

    //we know after peak element the array will be in descending order
    //ex: 0 1 2 1 0
    //apply binary search check if arr[mid] > arr[mid+1] i.e we are in the descending part of array
    // it is safe to assume that the peak element might be present in the left of the array
    //so end = mid
    //if arr[mid] < arr[mid+1] we are in the ascending part so peak might be on the right side
    //so start = mid
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0};
        System.out.println(peakElement(arr));

    }

    static int peakElement(int[] arr){
        int start=0;
        int end= arr.length-1; //012

        while (start!=end){
            int mid= (start+end)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }

        return arr[start];
    }
}
