package com.gap.sample.practice.Springboot_practice.controller;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.LocalDate;

import javax.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.stream.IntStream;

@Getter
@Setter
public class TimePhased {

    private LocalDate startDate;
    private LocalDate endDate;

    public static void main(String[] args) {



    }

    private void isValidTimePhasedStartAndEndDateSequence(
            ConstraintValidatorContext constraintContext,
            List<TimePhased> timePhasedSizeRangeGroupsSizeProfile) {

        boolean isValid = IntStream.range(1, timePhasedSizeRangeGroupsSizeProfile.size())
                .allMatch(i -> (timePhasedSizeRangeGroupsSizeProfile.get(i).getStartDate())
                        .equals((timePhasedSizeRangeGroupsSizeProfile.get(i - 1).getEndDate())
                                .plusDays(1)));

        System.out.println(isValid);
    }
}

