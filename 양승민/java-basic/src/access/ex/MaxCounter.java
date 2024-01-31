package access.ex;

public class MaxCounter {

    private int count = 0;
    private final int maxCount;

    public MaxCounter(int count) {
        maxCount = count;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        if (count == maxCount) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }
}
