import java.util.Arrays;

public class TwoSum{

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int target = 4;
        System.out.println("Indexes is : "+ Arrays.toString(two_sum(arr,target)));
        
    }

    public static int[] two_sum(int arr[],int target){
         int st = 0;
         int en = arr.length-1;

         while(st < en){
            if(arr[st]+arr[en] == target){
                return new int[] {st,en};
            }else if(arr[st]+arr[en] < target){
                st++;
            }else{
                en--;
            }
         }
       
   return new int[] {-1,-1};
 }
}