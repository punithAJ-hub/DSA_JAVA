import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        System.out.println(Arrays.toString(merge(arr)));
    }


    static int[] merge(int[] arr){

        if(arr.length==1)
            return arr;

        int mid = arr.length/2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left, right);
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int i=0,j=0,k=0;
        int[] merged = new int[left.length+right.length];
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                i++;
            }
            else{
                merged[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
          merged[k]=left[i];
          i++;
          k++;
        }
        System.out.println(i + " " + j);

        while (j<right.length){
            merged[k]=right[j];
            j++;
            k++;
        }
        return merged;
    }
}
