package org.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField display;

    private Calculator calculator = new Calculator();
    private boolean isSecondOperand = false;

    @FXML
    private void handleButtonPress(ActionEvent event) {
        String buttonText = ((Button) event.getSource()).getText();

        if ("C".equals(buttonText)) {
            display.setText("");
            calculator.reset();
            isSecondOperand = false;
        } else if ("=".equals(buttonText)) {
            if (!isSecondOperand) {
                calculator.setOperand2(Double.parseDouble(display.getText()));
                calculator.calculate();
                if (calculator.isError()) {
                    display.setText("Error: Division by Zero");
                } else {
                    display.setText(String.valueOf(calculator.getResult()));
                }
                calculator.reset();
                isSecondOperand = false;
            }
        } else {
            if (isOperator(buttonText.charAt(0))) {
                if (!isSecondOperand) {
                    calculator.setOperand1(Double.parseDouble(display.getText()));
                    calculator.setOperator(buttonText.charAt(0));
                    isSecondOperand = true;
                    display.setText("");
                }
            } else {
                display.setText(display.getText() + buttonText);
            }
        }
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
