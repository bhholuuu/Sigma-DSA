public class q9 {
    public static void main(String args[]){
        int no=3;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=no;i>=1;i--){
            for(int j=1;j<=no-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
