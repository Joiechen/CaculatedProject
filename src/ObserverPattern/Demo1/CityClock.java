package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public class CityClock extends MainClock{
    public CityClock(int utcOffset) {
        super();
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
