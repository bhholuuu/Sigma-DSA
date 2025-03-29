import java.util.*;

public class printNonFactorOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println("enter : ");
            int no = sc.nextInt();
            if (no % 10 != 0) {
                System.out.println(no);
            } else {
                continue;
            }
            i++;
        }
        sc.close();
    }
}
