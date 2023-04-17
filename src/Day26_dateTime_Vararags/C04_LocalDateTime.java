package Day26_dateTime_Vararags;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt); // 2023-03-18T16:56:01.767657400

        System.out.println(dt.toLocalDate()); // 2023-03-18



    }
}
