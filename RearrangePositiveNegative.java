class RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4};
        int n = arr.length;
        int[] result = new int[n];
        int pos = 0, neg = 1;

        for (int num : arr) {
            if (num >= 0 && pos < n) {
                result[pos] = num;
                pos += 2;
            } else if (num < 0 && neg < n) {
                result[neg] = num;
                neg += 2;
            }
        }

        System.out.print("Rearranged: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
