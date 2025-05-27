public class trappingRainwater {
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int lMax[]=new int[arr.length];
        int rMax[]=new int[arr.length];
        int leftMax=0, rightMax=0;
        for(int i=0;i<arr.length;i++){
            if(leftMax<arr[i]){
                leftMax=arr[i];
            }
            lMax[i]=leftMax;
            if(rightMax<arr[(arr.length-1)-i]){
                rightMax=arr[(arr.length-1)-i];
            }
            rMax[(arr.length-1)-i]=rightMax;
        }

        int sum=0, min, ans=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(lMax[i],rMax[i]);
            sum=min-arr[i];
            if(sum>0){
                ans=ans+sum;
            }else{
                ans=ans+0;
            }
        }
        System.out.println(ans);
    }
}
