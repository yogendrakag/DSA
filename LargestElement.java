public class LargestElement {

    public static void main(String[] args) {
        int arr[] = { -1, 2, 4, 5, 6, -2, -5 };
        System.out.println("largest number is " + largest(arr));
    }

    // Best Approach in O(n) time complexity
    public static int largest(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Brute force approach is sort the array in assending order and print last
    // element of array
}