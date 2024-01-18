package binary_search_problems;



public class FindElement_InAInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=10;
        //lets divide the range into chunks and increase the range exponentially

        int start=0;
        int end =1;
        while(target>arr[end]) {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }

        System.out.println(searchRange(arr,target,start,end));

    }

    static int searchRange(int[] arr, int target, int start, int end){

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
