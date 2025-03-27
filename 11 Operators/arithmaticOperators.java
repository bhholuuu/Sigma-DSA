public class arithmaticOperators {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Folowing example is for binary operations...");
        int a = 3;
        int b = 6;
        int sum = a + b;
        System.out.println("a+b = " + sum);
        int sub = a - b;
        System.out.println("a-b = " + sub);
        int mul = a * b;
        System.out.println("a*b = " + mul);
        int div = a / b;
        System.out.println("a/b = " + div);
        int mod = a % b;
        System.out.println("a%b = " + mod);

        System.out.println();

        System.out.println("Following example is for unary operations...");
        int c = 5;
        int increment = ++c;
        System.out.println("Increment of c = " + increment);
        System.out.println();
    }
}
