public class largestInArray {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={4,6,3,8,4,9,31,6,4};
        System.out.println(largest(arr));
    }
}
