import java.util.Arrays;

public class QuickSort {

    static void quick_sort(int[] a , int low, int high){

        if(low>=high)
            return;
        int s= low;
        int e = high;
        int m = (s+e)/2;

        //take middle as pivot
        int pivot = a[m];

        // Make sure to iterate from start to end
        while (s<=e){
            // when element left to pivot becomes great and right to pivot becomes less swap those
            while (a[s]<pivot){
                s++;
            }
            while (a[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }
        }

        // once pivot is in right place call  sort method again from low to end and start to high

        quick_sort(a,low,e);
        quick_sort(a,s,high);
    }


    public static void main(String[] args) {
        int[] a = {5,4,3,2,1,7,8};
        quick_sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
