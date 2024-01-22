/**
 * Sum of nth row in a pascal's triangle is = 2 pow n-1 = 1<< (n-1)
 * Pascal's Triangle
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
public class Pascals_triangle {
    public static void main(String[] args) {
        int n =6;
        System.out.println("Sum of 6th pascal's row = " + (1<<(n-1)));
    }
}
