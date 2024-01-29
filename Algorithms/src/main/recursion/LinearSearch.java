public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,4,5,3} , 2,0));
    }

    static int search(int[] arr, int target, int index){
        if(arr[index]==target)
            return index;

        if(index> arr.length-1)
            return -1;

        return search(arr,target,index+1);
    }
}
