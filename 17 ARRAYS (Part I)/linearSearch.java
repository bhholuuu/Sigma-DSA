public class linearSearch {
    public static int linear(int arr[], int find){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int find=11;
        int arr[]={1,2,3,4,5};
        System.out.println(linear(arr, find));
    }
}
