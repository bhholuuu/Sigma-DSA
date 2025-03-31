public class q3 {
    public static void main(String args[]) {
        int no = 5, ans = 1;
        for (int i = 1; i <= no; i++) {
            ans *= i;
        }
        System.out.println("Factorial of " + no + " is: " + ans);
    }
}
