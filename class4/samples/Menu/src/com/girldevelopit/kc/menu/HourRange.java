package com.girldevelopit.kc.menu;

import java.util.Calendar;

/**
 * Represents a range of hours during the day such as 8AM-10AM
 *
 * It supports a 24-hour based hour system, e.g. 11PM is 23
 *
 * Created by michelle on 2/8/14.
 */
public class HourRange implements MenuRange {

    private int beginningHour;
    private int endingHour;

    public HourRange(int beginning, int ending) {
        this.beginningHour = beginning;
        this.endingHour = ending;
    }

    @Override
    public boolean isInRange(Calendar calendar) {
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        return hour >= beginningHour && hour <= endingHour;
    }
}
