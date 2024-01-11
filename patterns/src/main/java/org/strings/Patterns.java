package org.strings;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("==================");
        pattern2(5);
        System.out.println("==================");
        pattern3(5);
        System.out.println("==================");
        pattern4(5);
        System.out.println("==================");

        pattern6(5);


    }

    public static void pattern1(int n) {
        for (int r = 0; r < n; r++) {
            for (int c=0;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern2(int n){
        for (int r = n; r >0; r--) {
            for (int c = 0; c < r; c++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }

    public static void pattern3(int n) {
        for (int r = 0; r < n; r++) {
            for (int c=0;c<=r;c++){
                System.out.print(c+1 + " ");
            }
            System.out.println("");
        }
    }

    public static void pattern4(int n){
        for (int r = n; r >0; r--) {
            for (int c = 0; c < r; c++) {
                System.out.print( c+1 +" ");

            }
            System.out.println("");
        }
    }

    public static void pattern5(int n) {
        for (int r = 0; r <= 2*n-1; r++) {
            int c = r<n? r : 2*n-r-2;
            for (int i=0;i<=c;i++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern6(int n) {
        for (int r = 0; r < n; r++) {
            int s= n-r-1;
            for (int i = s; i > 0; i--) {
                System.out.print(" ");
            }

            for (int c=0;c<=r;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }



}
