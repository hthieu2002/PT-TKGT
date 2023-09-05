package buoi_2;

public class Ex1 {
    public static void main(String[] args) {
        int kq = mu(5,5);
        System.out.println(kq);
        System.out.println("============================");
        System.out.println(""+dequyMu(5,5));
    }

   static int mu (int x, int n){
        int tg = 1;
        for (int i = 0; i < n; i++){
            System.out.print("B" + i +": i = "+i+"\n Tg" + " = "+tg +" * " +x +" = ");
            tg *= x;
            System.out.println(tg);
        }
        return tg;

    }

    static int dequyMu(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.println("n = " + n + "\n Mu(" + x + "," + n + ")" + "=" + x + "*Mu(" + x + "," + (n-1) + ")");
            int temp = 0;
            int result = 0;
            temp = dequyMu(x, n - 1);
            result = x * temp;
            System.out.println("\tTrả về: " + "Mu(" + x + "," + n + ") = " + x + "*" + temp + " = " + result);
            return result;
        }
    }

}
