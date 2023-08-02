package core.java.sorting.comparator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class PlanningSeason {

    private final String description;

    private final String year;

    @JsonCreator
    public static PlanningSeason of(
            @JsonProperty("description") String description,
            @JsonProperty("year") String year) {

        return new PlanningSeason(description, year);
    }

}
