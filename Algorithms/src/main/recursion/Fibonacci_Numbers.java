public class Fibonacci_Numbers {
    public static void main(String[] args) {
      //fibonacci numbers
      // 0 1 1 2 3 5 8 13
        System.out.println(fib(5));

    }

    public static int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fib(n-1)+fib(n-2);

    }


}
