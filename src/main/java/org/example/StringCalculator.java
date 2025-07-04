package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.contains(",")) {
            String[] apart = numbers.split(",");
            int sum = 0;
            for (String part : apart) {
                sum += Integer.parseInt(part);
            }
            return sum;
        }

        return Integer.parseInt(numbers);
    }
}
