import java.util.*;
public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt(), factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial = "+factorial);
        sc.close();
    }
}