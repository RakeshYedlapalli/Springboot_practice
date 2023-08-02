package com.gap.sample.practice.schedular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class SchedulerToTriggerHealthEndpoints {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("88 99 200");
        data.add("88 99 300");
        data.add("99 32 100");
        data.add("12 12 15");
        data.add("66 77 15");
        data.add("77 66 15");

        System.out.println(processLogs(data,2));
    }

    public static List<String> processLogs(List<String> logs, int threshold) {

        Map<String, Integer> map = new HashMap<>();
        for (String logLine : logs) {
            String[] log = logLine.split(" ");
            map.put(log[0], map.getOrDefault(log[0], 0) + 1);
            if (!Objects.equals(log[0], log[1])) {
                map.put(log[1], map.getOrDefault(log[1], 0) + 1);
            }
        }

        List<String> userIds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= threshold) {
                userIds.add(entry.getKey());
            }
        }

        Collections.sort(userIds, Comparator.comparingInt(Integer::parseInt));

        return userIds;
    }

}
