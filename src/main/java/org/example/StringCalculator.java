package org.example;

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

        int sum = 0;
        for (String part : apart) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}
