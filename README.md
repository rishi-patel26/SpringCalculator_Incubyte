📘 String Calculator – Incubyte Assessment

✅ Features & Test Cases Implemented

Handles empty string input and returns 0
Returns the number itself for single value inputs
Supports addition for two or more comma-separated numbers
Accepts newline characters (\n) between numbers
Allows custom delimiters (e.g., //;\n1;2)
Detects and throws an error for negative numbers
Displays all negative numbers in the exception message

▶ Sample Usage
java
Copy
Edit
calculator.add("");            // returns 0
calculator.add("1");           // returns 1
calculator.add("1,2");         // returns 3
calculator.add("1,2,3,4,5");   // returns 15
calculator.add("1\n2,3");      // returns 6
calculator.add("//;\n1;2");    // returns 3

// Negative numbers throw an exception
calculator.add("-1,2");        // Exception: "negative numbers not allowed -1"

🛠 How to Run
Make sure you have Java and a testing framework like JUnit set up.
Compile and run your tests to verify functionality.
You can extend the logic further by supporting:
Ignoring numbers larger than 1000
Allowing delimiters of any length
Supporting multiple delimiters
