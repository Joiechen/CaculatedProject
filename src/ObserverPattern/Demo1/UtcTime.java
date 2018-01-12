package ObserverPattern.Demo1;

/**
 * Created by test on 18/1/12.
 */
public class UtcTime extends TimeSubject {

    private int utcZeroTime;

    @Override
    public void notifyAllClocks(){
        for (MainClock clock:super.clocks.values()) {
            clock.setLocalTimeFromUtcZeroTime(this.utcZeroTime);
        }
    }

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    public void printTimeOfAllClocks() {
        for (String clockName : super.clocks.keySet()) {
            System.out.println(clockName + ": " + super.clocks.get(clockName).getTime());
        }
    }
}
