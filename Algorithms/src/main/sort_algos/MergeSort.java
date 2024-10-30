import java.util.Arrays;

public class MergeSort {

    static int[] merge_sort(int[] a){

        int mid = a.length/2;

        if(a.length==1){
            return a;
        }
        int[] left = merge_sort(Arrays.copyOfRange(a,0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(a,mid,a.length));

        return merge(left,right);

    }

    static int[] merge(int[] first , int[] second){
        int i=0;
        int j=0;
        int k=0;
        int[] res = new int[first.length+second.length];
        while (i<first.length && j< second.length){
            if(first[i]<second[j]){
                res[k]=first[i];
                i++;
            }
            else {
                res[k]= second[j];
                j++;
            }

            k++;
        }

        while (i<first.length){
            res[k]=first[i];
            i++;
            k++;
        }

        while (j<second.length){
            res[k]=second[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1,6,8};
        int[] result = merge_sort(a);
        System.out.println(Arrays.toString(result));
    }
}
