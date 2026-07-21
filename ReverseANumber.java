import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int a = s.nextInt();

        int reversed = 0;

        while(a != 0){
            int c = a%10;
            reversed = reversed * 10 + c;
            a = a/10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
