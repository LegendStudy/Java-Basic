package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static float average(int[] values) {
        return (float) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            minValue = minValue > value ? value : minValue;
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            maxValue = maxValue < value ? value : maxValue;
        }
        return maxValue;
    }
}
