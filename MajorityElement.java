public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        int count = 0, candidate = -1;

        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        // Verify
        count = 0;
        for (int num : arr) if (num == candidate) count++;
        if (count > arr.length / 2)
            System.out.println("Majority Element: " + candidate);
        else
            System.out.println("No majority element");
    }
}
