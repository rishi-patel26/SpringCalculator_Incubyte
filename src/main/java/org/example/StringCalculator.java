package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if(numbers.contains(",") || numbers.contains("\n")){

            String normalizedNumbers = numbers.replace("\n", ",");
            String[] apart = normalizedNumbers.split(",");
            int sum=0;
            for(String part : apart){
                sum += Integer.parseInt(part);
            }
            return sum;
        }

        return Integer.parseInt(numbers);
    }
}
