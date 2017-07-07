package com.kozyrev.other_package;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by sergii on 7/3/17.
 */
public class MyCalendar {
    public void showCurrentDay() {
        GregorianCalendar d = new GregorianCalendar();
        int dauOfMonth = d.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = d.get(Calendar.DAY_OF_WEEK);
        System.out.println("current day of month-" + dauOfMonth);
        System.out.println("current day of week-" + dayOfWeek);
    }

}
