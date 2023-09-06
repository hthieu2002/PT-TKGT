package buoi_2;

public class Ex2 {
    public static void main(String[] args) {
       int n = 6;
       System.out.println(fib(n));
    }

    static int fib(int n) {
        int a = 1;
        int b = 1;
        int c;
        if(n <= 1){
            return 1;
        }
        for(int i = 2; i <= n; i++) {
            System.out.print("i = "+ i + "\n");
            c = a + b;
            System.out.print("\tb = "+a +"+"+b +"=");
            a = b;
            
            b = c;
            System.out.println(b);
        }
        return b;
    }
}
