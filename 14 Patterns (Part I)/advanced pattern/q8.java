public class q8 {
    public static void main(String args[]){
        int no=5;
        for(int i=1;i<=no;i++){
            for(int sps=1; sps<=no-i;sps++){
                System.out.print(" ");
            }
            for(int j=1;j<=no;j++){
                if(i==1||i==5||j==1||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
