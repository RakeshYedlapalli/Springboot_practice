package com.gap.sample.practice.scanning;

import org.joda.time.Days;

import java.time.LocalDate;
import java.util.Random;

import static org.joda.time.DateTimeConstants.DAYS_PER_WEEK;

public class RandomUpdate {
    public static void main(String[] args) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);

    }


}
