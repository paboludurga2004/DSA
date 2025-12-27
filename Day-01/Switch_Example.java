import java.util.Scanner;

public class Switch_Example {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are able to vote this");
                break;

            case 12:
                System.out.println("you are not able to vote this");
                break;

            default:
                System.out.println("Invalid case");
        }
    }
}
