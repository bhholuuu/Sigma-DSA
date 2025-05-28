import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        Integer arr2[]={5,4,1,3,2};
        System.out.println();
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}

