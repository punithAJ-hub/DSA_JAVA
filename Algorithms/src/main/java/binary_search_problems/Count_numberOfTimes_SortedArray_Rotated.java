package binary_search_problems;

public class Count_numberOfTimes_SortedArray_Rotated {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,0};
        System.out.println("Number of time the array has been rotated :"+ (findPivot(arr)+1));
    }

        public static int findPivot(int[] arr){
            int start= 0;
            int end = arr.length-1;

            while(start<=end)
            {
                int mid = (start+end)/2;

                if(mid<end && arr[mid]>arr[mid+1])
                    return mid;
                if (mid>start && arr[mid]<arr[mid-1]) {
                    return mid-1;
                }
                if(arr[mid]>=arr[start])
                    start=mid+1;
                else{
                    end=mid-1;
                }
            }
            return -1;
        }

}
