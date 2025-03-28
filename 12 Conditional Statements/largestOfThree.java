public class largestOfThree {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        if (a > b && a > c) {
            System.out.println("'A' is largest");
        } else if (b > a && b > c) {
            System.out.println("'B' is largest");
        } else {
            System.out.println("'C' is largest");
        }
    }
}