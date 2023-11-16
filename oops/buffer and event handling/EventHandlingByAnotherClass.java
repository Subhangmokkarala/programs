import java.awt.*;
import java.awt.event.*;

class MyButtonListener implements ActionListener {
    TextField textField;

    MyButtonListener(TextField t) {
        textField = t;
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Button Clicked by Another Class");
    }
}

class EventHandlingByAnotherClass extends Frame {
    TextField textField;
    Button button;

    EventHandlingByAnotherClass() {
        textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        button = new Button("Click me");
        button.setBounds(50, 100, 60, 30);
        MyButtonListener listener = new MyButtonListener(textField);
        button.addActionListener(listener);
        add(textField);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlingByAnotherClass();
    }
}
