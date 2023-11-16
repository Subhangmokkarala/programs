import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingWithinClass extends JFrame implements ActionListener {
    private JButton button;

    public EventHandlingWithinClass() {
        // Create a frame
        setTitle("Event Handling Within Class");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a button
        button = new JButton("Click Me");
        add(button);

        // Register the button for action events
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        EventHandlingWithinClass app = new EventHandlingWithinClass();
        app.setVisible(true);
    }
}
