package idv.hsu.ExponentialRunTime;

public class ExponentialRunTime {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        print(array);
    }

    private static void print(int[] input) {
        for (int x = 0; x < input.length; x++) {
            for (int y = input.length; y > 0; y-- ) {
                System.out.println(x + ", " + y);
            }
        }
    }
}
