public class q6 {
    public static void main(String args[]){
        int no=4;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int sps=1;sps<=2*(no-i);sps++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=no;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int sps=1;sps<=2*(no-i);sps++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
