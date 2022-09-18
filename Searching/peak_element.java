package Searching;

public class peak_element {
    static int peakElement(int arr[]) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (((mid == 0) || arr[mid - 1] <= arr[mid]) && mid == n - 1 || arr[mid + 1] <= arr[mid]) {
                return mid;
            }

            if (mid > 0 && arr[mid + 1] >= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 40, 70 };
        System.out.println(arr[peakElement(arr)]);
    }
}
