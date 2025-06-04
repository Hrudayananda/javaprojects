package javapj;

import java.util.Arrays;

public class BinarySearchEx {

    public static void main(String[] args) {
        int[] numbers = {9, 7, 3, 1, 2, 8};
        Arrays.sort(numbers);
        int target = 3;
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                System.out.println("Found " + target + " at the index " + mid);
                found = true;
                break;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Number not found");
        }
    }
}
