package com.girldevelopit.kc.menu;

import java.util.Calendar;

/**
 * Represents a range of absolute dates.
 *
 * Created by michelle on 2/8/14.
 */
public class DateRange implements MenuRange {

   private Calendar beginning;
   private Calendar end;

   public DateRange(Calendar beginning, Calendar end) {
      this.beginning = beginning;
      this.end = end;
   }

   public boolean isInRange(Calendar date) {
      //If the the date is before the beginning or after the end, it's out of range
      return !(date.before(beginning) || date.after(end));
    }
}
