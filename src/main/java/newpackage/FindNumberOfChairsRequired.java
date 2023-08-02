package newpackage;

import java.util.Arrays;
import java.util.Comparator;

public class FindNumberOfChairsRequired {


    public static void main(String[] args) {

//        int[][] timeStamps = {{900, 1230}, {1000, 1200}, {1400, 1800}, {2000, 2100}};
        int[][] timeStamps = {{900, 1230}, {1000, 1200}, {1400, 1800}, {1402, 1900}, {1403, 1500},{1401, 2000}, {1400, 2200}, {2000, 2100}};
        Arrays.sort(timeStamps, Comparator.comparingInt(a -> a[0]));
//        int numberOfChairsRequired = getNumberOfChairsRequired(timeStamps);
        find(timeStamps);
//        System.out.println("Chairs required: " + numberOfChairsRequired);
    }


    public static void find(int[][] time_stamps) {
        int numberOfChairsNeeded = 1;
        for (int i = 1; i < time_stamps.length; i++) {
            int[] previous = time_stamps[i - 1];
            int[] after = time_stamps[i];
            if (after[1] <= previous[1]) {
                numberOfChairsNeeded++;
            }

        }
        System.out.println("NUmber of chars required are =>" + numberOfChairsNeeded);
    }

    public static int getNumberOfChairsRequired(int[][] timeStamps) {
        // Sort the time stamps in ascending order based on the entry time


        int maxChairs = 0;
        int currentChairs = 0;

        for (int[] timeStamp : timeStamps) {
            int entryTime = timeStamp[0];
            int exitTime = timeStamp[1];

            // Check if the current employee overlaps with any previous employees
            if (entryTime < exitTime) {
                currentChairs++;

                // Update the maximum number of chairs required
                maxChairs = Math.max(maxChairs, currentChairs);
            } else {
                // If the current employee's entry time is greater than or equal to their exit time,
                // they don't require a chair, so decrement the currentChairs count
                currentChairs--;
            }
        }

        return maxChairs;
    }
}
