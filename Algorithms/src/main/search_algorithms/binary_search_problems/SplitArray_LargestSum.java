package binary_search_problems;

/**
 * Problem statement:
 * Given an array and a number m if we split the array into m continuous non epmty arrays
 * find the min sum among the largest.
 * example : [7,2,5,10,8] m=2
 * it can be split in 4 ways
 * [7] [2,5,10,8] -> largest sum amoung sub arrays = 25
 * [7,2] [5,10,8] -> largest sum amoung sub arrays = 23
 * [7,2,5] [10,8] -> largest sum amoung sub arrays = 18
 * [7,2,5,10] [8] -> largest sum amoung sub arrays = 24
 *
 * The minimum sum among largest sums is 18 and hence the answer is 18
 * **/


/** Solution :
 * let's say if m=1 what will be the answer -> it will be the max element in array
 * let's say if m=N that is size of array then -> it is the sum of the array
 * So we can consider that min limit is max element and max limit is sum of the array
 *
 * let's say start = min limit and end = max limit and mid=(start+end)/2
 * Let's try to split the array so that the sum <=mid and also take count of subarrays formed
 * for the above example start = 10 end = 32 and mid = 21
 * [7,2,5]=14 < 21 and [10,8] <21 and count =2
 * if my count <= m then end=mid else start = mid+1
 * so in the above case end=21 and mid= 10+21 /2 = 16
 *[7,2,5]=14 <15 and [10] < 16 and [8] < 16 and count =3
 * since count > m
 * so start =mid -> start = 16 and end = 21 mid = 18
 *[7,2,5]=14 <18 and [10] < 18 and [8] < 18 and count =3
 * again count > m
 * so end = 18 and start is 16 hence new mid = 17
 * again count will be 3 so start =18 and end is 18 so mid =18
 * so we found the answer when start = end
 */




public class SplitArray_LargestSum {
    public static void main(String[] args) {
        int[] arr= {7,2,5,10,8 };
        int m =2;
        int start =0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start= Math.max(start , arr[i]);
            end= end+ arr[i];
        }

        System.out.println(findMinOfLargestSum(arr,start,end,m));

    }

    public static int findMinOfLargestSum(int[] arr, int start , int end , int m){

        while (start<end){

            int mid = (start+end)/2;
            // calculate num of pieces
            int sum=0;
            int pieces =1;
            for(int i=0;i<arr.length;i++){

                if(sum+arr[i]>mid){
                    sum=arr[i];
                    pieces++;
                }
                else{
                    sum+=arr[i];
                }
            }
            if(pieces<=m){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
    return end;
    }
}
