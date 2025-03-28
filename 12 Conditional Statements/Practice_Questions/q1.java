import java.util.*;

public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number : ");
        int no = sc.nextInt();
        if (no < 0) {
            System.out.println("negative");
        } else if (no > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
        sc.close();
    }
}