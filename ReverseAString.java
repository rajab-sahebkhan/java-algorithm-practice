import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word to reverse it: ");

        String a = s.nextLine();

        for(int i = a.length() - 1; i>=0; i--){
            System.out.print(a.charAt(i));
        }

    }
}
/* String reversed = new StringBuilder(a).reverse().toString();
System.out.println(reversed);*/

/* OR
String reversed = "";

for(int i = a.length() - 1; i >= 0; i--){
    reversed += a.charAt(i);
}

System.out.println(reversed);
 */
