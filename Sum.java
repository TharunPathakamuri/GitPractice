import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number here: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number here: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
