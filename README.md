# FXcalculator

A simple JavaFX calculator application that performs basic arithmetic operations (addition, subtraction, multiplication, and division) using the Model-View-Controller (MVC) design pattern.


The goal of this project is to create a user-friendly calculator application that implements basic arithmetic operations while adhering to the MVC design pattern for better separation of concerns and maintainability.

## Features

Basic Operations: Supports addition, subtraction, multiplication, and division.
User-Friendly Interface: Designed with JavaFX for a clean and intuitive GUI.
Clear Functionality: Allows users to reset the calculator easily.
Error Handling: Graceful management of errors, including division by zero.
Installation

## To run the CalculatorApp, ensure you have the following prerequisites:

Java Development Kit (JDK): Version 11 or higher
JavaFX SDK
Steps to Install
Clone the Repository:
bash
Copy code
git clone https://github.com/yourusername/CalculatorApp.git
cd CalculatorApp
Set Up Your IDE (e.g., IntelliJ IDEA):
Open the project in your IDE.
Configure the JavaFX SDK in your project settings.
Run the Application:
Use the IDE's run configuration or run the Main class from the terminal.
Usage

Launch the application.
Enter numbers using the digit buttons (0-9).
Select an arithmetic operation by clicking the corresponding operator button.
Click the equals button (=) to see the result.
Use the "Clear" button to reset the calculator.
Architecture

Model
The Calculator class handles the core logic, including operand management and calculations.

java
Copy code
public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;
    private double result;
    private boolean isError;

    // Methods: setOperand1, setOperand2, setOperator, calculate, getResult, isError, reset
}
View
The GUI consists of:

A TextField for displaying inputs and results.
Buttons for digits (0-9), operators (+, -, *, /), an equals button (=), and a clear button.
Controller
The CalculatorController class manages user interactions and connects the model to the view.

java
Copy code
public class CalculatorController {
    // Handles button events and updates the UI accordingly
}
Error Handling

The application effectively manages errors:

Division by zero triggers an error message ("Error: Division by Zero") displayed in the TextField.
Users can reset the calculator using the "Clear" button after an error.
Testing

The application has been thoroughly tested for:

Correctness of arithmetic operations.
Handling of edge cases, including division by zero.
Overall user experience and responsiveness.
Contributing

Contributions are welcome! If you would like to contribute, please fork the repository and submit a pull request with your enhancements.
