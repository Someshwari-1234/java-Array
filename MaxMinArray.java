public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 25, 3, 19};
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
