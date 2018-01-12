package ObserverPattern.Demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by test on 18/1/11.
 */
public abstract class TimeSubject {

    protected Map<String,MainClock> clocks = new HashMap<String,MainClock>();

    public void attach(String cityName, MainClock mainclock) {
        MainClock put = clocks.put(cityName, mainclock);
    }

    public void detach(String cityName){
        clocks.remove(cityName);
    }

    public abstract void notifyAllClocks();

}
