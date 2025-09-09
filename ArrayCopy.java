public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];  // same size as arr1

        // Copying elements one by one
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Printing copied array
        System.out.print("Copied Array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
