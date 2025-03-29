public class checkIfPrime {
    public static void main(String[] args) {
        int no = 7;
        for (int i = 2; i < no - 1;) {
            if (no % i == 0) {
                System.out.println("Not Prime");
                break;
            } else {
                System.out.println("Prime");
                break;
            }
        }
    }
}
