public class Factorial {
    public static void main(String[] args) {
        // 3! = 3*2*1

        System.out.println(factorial(5));
    }

    static int factorial(int n){
        // break/base condition
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }
}
