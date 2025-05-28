public class countingSort {
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int arr2[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            arr2[arr[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            while(arr2[i]>0){
                System.out.print(i);
                arr2[i]--;
            }
        }
    }
}
