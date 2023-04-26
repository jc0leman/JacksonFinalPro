import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class FrontEnd extends JFrame implements KeyListener {

    private JTextField textField;

    public FrontEnd() {
        super("Blank Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        addKeyListener(this);

        // Add a text field for user input
        textField = new JTextField(20);
        textField.setBounds(50, 50, 200, 30); // Set position and size of text field
        textField.setBackground(Color.BLUE); // Set background color of text field
        getContentPane().add(textField);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (Character.isLetter(e.getKeyChar())) {
            String currentText = textField.getText();
            currentText += e.getKeyChar();
            textField.setText(currentText);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }
}
