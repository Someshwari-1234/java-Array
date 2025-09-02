public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.print("Intersection of arrays: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // To avoid printing duplicates
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr1[i] == arr1[k]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }
}
