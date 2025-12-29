public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
            System.out.print(digit);
        }
        if (sum==original){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not an Armstrong");
        }
    }
}
