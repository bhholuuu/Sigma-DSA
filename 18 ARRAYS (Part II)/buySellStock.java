public class buySellStock {
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        int max=0,min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        System.out.println("Your Maximum profir = " + (max - min));
    }
}
