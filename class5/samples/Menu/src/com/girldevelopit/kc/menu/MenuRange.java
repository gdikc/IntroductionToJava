package com.girldevelopit.kc.menu;

import java.util.Calendar;

/**
 * Interface for capturing rules around when a menu might be valid based on a date
 *
 * Created by michelle on 2/8/14.
 */
public interface MenuRange {

    boolean isInRange(Calendar calendar);

}
