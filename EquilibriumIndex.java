class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int totalSum = 0, leftSum = 0;

        for (int num : arr) totalSum += num;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // right sum
            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index = " + i);
            }
            leftSum += arr[i];
        }
    }
}
