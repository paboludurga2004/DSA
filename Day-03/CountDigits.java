class CountDigits {
    public static void main(String[] args) {
        int n=7789;
        int count=0;

        while (n>0){
            int digit=n%10;
            count++;
            n/=10;

        }
        System.out.print(count);
    }
}
