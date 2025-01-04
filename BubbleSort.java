public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    public static void bubbleSort(int arr[]){

        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
