package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public class PhoneClock extends MainClock {
    private UtcTime utcTime;

    public PhoneClock(int utcOffset) {
        super(utcOffset);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }
}
