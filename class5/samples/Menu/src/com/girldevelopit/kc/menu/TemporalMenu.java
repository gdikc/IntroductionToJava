package com.girldevelopit.kc.menu;

import java.util.Calendar;

/**
 * Created by michelle on 2/8/14.
 */
public class TemporalMenu extends Menu {

   private MenuRange validRange;

   public TemporalMenu(String name, MenuRange range) {
       super(name);
       validRange = range;
   }

   public TemporalMenu(String  name) {
       super(name);
   }

   public boolean isValid(Calendar date) {
       return validRange.isInRange(date);
   }
}
