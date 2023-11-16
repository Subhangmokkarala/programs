import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingByAnonymousClass extends JFrame {
    private JButton button;

    public EventHandlingByAnonymousClass() {
        // Create a frame
        setTitle("Event Handling by Anonymous Class");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a button
        button = new JButton("Click Me");
        add(button);

        // Register the button for action events using an anonymous class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(EventHandlingByAnonymousClass.this, "Button Clicked!");
            }
        });
    }

    public static void main(String[] args) {
        EventHandlingByAnonymousClass app = new EventHandlingByAnonymousClass();
        app.setVisible(true);
    }
}
