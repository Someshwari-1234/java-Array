import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 2, 4};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);

        int result = -1;
        for (int num : arr) {
            if (map.get(num) == 1) {
                result = num;
                break;
            }
        }
        System.out.println("First non-repeating element: " + result);
    }
}
