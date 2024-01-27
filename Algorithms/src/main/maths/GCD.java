public class GCD {
    public static void main(String[] args) {
        int x = 44;
        int y = 132;
        System.out.println(gcd(x,y));
    }

    static int gcd(int x , int y){
        if(x==0)
            return y;

        return gcd(y%x,x);
    }
}
