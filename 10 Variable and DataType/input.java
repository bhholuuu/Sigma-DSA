import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = sc.next();
        System.out.println("Hello, " + name);
        sc.close();
    }
}