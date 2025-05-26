import java.util.*;
public class q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number to print Table : ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(num+" * "+ i + " = "+num*i);
            System.out.println();
        }
        sc.close();
    }
}