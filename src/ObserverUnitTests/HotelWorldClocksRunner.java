package ObserverUnitTests;

import ObserverPattern.Demo1.*;

/**
 * Created by test on 18/1/12.
 */
public class HotelWorldClocksRunner {

    public static void main(String[] args) {
        UtcTime utcTime = new UtcTime();
        utcTime.attach("bejing",new CityClock(8));
        utcTime.attach("london",new CityClock(0));
        utcTime.attach("moscow",new CityClock(4));
        utcTime.attach("sydney",new CityClock(10));
        utcTime.attach("newYork",new CityClock(-5));

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);

        phoneClock.setLocalTime(9);

        utcTime.printTimeOfAllClocks();
    }
}
