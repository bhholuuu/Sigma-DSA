public class reverseArray {
    public static void reverse(int arr[]){
        int first=0, last=arr.length-1, temp;
        while (first<=last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        reverse(arr);
    }
}
