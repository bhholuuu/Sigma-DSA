public class q5 {
    public static void main(String arrgs[]){
        int no=5;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
