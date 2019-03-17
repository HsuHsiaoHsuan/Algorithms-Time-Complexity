package idv.hsu.LinearRunTime;

import java.util.Arrays;

public class LinearRunTime {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        print(array);
    }

    private static void print(int[] input) {
        Arrays.stream(input).forEachOrdered(System.out::println);
    }
}
