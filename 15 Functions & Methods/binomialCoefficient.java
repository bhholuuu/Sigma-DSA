import java.util.*;
public class binomialCoefficient {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factDiff = factorial(n-r);
        
        int bino=factN/(factR*factDiff);

        return bino;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number for Binomial Coefficient : ");
        int n= sc.nextInt();
        System.out.print("Enter second number for Binomial Coefficient : ");
        int r= sc.nextInt();
        System.out.println(binomial(n, r));
        sc.close();
    }
}
