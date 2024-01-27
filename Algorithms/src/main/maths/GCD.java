public class GCD {
    public static void main(String[] args) {
        int x = 44;
        int y = 132;
        int gcd = gcd(x,y);

        System.out.println("HCF :  " + gcd(x,y));

        int f=x/gcd;
        int g = y/gcd;

        System.out.println("LCM :" + (f*g*gcd));
    }

    static int gcd(int x , int y){
        if(x==0)
            return y;

        return gcd(y%x,x);
    }
}
