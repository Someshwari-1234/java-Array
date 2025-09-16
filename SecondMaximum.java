public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7, 8, 9};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum (array may have all equal elements).");
        } else {
            System.out.println("Second Maximum = " + secondMax);
        }
    }
}
