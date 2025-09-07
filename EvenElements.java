public class EvenElements {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 24, 31, 40, 55, 68};

        System.out.println("Even elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {   // check if element is even
                System.out.print(arr[i] + " ");
            }
        }
    }
}
