import java.util.*;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        float income = sc.nextFloat();
        float tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (income * 20) / 100;
        } else {
            tax = (income * 30) / 100;
        }
        System.out.println("Your tax is : " + tax);
        float total = income + tax;
        System.out.println("tatao payable amount : " + total);
        sc.close();
    }
}