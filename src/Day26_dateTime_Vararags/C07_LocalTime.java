package Day26_dateTime_Vararags;

import java.time.LocalTime;
import java.time.ZoneId;

public class C07_LocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time); // 17:04:00.767991600

        LocalTime localTime1 = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(localTime1); // 14:04:00.769710400

        LocalTime localTime2 = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(localTime2); // 10:04:00.771750800

    }
}
