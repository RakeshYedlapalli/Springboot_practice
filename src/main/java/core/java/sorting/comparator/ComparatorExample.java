package core.java.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparatorExample {


    public static void main(String[] args) {
        ComparatorExample c = new ComparatorExample();
        c.arrayList();


    }

    private  void arrayList() {
        List<PlanningSeason> planningSeasons = new ArrayList<>(10);

        Map<String,Integer> map = new HashMap<>();
        map.put("hello",01);
        planningSeasons.add(PlanningSeason.of("Summer", "2020"));
        planningSeasons.add(PlanningSeason.of("Fall", "2020"));
        planningSeasons.add(PlanningSeason.of("Holiday", "2022"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));
        planningSeasons.add(PlanningSeason.of("Spring", "2025"));


//        LinkedListExample

        Collections.sort(planningSeasons , new PlanningSeasonComparator());


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(40);
        list.add(200);

        Collections.sort(list);
    }

    public void m1(){

    }
}
