package com.xiaoGuo.community.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateUtil {
    //今天
    public static LocalDateTime getTodayStart() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
    }

    public static LocalDateTime getTodayEnd() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
    }

    //昨天
    public static LocalDateTime getYesterdayStart() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        return LocalDateTime.of(yesterday, LocalTime.MIN);
    }

    public static LocalDateTime getYesterdayEnd() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        return LocalDateTime.of(yesterday, LocalTime.MAX);
    }

    //最近7天
    public static LocalDateTime getLastSevenDaysStart() {
        LocalDate lastSevenDaysStart = LocalDate.now().minusDays(6);
        return LocalDateTime.of(lastSevenDaysStart, LocalTime.MIN);
    }

    public static LocalDateTime getLastSevenDaysEnd() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
    }

    //最近30天
    public static LocalDateTime getLastThirtyDaysStart() {
        LocalDate lastThirtyDaysStart = LocalDate.now().minusDays(29);
        return LocalDateTime.of(lastThirtyDaysStart, LocalTime.MIN);
    }

    public static LocalDateTime getLastThirtyDaysEnd() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
    }

    //本月
    public static LocalDateTime getCurrentMonthStart() {
        LocalDate currentMonthStart = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        return LocalDateTime.of(currentMonthStart, LocalTime.MIN);
    }

    public static LocalDateTime getCurrentMonthEnd() {
        LocalDate currentMonthEnd = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        return LocalDateTime.of(currentMonthEnd, LocalTime.MAX);
    }

    //上月
    public static LocalDateTime getLastMonthStart() {
        LocalDate lastMonthStart = LocalDate.now().minusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
        return LocalDateTime.of(lastMonthStart, LocalTime.MIN);
    }

    public static LocalDateTime getLastMonthEnd() {
        LocalDate lastMonthEnd = LocalDate.now().minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
        return LocalDateTime.of(lastMonthEnd, LocalTime.MAX);
    }

    // Add more functions for other options as needed
}