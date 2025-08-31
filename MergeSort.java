package practiceProgms;
import java.util.Arrays;

public class MergeSort {
    
    // Main method
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    
    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find middle
            int mid = (left + right) / 2;
            
            // Recursively divide left & right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
    
    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        
        // Merge temp arrays back into arr[]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
