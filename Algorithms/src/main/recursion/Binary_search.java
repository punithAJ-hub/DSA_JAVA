public class Binary_search {

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,3,4,7,8,9,10}, 0,7,10));
    }

    public static int search(int[] arr , int start , int end , int target ){
        if(start>=end)
            return -1;
        int mid = (start+end)/2;
        if(arr[mid]==target)
            return mid;
        else if (target>arr[mid])
            start=mid+1;
        else
            end=mid-1;

        return search(arr,start,end,target);
    }
}
