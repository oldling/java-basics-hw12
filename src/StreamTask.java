import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {

        return Arrays.stream(numbers)
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .reduce(0, Integer::sum); //(sum, x) -> sum + x
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers)
            .filter(x -> x % 2 == 1 || x % 2 == -1)
            .sorted()
            .toArray();
    }
}

