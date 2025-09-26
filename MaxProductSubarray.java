public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int maxProd = arr[0], minProd = arr[0], result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(arr[i], arr[i] * maxProd);
            minProd = Math.min(arr[i], arr[i] * minProd);
            result = Math.max(result, maxProd);
        }

        System.out.println("Maximum Product Subarray: " + result);
    }
}
