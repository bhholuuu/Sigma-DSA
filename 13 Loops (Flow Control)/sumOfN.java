import java.util.*;

public class sumOfN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int no = sc.nextInt();
        int sum = 0;
        while (no > 0) {
            sum = no + sum;
            no--;
        }
        System.out.println("the sum is : " + sum);
        sc.close();
    }
}
