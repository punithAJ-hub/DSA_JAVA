/** Number of digits in a given number n of base b
 * d = (log(n) / log(b)) +1
 */

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 45721;
        int base= 10;
        System.out.println("Number of digits = " + (int) ((Math.log(n)/Math.log(base)) +1 ));

        int n1 = 10;
        int base2 = 2;

        System.out.println("Number of digits = " + (int) ((Math.log(n1)/Math.log(base2)) +1 )); // 10 is written as 1010 so number of digits = 4


    }
}
