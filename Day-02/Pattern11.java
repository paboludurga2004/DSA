public class Pattern11 {
        static void left_and_right_triangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }
            for (int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        left_and_right_triangle(4);
    }

}
