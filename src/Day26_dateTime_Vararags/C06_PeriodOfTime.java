package Day26_dateTime_Vararags;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1984,1,31);
        System.out.println("birthday : "+birthDay);     // birthday : 1984-01-31

        LocalDate today = LocalDate.now();
        System.out.println("today : "+today);       // today : 2023-03-18

        System.out.println(Period.between(birthDay, today)); // P39Y1M18D
        System.out.println(Period.between(birthDay, today).getYears()); // 39
        System.out.println(Period.between(birthDay, today).getDays()); // 17


    }
}
