import java.util.*;

public class breakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        while (0 < 1) {
            System.out.print("Enter any number : ");
            no = sc.nextInt();
            if (no % 10 == 0) {
                break;
            }
        }
        sc.close();
    }
}