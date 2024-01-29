public class ReverseANumber {
    static int sum=0;
    public static void main(String[] args) {
        revRecursion(1234);
        System.out.println(sum);
    }

    static int reverse(int n){
        int rev=0;

       while (n>0){
           int rem= n%10;
           rev=rev*10+rem;
           n=n/10;
       }
       return rev;
    }

    static void revRecursion(int n ){
        if(n == 0)
            return;
        sum=sum*10+ (n%10);
        revRecursion(n/10 );
    }
}
