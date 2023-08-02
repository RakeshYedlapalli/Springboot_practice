package com.gap.sample.practice.geeksforgeek;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAnElementInArray {


    public static void main(String[] args) {

//        int[] arr = { 1, 3, 5, 7, 9 };
//        int index = binarySearch(arr, 1);
//        System.out.println(index);

        Set<String> set = new HashSet<>();
        set.add("Rakesh");

        System.out.println(set.stream().collect(Collectors.toConcurrentMap(i -> i, FindAnElementInArray::m1)));


        String ss = "currentDate_3";
        System.out.println("currentDate".contains(ss));


        LocalDate lo = LocalDate.now().plusWeeks(106);
        System.out.println(lo);

        LocalDate flowdate = LocalDate.parse("2022-07-25");
        int war = calculateWeeksAtRegularPrice(flowdate,lo);
        System.out.println(war);



    }

    public static Integer calculateWeeksAtRegularPrice(LocalDate flowDate, LocalDate markdownDate) {
        // Days of week are being mapped from the default Monday-start week to a Sunday-start week since
        // Gap's fiscal week begins on Sunday
        LocalDate flowDateRoundedToPreviousSunday = calculatePreviousSunday(flowDate);
        LocalDate markdownDateRoundedToPreviousSunday = calculatePreviousSunday(markdownDate);

        Integer daysBetweenRoundedDates =
                Days.daysBetween(flowDateRoundedToPreviousSunday, markdownDateRoundedToPreviousSunday).getDays();
        return daysBetweenRoundedDates / 7;
    }


    private static Integer mapDayOfWeekFromMondayStartToSundayStart(Integer dayOfWeek) {

        if (dayOfWeek == null) {
            return null;
        }

        if (dayOfWeek == 7) {
            return 1;
        }

        return dayOfWeek + 1;
    }


    private static LocalDate calculatePreviousSunday(LocalDate localDate) {
        Integer dayOfWeek = mapDayOfWeekFromMondayStartToSundayStart(localDate.getDayOfWeek());
        return localDate.minusDays(dayOfWeek - 1);
    }
    public static String m1(String s) {
        return "";
    }


    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
