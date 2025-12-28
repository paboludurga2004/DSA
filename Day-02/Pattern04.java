public class Pattern04 {
    static void left_column_number_triangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        left_column_number_triangle(5);
    }
}
