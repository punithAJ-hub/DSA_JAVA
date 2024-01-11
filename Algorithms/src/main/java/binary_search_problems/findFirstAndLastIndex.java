package binary_search_problems;

import java.util.Arrays;

public class findFirstAndLastIndex {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }

   static int search(int[] nums, int target , boolean searchForStartIndex){
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                //potential answer ( the target might be present on the left side or right side as well)
                ans=mid;
                // if need the first index then search left ( to search the target if it is on left side)
                if(searchForStartIndex){
                    end=mid-1;
                }
                //if we need last index search right( to search the target if it is on right side)
                else
                {
                    start=mid+1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {2,3,4,4,4,4,5,6,8,10};
        System.out.println(Arrays.toString(searchRange(arr,4)));
    }
}
