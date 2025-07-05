package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, numbers.indexOf("\n"));
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
            numbers = numbers.replace(delimiter, ",");
        }

        String normalizedNumbers = numbers.replace("\n", ",");
        String[] apart = normalizedNumbers.split(",");

        List<Integer> negativenum = new ArrayList<>();

        int sum = 0;
        for (String part : apart) {
            int number = Integer.parseInt(part);
            if (number < 0) {
                negativenum.add(number);
            }
            sum += number;
        }
        if (!negativenum.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed " + negativenum);
        }

        return sum;
    }
}
