package calculator;

import javax.swing.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
//    private static final Logger logger = LogManager.getLogger(App.class);
    private Utils utils = new Utils();
    private double result = 0.0;
    private double num1=0.0;
    private double num2=0.0;
    private int choice=0;

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton clear;
    private JButton nine;
    private JButton six;
    private JButton one;
    private JButton two;
    private JButton four;
    private JButton seven;
    private JButton decimal;
    private JButton three;
    private JButton five;
    private JButton eight;
    private JButton zero;
    private JButton log;
    private JButton power;
    private JButton fact;
    private JButton sqrt;
    private JButton equal;

    public App() {

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+one.getText();
                textDisplay.setText(Text);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+two.getText();
                textDisplay.setText(Text);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+three.getText();
                textDisplay.setText(Text);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+four.getText();
                textDisplay.setText(Text);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+five.getText();
                textDisplay.setText(Text);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+six.getText();
                textDisplay.setText(Text);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+seven.getText();
                textDisplay.setText(Text);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+eight.getText();
                textDisplay.setText(Text);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+nine.getText();
                textDisplay.setText(Text);
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Text = textDisplay.getText()+zero.getText();
                textDisplay.setText(Text);
            }
        });
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textDisplay.getText().equals("")){
                    textDisplay.setText("0");
                }
                else if(textDisplay.getText().contains(".")){
                    decimal.setEnabled(false);
                }
                else
                {
                    String decimalText = textDisplay.getText() + decimal.getText();
                    textDisplay.setText(decimalText);
                }
                decimal.setEnabled(true);
            }
        });



        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (choice)
                {
                    case 1:
//                        logger.info("[SQUAREROOT] - " + num1);
                        result = utils.SquareRoot(num1);
//                        logger.info("[SQUAREROOT - RESULT] - " + result);
                        num1 = 0.0;
                        break;
                    case 2:
//                        logger.info("[LOGARITHM] - " + num1);
                        result = utils.Logarithm(num1);
//                        logger.info("[LOGARITHM - RESULT] - " + result);
                        num1 = 0.0;
                        break;
                    case 3:
//                        logger.info("[FACTORIAL] - " + num1);
                        result = utils.Factorial(num1);
//                        logger.info("[FACTORIAL - RESULT] - " + result);
                        num1=0.0;
                        break;
                    case 4:
                        num2 = Double.parseDouble(textDisplay.getText());
//                        logger.info("[POWER] - " + num1 + " "+ num2);
                        result = utils.Power(num1, num2);
//                        logger.info("[RESULT - POWER] - " + result);
                        num1 = 0.0;
                        num2 = 0.0;
                        break;
                }
                textDisplay.setText(""+result);
                result = 0.0;
                choice = 0;
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText("");
                num1 = 0.0;
                num2 = 0.0;
                result = 0.0;
                choice = 0;
            }
        });
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 = Double.parseDouble(textDisplay.getText());
                choice = 2;
                textDisplay.setText("ln("+num1+")");
            }
        });
        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 = Double.parseDouble(textDisplay.getText());
                choice = 4;
                textDisplay.setText("");
            }
        });
        fact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 = Double.parseDouble(textDisplay.getText());
                choice = 3;
                textDisplay.setText(num1+" !");
            }
        });
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num1 = Double.parseDouble(textDisplay.getText());
                choice = 1;
                textDisplay.setText("sqrt("+num1+")");
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}