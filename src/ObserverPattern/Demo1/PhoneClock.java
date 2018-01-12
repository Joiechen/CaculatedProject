package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public class PhoneClock extends MainClock {
    private UtcTime utcTime;

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
