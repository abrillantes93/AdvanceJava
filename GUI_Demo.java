/*
COP-2805C-91339
D9 - Exploring Graphical User Interfaces
Anthony Brillantes
7/14/2024

Description: A GUI demo that displays simple features: button, text box, slider, selection, and color. 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Demo {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        //Name Entry Form
        JLabel nameLabel = new JLabel("Enter Your Name:");
        JTextField nameField = new JTextField(10);

        //output
        JButton display = new JButton("Display");
        JLabel displayLabel = new JLabel();
        //slider
        JSlider slider = new JSlider(0, 100);
        String[] choices = { "Option 1", "Option 2", "Option 3" };
        JComboBox<String> comboBox = new JComboBox<>(choices);
        

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String userName = nameField.getText();
                    displayLabel.setText("Your Name: " + userName);
                
            }
        });
        //add elements
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(display);
        panel.add(displayLabel);
        panel.setBackground(Color.PINK);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panel.add(slider);
        panel.add(comboBox);
        frame.add(panel);
        frame.setVisible(true);
    }
}
