package searchAlgorithms;

public class Find_Min {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,2,-1,4,6};
        System.out.println("min :" + minimum(arr));
    }

    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i: arr){
            if(i<min)
                min=i;
        }
        return min;
    }
}
