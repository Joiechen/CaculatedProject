package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public abstract class MainClock {
    protected static int UTC_OFFSET = 0;
    protected int localTime = 0;

    public MainClock(int utcOffset) {
        UTC_OFFSET = utcOffset;
    }

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}
