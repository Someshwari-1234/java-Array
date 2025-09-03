public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 5, 6, 75, 34, 12, 45, 56, 65};
        int target = 34;

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index when found
            }
        }
        return -1; // not found
    }
}
