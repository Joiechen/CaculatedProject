package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public abstract class MainClock {
    protected int UTC_OFFSET = 0;
    protected int localTime = 0;

    public MainClock(int utcOffset) {
        UTC_OFFSET = utcOffset;
    }

    public abstract void setLocalTime(int localTime);

    public String getTime() {
        return String.valueOf(this.localTime);
    }

    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        this.localTime = MainClock.makeHourWithin0To23(utcZeroTime + this.UTC_OFFSET);
    }
}
