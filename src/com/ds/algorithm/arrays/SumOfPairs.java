package com.ds.algorithm.arrays;

import org.joda.time.DateTimeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

/**
 * @author vidit.singh
 * @created 01/12/2021 - 14:08
 */
public class SumOfPairs {

    public static void main(String[] args) throws ParseException {

        int[] array = {1, 9, 4, 2, 7, 8, 6};
        Set<Integer> set = new HashSet<>();
        int target = 11;

        for (int i = 0; i < array.length; i++) {

            if (!set.contains(target - array[i])) {
                set.add(array[i]);
            } else {
                System.out.println(array[i] + "," + (target - array[i]));
                break;
            }
        }

    }

}
