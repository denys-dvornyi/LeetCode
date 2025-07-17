package com.deno4ka.Other;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TimeFromWar {

    public static void main(String[] args) {
        LocalDateTime startOfWar = LocalDateTime.of(2022, Month.FEBRUARY, 24, 5, 0);
        LocalDateTime now = LocalDateTime.now();

        long monthsAfterWar = ChronoUnit.MONTHS.between(startOfWar, now);
        long weeksAfterWar = ChronoUnit.WEEKS.between(startOfWar, now);
        long daysAfterWar = ChronoUnit.DAYS.between(startOfWar, now);
        long hoursAfterWar = ChronoUnit.HOURS.between(startOfWar, now);
        System.out.printf("War continues:" +
                        "\n\t %d months" +
                        "\n\t %d weeks" +
                        "\n\t %d days" +
                        "\n\t %d hours",
                monthsAfterWar, weeksAfterWar, daysAfterWar, hoursAfterWar);
    }

}
