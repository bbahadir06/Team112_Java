package Day26_dateTime_Vararags;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

     /*
        When we use LocalTime, it takes the of the exact moment. It is not alive time. It does not change in coding.
        LocalTime.now() is used to take the time of the moment
        If we want to see time of another part of code, we should reuse LocalTime.now(); We should recreate another object
         */
        // to set a time, you can use LocalTime.of();
        LocalTime time1 = LocalTime.of(14,15);
        System.out.println(time1); // 14:15

        LocalTime time = LocalTime.now();
        System.out.println(time); // 16:09:02.321750
        System.out.println(time.plusHours(2)); // 18:09:02.321750
        System.out.println(time.plusHours(4).plusMinutes(20)); // 20:29:02.321750

        System.out.println(time.minusHours(15).minusSeconds(15)); // 01:08:47.321750

        System.out.println(time.withHour(10).withNano(25));  // 10:09:02.000000025

        System.out.println(time.withMinute(0).withSecond(0).withNano(0));  // 16:00

        System.out.println(time.compareTo(time1)); // 1 if the result is not zero, it means the times are not same
        System.out.println(time.compareTo(time)); // 0

        System.out.println(time.isAfter(time1)); // true
        System.out.println(time.isBefore(time1)); // false

        System.out.println(time.toSecondOfDay()); // 58142



    }
}
