import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = sc.nextLine();

        // Using StringBuilder for efficiency
        StringBuilder sb = new StringBuilder(originalString);
        sb.reverse();
        String reversedString = sb.toString();

        System.out.println("Reversed string: " + reversedString);
        sc.close();
    }
}
