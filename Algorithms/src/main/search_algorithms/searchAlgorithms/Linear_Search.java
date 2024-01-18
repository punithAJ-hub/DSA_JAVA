package searchAlgorithms;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr= {4,2,5,7,8,9,3};
        System.out.println(search(arr,5));
    }

    public static int search(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

}
