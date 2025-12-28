public class Pattern06 {
    static void left_inverse_number_triangle(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        left_inverse_number_triangle(5);
    }
}
