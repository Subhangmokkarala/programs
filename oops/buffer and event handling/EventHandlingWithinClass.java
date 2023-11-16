import java.awt.*;
import java.awt.event.*;

class EventHandlingWithinClass extends Frame implements ActionListener {
    TextField textField;
    Button button;

    EventHandlingWithinClass() {
        textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        button = new Button("Click me");
        button.setBounds(50, 100, 60, 30);
        button.addActionListener(this);
        add(textField);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Button Clicked");
    }

    public static void main(String[] args) {
        new EventHandlingWithinClass();
    }
}
