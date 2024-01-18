import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = {2,4,1,8,6,9,7,5};
        int arr2[] ={1,2,3,4,5};
        System.out.println(Arrays.toString(sort(arr2)));
    }

    public static int[] sort(int[] arr){
        boolean sorted=true;
        for (int i = 0; i <arr.length ; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sorted=false;
                }
            }
            if(sorted){
                break;
            }
        }
        return  arr;
    }
}
