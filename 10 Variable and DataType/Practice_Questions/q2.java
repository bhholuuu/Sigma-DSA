import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of Square is : " + area);
        sc.close();
    }
}