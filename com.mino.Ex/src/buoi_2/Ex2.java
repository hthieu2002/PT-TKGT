package buoi_2;

import java.util.Arrays;

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
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
