public class SecLargest {

    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,5,6,7,-8,-9};
        secLargest(arr);
    }

    // this is the optimal approach of finding sec largest number time complexity is O(n)
    public static void secLargest(int arr[]){

        int lar = arr[0];
        int secLar = Integer.MIN_VALUE;

        for(int i = 1;i<arr.length;i++){
            if(arr[i] > lar){
                secLar = lar;
                lar = arr[i];
            }else if( arr[i] < lar && arr[i] > secLar){
                secLar = arr[i];
            }
        }

        System.out.println("Sec Largest Number is : "+secLar);
    }

    // Other approach are first find largest and compare to sec Largest time complexity is O(n) + O(n)
    
}
