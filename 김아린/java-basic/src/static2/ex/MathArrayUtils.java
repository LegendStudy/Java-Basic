package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스를 생성하지 못하도록 생성자를 private으로 설정
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValues = values[0];
        for (int value : values) {
            if (value < minValues) {
                minValues = value;
            }
        }
        return minValues;
    }

    public static int max(int[] values) {
        int maxValues = values[0];
        for (int value : values) {
            if (value > maxValues) {
                maxValues = value;
            }
        }
        return maxValues;    }

}
