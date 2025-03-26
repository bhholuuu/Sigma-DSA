import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("The total price of pencil, pen and eraser is : " + total);
        sc.close();
    }
}