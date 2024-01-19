public class Example1 {

    public static void main(String[] args) {
        //print 1 2 3 4 5
        print(1);

    }

    static void print(int n){
        //break condition
        if(n==6)
            return;
        System.out.println(n);
        print(n+1);
    }
}
