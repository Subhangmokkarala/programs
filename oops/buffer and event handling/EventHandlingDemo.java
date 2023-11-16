import java.awt.*;
import java.awt.event.*;

class EventHandlingDemo extends Frame {
    TextField textField;

    EventHandlingDemo() {
        textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        Button button = new Button("Click me");
        button.setBounds(50, 100, 60, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked");
            }
        });
        add(textField);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}
