# 📘 String Calculator – Incubyte Assessment

## ✅ Features & Test Cases Implemented

 #### Handles empty string input and returns 0
 #### Returns the number itself for single value inputs
 #### Supports addition for two or more comma-separated numbers
 #### Accepts newline characters (\n) between numbers
 #### Allows custom delimiters (e.g., //;\n1;2)
 #### Detects and throws an error for negative numbers
 #### Displays all negative numbers in the exception message
 
## Sample Usage

#### calculator.add("");            // returns 0  
#### calculator.add("1");           // returns 1  
#### calculator.add("1,2");         // returns 3  
#### calculator.add("1,2,3,4,5");   // returns 15  
#### calculator.add("1\n2,3");      // returns 6  
#### calculator.add("//;\n1;2");    // returns 3  

#### // Negative numbers throw an exception
#### calculator.add("-1,2");        // Exception: "negative numbers not allowed -1"

## 🛠 How to Run

#### ✅ Make sure Java is installed on your system
#### ✅ Set up a Java testing framework (e.g., JUnit)
#### ✅ Compile the project and run your test cases
#### ✅ Logic can be extended to include:
#### Ignoring numbers greater than 1000
#### Allowing multiple delimiters (e.g., //[*][%]\n1*2%3)
