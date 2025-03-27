public class logicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a < b && a > b); // false && true = false
        System.out.println(a < b || a > b); // true || false = true
        System.out.println(!(a < b)); /* !(false) = true */
    }
}