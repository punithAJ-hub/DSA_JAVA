public class Nto1 {
    // Program to print numbers from 1 to N

    public static void main(String[] args) {
            print(10);
            print1ToN(1);
            int product =productNto1(3);
            int sum = sumNto1(5);
            System.out.println(product);
            System.out.println(sum);

            int prodOfDigits = productofDigits(12345);
            System.out.println("prodOfDigits : " + prodOfDigits);

           int rev= reverseNumber(123);
            System.out.println("reverseNumber : " + rev);

    }

    private static int reverseNumber(int n) {
        if(n<10){
            return n;
        }
        return (n%10) + reverseNumber(n/10) *10;
    }

    private static int productofDigits(int i) {
        if(i<10){
            return i;
        }
        return i%10 * productofDigits(i/10);
    }

    private static int sumNto1(int i) {
        if(i==1){
            return i;
        }
        return  i+ sumNto1(i-1);
    }

    private static int productNto1(int i) {
        if(i==1)
            return i;
        return i* productNto1(i-1);
    }

    private static void print1ToN(int i) {
        if(i>10)
            return;
        System.out.println(i);
        print1ToN(i+1);
    }

    static void print(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

}
