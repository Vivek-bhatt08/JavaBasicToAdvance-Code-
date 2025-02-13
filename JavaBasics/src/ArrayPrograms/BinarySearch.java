package ArrayPrograms;
import java.util.Arrays;

public class BinarySearch{
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // To prevent overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {                     //{2,4,5,6,7,8}
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 15, 40,45,};
        int target = 45;

        // Ensure the array is sorted

        Arrays.sort(arr);

        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
