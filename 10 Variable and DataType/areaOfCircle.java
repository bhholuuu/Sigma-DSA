import java.util.*;

public class areaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println("Area is : " + area);
        sc.close();
    }
}