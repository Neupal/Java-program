import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FocusEvents extends JFrame implements FocusListener {
    
	JTextField tf;
    JTextArea ta;
    public FocusEvents() 
    {
       tf= new JTextField();
       ta= new JTextArea();
       tf.setBounds(10, 10, 150, 25);
       ta.setBounds(200, 100, 200, 200);
       add(tf);
       add(ta);
       tf.addFocusListener(this);
       
       setSize(300,400);
       setVisible(true);
    }
    public void focusGained(FocusEvent e) {
    	System.out.println("Focus is gained.");
        tf.setText("");
    }
    public void focusLost(FocusEvent e) {
    	System.out.println("Focus is lost.");
    }
    
    public static void main(String[] args) {
        new FocusEvents();
    }
}