import java.util.*;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd=0, even=0;
        for(int i=0;i<10;i++){
            System.out.print("Enter any number : ");
            int no = sc.nextInt();
            if(no%2==0){
                even+=no;
            }else{
                odd+=no;
            }
        }
        System.out.println("Sum of Odd = "+odd);
        System.out.println("Sum of Even = "+even);
        sc.close();
    }
}