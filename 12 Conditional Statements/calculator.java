import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();
        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}