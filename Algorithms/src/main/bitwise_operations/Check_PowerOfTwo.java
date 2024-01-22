/**
 * If n = 4 then binary representation = 100
 *
 * if 100 & 011 =0 then it is power of 2
 * i.e if n & (n-1) =0
 */
public class Check_PowerOfTwo {
    public static void main(String[] args) {
        int n=200;
        int n2= 32;
        System.out.println("Is power of two : " + ((n & (n-1))==0));
        System.out.println("Is power of two : " + ((n2 & (n2-1))==0));
    }
}
