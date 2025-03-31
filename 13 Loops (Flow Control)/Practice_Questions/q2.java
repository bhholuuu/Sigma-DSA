import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int oddSum = 0, evenSum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter any number : ");
            int no = sc.nextInt();
            if (no % 2 == 0) {
                evenSum += no;
            } else {
                oddSum += no;
            }
        }
        System.out.println("Sum of odd numbers is : " + oddSum);
        System.out.println("Sum of even numbers is : " + evenSum);
        sc.close();
    }
}