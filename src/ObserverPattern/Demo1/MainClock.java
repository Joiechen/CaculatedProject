package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public abstract class MainClock {
    private final int UTC_OFFSET = 0;
    private int localTime = 0;

    public abstract void setLocalTime(int localTime);
}
