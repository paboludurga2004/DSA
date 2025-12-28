public class Pattern05 {
    static void left_inverse_triangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        left_inverse_triangle(5);
    }
}
