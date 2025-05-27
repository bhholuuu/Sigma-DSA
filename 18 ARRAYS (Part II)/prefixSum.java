public class prefixSum {
    public static void main (String args[]){
        int arr[]={1,-2,6,-1,3};
        int prefix[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                int end=j;
                sum=0;
                for(int k=0;k<=end;k++){
                    sum=sum+arr[k];
                }
                prefix[i]=sum;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(prefix[i]);
        }

        //find specific
        int no1=2, no2=3;
        System.out.println("answer is : " + (prefix[no2]-(prefix[no1-1])));
    }
}