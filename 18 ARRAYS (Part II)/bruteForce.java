public class bruteForce {
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int curr=arr[0],max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr+=arr[k];
                }
                if(max<curr){
                    max=curr;
                }
            }
        }
        System.out.println(max);
    }
}
