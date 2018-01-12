package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public class CityClock extends MainClock{
    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
