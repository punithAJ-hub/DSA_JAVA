package binary_search_problems;

// [ 5,6,7,8,0,1,2,3]   the array is sorted but it is rotated

/**
 * Find the maximum element/pivot and apply binary search from start - pivot and pivot - end
 * so two subarrays will be formed and apply search for each

 case 1 : if arr[mid] > arr[mid+1] lets say my mid is 8 and next to mid is 0 so arr[mid]
  > arr[mid+1] --> arr[mid] is pivot.

 case 2 : if arr[mid] < arr[mid-1] lets say my mid is 0 and previous to mid is 8 so arr[mid]
 < arr[mid-1] --> arr[mid-1] is pivot.

 case 3 : if arr[mid] <= arr[start] then we can igonore all those which are after mid
          since we are looking for greater element then checking for smaller elements which is less than
          start is not needed

 case 4 : else the bigger elements might lie ahead of mid so start=mid+1;


 * **/
public class SearchIn_RotatedSorted_Array {
    public static void main(String[] args) {
        int[] arr= { 1};
        int pivot = findPivot(arr);
        int target = 0;

        //if pivot is not found it means it is not rotated so use normal binary search
        if(pivot==-1){
            binary_search(arr,target,0,arr.length-1);
        }

            /** case 1 : if target = pivot elemet **/
            if(arr[pivot]==target)
                System.out.println(pivot);
            /** case 2 : if target lies btn start and  pivot elemet **/
            else if (target>=arr[0] && target<=arr[pivot]) {
                System.out.println(binary_search(arr,target,0,pivot));
            }
            /** case 3 : if target lies between pivot and end of array elemet **/
            else{
                System.out.println(binary_search(arr,target,pivot+1,arr.length-1));
            }


    }
    static int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        int pivot =0;

        while(start<=end){
            int mid= (start+end)/2;
            // case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case 2
            else if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            //case 3
            else if (arr[mid]<= arr[start])
            {
                end = mid-1;
            }

            //case 4
            else{
                start= mid+1;
            }

        }
        return -1;
    }

    static int binary_search(int[] arr , int target , int start , int end) {
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
