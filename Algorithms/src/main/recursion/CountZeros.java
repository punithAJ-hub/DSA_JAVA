public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(30204,0));
    }

    static int count(int n, int count){
        if(n==0)
            return count;
        if (n%10==0)
            count++;

        return count(n/10,count);
    }
}
