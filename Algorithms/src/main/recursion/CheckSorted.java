public class CheckSorted {
    public static void main(String[] args) {
        System.out.println(check(new int[]{1,2,4,5,3} , 0));
    }

    static boolean check(int[] arr, int index){
        if(index==arr.length-1)
            return true;

        return arr[index]<arr[index+1] && check(arr, index+1);
    }
}
