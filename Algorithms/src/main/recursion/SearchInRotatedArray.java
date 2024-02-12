public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,8,1,2,3} , 0 , 7 ,3));
    }

    static int search(int[] arr , int start , int end, int target ){

        if(start>end)
            return -1;
        int mid = (start+end)/2;

        if(arr[mid]==target)
            return mid;

        if(arr[mid]>arr[start] ){
            if (target >= arr[start] && target<=arr[mid])
                return search(arr, start , mid-1 , target);
            else
               return search(arr, mid+1 , end , target);
        }

        if(target >= arr[mid] && target<=arr[end]){
           return search(arr, mid+1 , end , target);
        }

           return search(arr, start , mid-1 , target);

    }
}
