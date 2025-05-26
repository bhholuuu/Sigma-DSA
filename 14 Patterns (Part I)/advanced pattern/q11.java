public class q11 {
    public static void main(String args[]){
        int no=5;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
