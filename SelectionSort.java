// Time complexity of selection sort is O(n^2) in every case
public class SelectionSort {

    public static void main(String[] args){
        int arr[] = {5,8,3,2,1,4,5,67,8};
        selectioSort(arr);

        for (int  i : arr) {
            System.out.print(i +" ");
            
        }

    }

    public static void selectioSort(int arr[]){


        for(int i = 0;i<arr.length;i++){
            int min = i;

            for(int j = i;j<arr.length;j++){
                // get minimum number
                if(arr[j] <= arr[min]){
                        min = j;
                }
            }
            // Swap Numbers

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
}
