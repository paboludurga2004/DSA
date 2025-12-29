import java.util.Math;

public class GCD {
    public static void main(String[] args) {
        int N1=9,N2=12;
        int gcd=1;

        for (int i = 1; i <= Math.min(N1, N2); i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
