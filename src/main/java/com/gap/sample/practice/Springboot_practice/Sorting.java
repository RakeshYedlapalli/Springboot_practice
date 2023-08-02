package com.gap.sample.practice.Springboot_practice;

import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArrays(new int[]{9, 6, 4, 0, 3, 4, 3, 2, 7, 5})));

        String markdownDate = calculateMarkdownDateStringFrom("2014-05-09", 444);
        System.out.println(markdownDate);

        String s1 = "/size-range-groups/search?marketChannelStrategyId=2818482/46&hierarchyNodeId=ab730bd7-18d0-4c57-8c6b-b2f89b0d5c62&sizeModelId=5c13f4cc-e7db-4722-a316-604622cba51f&weeksAtreg=999";

        String s2 = "/size-range-groups/search?marketChannelStrategyId=281848245&hierarchyNodeId=ab730bd7-18d0-4c57-8c6b-b2f89b0d5c62&sizeModelId=5c13f4cc-e7db-4722-a316-604622cba51f&weeksAtreg=999";
        System.out.println(s1.equals(s2));
    }



    public static String calculateMarkdownDateStringFrom(String flowDate, Integer weeksAtRegularPrice) {
        if (flowDate == null || weeksAtRegularPrice == null) {
            return null;
        }

        LocalDate markdownDate = LocalDate.parse(flowDate).plusWeeks(weeksAtRegularPrice);
        if (markdownDate.getDayOfWeek() != DateTimeConstants.SUNDAY) {
            markdownDate = markdownDate.minusDays(markdownDate.getDayOfWeek());
        }
        return markdownDate.toString();
    }

    public static int[] sortArrays(int[] arr) {

        // Finding the length of array 'arr'
        int length = arr.length;

        // Sorting using a single loop
        for (int j = 0; j < length - 1; j++) {

            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {

                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                //   j = -1;
            }
        }

        return arr;
    }
}
