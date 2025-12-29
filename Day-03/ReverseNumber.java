public class ReverseNumber {
    public static void main(String[] args) {
        int N=7789;
        int rev=0;
        while (N>0){
            int lastdigit=N%10;
            rev=(rev*10)+lastdigit;
            N/=10;
            System.out.print(lastdigit);
        }
    }
}
