public class q7 {
    public static void main(String args[]){
        int no=5;
        for(int i=1;i<=no;i++){
            for(int sps=1; sps<=no-i;sps++){
                System.out.print("   ");
            }
            for(int j=1;j<=no;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
