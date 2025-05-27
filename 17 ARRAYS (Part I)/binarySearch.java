public class binarySearch {
    public static int binarySearchh(int arr[], int findd){
        int first=0, last=arr.length-1;
        while(first <= last){
            int mid=(last+first)/2;
            if(mid<findd){
                first=mid+1;
            }
            if(mid>findd){
                last=mid-1;
            }
            if(mid==findd){
                return mid;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int findd=10;
        System.out.println(binarySearchh(arr, findd));
    }
}
