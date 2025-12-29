public class Palindrome {
    public static void main(String[] args) {
        int N=1331;
        int rev=0;
        int temp=N;

        while (N!=0){
            int lastdigit=N%10;
            rev=(rev*10)+lastdigit;
            N/=10;
            System.out.print(lastdigit);
        }
    
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
