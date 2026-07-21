import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a palindrome. ");
        String a = s.nextLine();

        boolean ispalindrome = true;

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                ispalindrome = false;
                break;
            }
        }

            if (ispalindrome) {
                System.out.print(a + " is a palindrome.");
            } else {
                System.out.print(a + " is not a palindrome.");
            }


    }
}

/* pro version:
String reversed = new StringBuilder(a).reverse().toString();

if (a.equals(reversed)) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not palindrome");
}
 */
