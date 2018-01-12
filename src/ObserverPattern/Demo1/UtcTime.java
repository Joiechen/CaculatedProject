package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public class UtcTime extends TimeSubject {

    private int utcZeroTime;

    @Override
    public void notifyAllClocks(){
        for (MainClock clock:super.clocks.values()) {
            clock.setLocalTime(MainClock.toLocalTime(this.utcZeroTime));
        }
    }

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
