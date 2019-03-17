package idv.hsu.LogarithmicRunTime;

public class LogarithmicRunTime {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(array, 4));
    }

    private static int binarySearch(int[] input, int key) {
        int low = 0;
        int high = input.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (input[mid] < key) {
                low = mid + 1;
            } else if (input[mid] > key) {
                high = mid - 1;
            } else if (input[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
