import java.util.*;

public class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + " * " + i + " = " + (no * i));
        }
        sc.close();
    }
}
