import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField operator = new JTextField();
        JTextField result = new JTextField();



        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        JTextField textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        frame.add(textField);

        JButton number0 = new JButton("0");
        JButton number1 = new JButton("1");
        JButton number2 = new JButton("2");
        JButton number3 = new JButton("3");
        JButton number4 = new JButton("4");
        JButton number5 = new JButton("5");
        JButton number6 = new JButton("6");
        JButton number7 = new JButton("7");
        JButton number8 = new JButton("8");
        JButton number9 = new JButton("9");

        JButton add = new JButton("+");
        JButton min = new JButton("-");
        JButton zarb = new JButton("*");
        JButton div = new JButton("/");
        JButton equ = new JButton("=");
        JButton dot = new JButton(".");
        JButton del = new JButton("Del");
        JButton clr = new JButton("Clr");
        JButton neg = new JButton("-");

        neg.setBounds(50, 430 ,100, 50);
        del.setBounds(150, 430, 100, 50);
        clr.setBounds(250, 430, 100, 50);

        frame.add(neg);
        frame.add(del);
        frame.add(clr);

        JPanel panel = new JPanel();
        panel.setBounds(50,100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.pink);

        frame.add(panel);

        panel.add(number1);
        panel.add(number2);
        panel.add(number3);
        panel.add(add);
        panel.add(number4);
        panel.add(number5);
        panel.add(number6);
        panel.add(min);
        panel.add(number7);
        panel.add(number8);
        panel.add(number9);
        panel.add(zarb);
        panel.add(dot);
        panel.add(number0);
        panel.add(equ);
        panel.add(div);

        //Action Litener

        number0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("0"));
            }
        });

        number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("1"));
            }
        });


        number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("2"));
            }
        });


        number3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("3"));
            }
        });


        number4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("4"));
            }
        });


        number5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("5"));
            }
        });


        number6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("6"));
            }
        });


        number7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("7"));
            }
        });


        number8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("8"));
            }
        });


        number9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("9"));
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("."));
            }
        });


        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText(textField.getText());
                textField.setText("");
                operator.setText("+");
            }
        });

        min.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText(textField.getText());
                textField.setText("");
                operator.setText("-");
            }
        });

        zarb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText(textField.getText());
                textField.setText("");
                operator.setText("*");
            }
        });

        div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText(textField.getText());
                textField.setText("");
                operator.setText("/");
            }
        });

        equ.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num2.setText(textField.getText());
                Double num11 = Double.parseDouble(num1.getText());
                Double num22 = Double.parseDouble(num2.getText());
                String operatoor = operator.getText() ;

                switch (operatoor)
                {
                    case "+" :
                        textField.setText(Double.toString(num11 + num22));
                        break;

                    case "-" :
                        textField.setText(Double.toString(num11 - num22));
                        break;

                    case "*" :
                        textField.setText(Double.toString(num11 * num22));
                        break;

                    case "/" :
                        textField.setText(Double.toString(num11 / num22));
                        break;
                }
            }
        });

        neg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                Double value = Double.parseDouble(text) * -1 ;
                text = Double.toString(value);
                textField.setText(text);
            }
        });

        clr.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        del.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText("");
                for (int i = 0; i < text.length() - 1; i++) {
                    textField.setText(textField.getText() + text.charAt(i));
                }
                operator.setText("/");
            }
        });







        frame.setVisible(true);

    }
}