public class Pattern15 {
    static void center_alphabet_triangle(int n){
        for (int i=1;i<=n;i++){
            char ch='A';
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print((char)(k+64));
            }
            for (int l=i-1;l>=1;l--){
                System.out.print((char)(l+64));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        center_alphabet_triangle(5);
    }
}
