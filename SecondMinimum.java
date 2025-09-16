public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7, 2, 9};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum (array may have all equal elements).");
        } else {
            System.out.println("Second Minimum = " + secondMin);
        }
    }
}
