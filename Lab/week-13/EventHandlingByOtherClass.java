import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonClickListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button Clicked by Another Class!");
    }
}

public class EventHandlingByOtherClass extends JFrame {
    private JButton button;

    public EventHandlingByOtherClass() {
        // Create a frame
        setTitle("Event Handling By Other Class");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a button
        button = new JButton("Click Me");
        add(button);

        // Register the button for action events using the other class
        ActionListener listener = new ButtonClickListener();
        button.addActionListener(listener);
    }

    public static void main(String[] args) {
        EventHandlingByOtherClass app = new EventHandlingByOtherClass();
        app.setVisible(true);
    }
}
