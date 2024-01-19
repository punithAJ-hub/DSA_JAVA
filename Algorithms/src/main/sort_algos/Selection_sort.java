import java.util.Arrays;

/** Select an element and put it at it's correct index
 * Basically select max element and put it at right place
 *
 ***/


public class Selection_sort {

    public static void main(String[] args) {
        int[] nums={3,2,4,3,6,1};
        System.out.println(Arrays.toString(sort(nums)));
    }

    public static int[] sort(int[] arr){
        int j= arr.length;
        for (int i = 0; i < arr.length ; i++) {
            int max = maxElement(arr, j);
            swap(arr,max,j-1);
            j--;
        }
        return arr;
    }

    static int maxElement(int[] arr , int n){
        int index=0;
        int max=arr[0];
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }

    static void swap(int[] arr, int a , int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}

