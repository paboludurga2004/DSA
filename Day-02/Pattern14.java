public class Pattern14 {
    static void left_alphabet_inverse_triangle(int n){
        for (int i=n;i>=1;i--){
            char ch='A';
            for (int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        left_alphabet_inverse_triangle(5);
    }
}
