package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeekbrainsWindow extends JFrame {
    private int randomNumber;
    private int maxTries = 3;
    private int tries = 0;
    private JTextField textField;


    public GeekbrainsWindow() {
        setRandomNumber();
        setTitle("Игра: Угадай число");
        setBounds(600, 300, 600, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);
        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 20);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        buttonsPanel.setBackground(Color.BLUE);
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        JPanel buttonRestart = new JPanel(new GridLayout(1, 1));
        buttonRestart.setBackground(Color.GREEN);
        add(buttonRestart, BorderLayout.SOUTH);
        JButton button1 = new JButton(String.valueOf("Restart"));
        button1.setFont(font);
        buttonRestart.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setRandomNumber();
                tries = 0;
                JFrame frame = new JFrame();
                frame.setSize(400,100);
                frame.setLocation(700,600);
                frame.setVisible(true);
                frame.setTitle("Random число - переназначено");
            }
        });



        setVisible(true);
    }

    public void tryToAnswer(int answer) {
        if (tries < maxTries) {
            if(answer < randomNumber) {
                textField.setText("Не угадали! Загаданное число больше!");
                tries++;
                return;
            }
            if(answer > randomNumber) {
                textField.setText("Не угадали! Загаданное число меньше");
                tries++;
                return;
            }
            textField.setText("Вы угадали!!! Ответ: " + randomNumber);
        } else {
            JFrame frame = new JFrame();
            frame.setSize(400,100);
            frame.setLocation(700,600);
            frame.setVisible(true);
            frame.setTitle("Вы не уложились в 3 попытки =(");

        }


    }

    public void setRandomNumber() {
        this.randomNumber = (int) (Math.random() * 10) + 1; // [1, 10]
    }
}
