public class arrayFunctionArgs {
    public static void calc(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        calc(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
