package com.example.lambdaexpression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {
        //window
        JFrame frame = new JFrame("My window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());


        JButton button = new JButton("CLick Me!!!");

       /* button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Button click");
                JOptionPane.showMessageDialog(null,"Hey!!! Button Click");
            }
        });*/

       /* button.addActionListener((ActionEvent e) -> {
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null, "Hey!!! Button Click");
        });*/

        button.addActionListener((e) -> {
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null, "Hey!!! Button Click");
        });

        //MouseMotionListener has two methods so we cannot use lambda expression here we have to use anonymous class
        //which can implement multiple methods without making actual class
        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });


        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
