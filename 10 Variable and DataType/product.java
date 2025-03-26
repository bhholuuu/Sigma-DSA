import java.util.*;

public class product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Product of two numbers is : " + c);
        sc.close();
    }
}