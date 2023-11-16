import java.awt.*;
import java.awt.event.*;

class EventHandlingByAnonymousClass extends Frame {
    TextField textField;
    Button button;

    EventHandlingByAnonymousClass() {
        textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        button = new Button("Click me");
        button.setBounds(50, 100, 60, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked by Anonymous Class");
            }
        });
        add(textField);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlingByAnonymousClass();
    }
}
