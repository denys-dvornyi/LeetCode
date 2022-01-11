package com.deno4ka.Other;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;

public class LocalDateTimeExamples {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDate myBirthday = LocalDate.of(2022, 9, 1);
		System.out.println(myBirthday);
		LocalDate parsedDate = LocalDate.parse("2022-02-22");
		System.out.println(parsedDate);
		LocalDateTime tomorrow = now.plusDays(1);
		System.out.println(tomorrow);
		LocalDateTime yesterday = tomorrow.minus(2, ChronoUnit.DAYS);
		System.out.println(yesterday);
		DayOfWeek myBirthdayDayOfWeek = myBirthday.getDayOfWeek();
		System.out.println(myBirthdayDayOfWeek);
		LocalDateTime startOfParsedDate = parsedDate.atStartOfDay();
		System.out.println(startOfParsedDate);
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstDayOfMonth);
		LocalTime sixThirty = LocalTime.parse("06:30");
		System.out.println(sixThirty);
		LocalTime maxTime = LocalTime.MAX;
		System.out.println(maxTime);
		LocalDateTime maxDate = LocalDateTime.MAX;
		System.out.println(maxDate);
		LocalDateTime minDate = LocalDateTime.MIN;
		System.out.println(minDate);
		System.out.println(now.getMonth());
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);
		ZonedDateTime timeInBerlin = ZonedDateTime.of(now, ZoneId.of("Europe/Berlin"));
		System.out.println(timeInBerlin);
		LocalDateTime iWasBorn = LocalDateTime.of(1983, 9, 1, 23, 40);
		System.out.println(iWasBorn);
		long daysAfterIwasBorn = ChronoUnit.DAYS.between(iWasBorn, now);
		System.out.println(daysAfterIwasBorn);
		long weeksAfterIwasBorn = ChronoUnit.WEEKS.between(iWasBorn, now);
		System.out.println(weeksAfterIwasBorn);
		long monthsAfterIwasBorn = ChronoUnit.MONTHS.between(iWasBorn, now);
		System.out.println(monthsAfterIwasBorn);

		LocalDate newTuesday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(newTuesday);

		LocalDate secondSaturdayOfCurrentMonth = LocalDate
				.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), 1)
				.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(secondSaturdayOfCurrentMonth);

		Instant instant = new Date().toInstant();
		System.out.println(instant);
	}

}
