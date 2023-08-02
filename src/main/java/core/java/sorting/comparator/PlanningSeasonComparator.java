package core.java.sorting.comparator;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PlanningSeasonComparator implements Comparator<PlanningSeason>, Serializable {

    private static final Map<String, Integer> SEASON_ORDER_MAP = new HashMap<>();
    static {
        SEASON_ORDER_MAP.put("SPRING", 0);
        SEASON_ORDER_MAP.put("SUMMER", 1);
        SEASON_ORDER_MAP.put("FALL", 2);
        SEASON_ORDER_MAP.put("HOLIDAY", 3);
    }

    @Override
    public int compare(PlanningSeason first, PlanningSeason second) {
        int result = first.getYear().compareTo(second.getYear());

        if (result == 0) {
            String firstSeason = first.getDescription().toUpperCase();
            String secondSeason = second.getDescription().toUpperCase();

            result = SEASON_ORDER_MAP.get(firstSeason).compareTo(SEASON_ORDER_MAP.get(secondSeason));
        }

        return result;
    }
}
