public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(findSum(3));
    }

    public static int findSum(int n){
       if(n==0)
           return n;
        return n+findSum(n-1);
    }
}
