public class insertionSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        for(int i=1;i<arr.length;i++){
            int curr=arr[i], prev=i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
