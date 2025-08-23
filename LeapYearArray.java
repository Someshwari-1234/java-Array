import java.util.Scanner;

public class LeapYearArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many years user wants to check
        System.out.print("Enter number of years: ");
        int n = sc.nextInt();

        // Create array of size n
        int years[] = new int[n];

        // Take input for years
        System.out.println("Enter " + n + " years:");
        for (int i = 0; i < n; i++) {
            years[i] = sc.nextInt();
        }

        // Check each year
        for (int i = 0; i < n; i++) {
            int year = years[i];
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}
