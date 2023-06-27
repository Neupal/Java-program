import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener.*;
public class KeyEvents extends JFrame implements KeyListener
{
	JLabel l=new JLabel();
	KeyEvents()
	{
		JTextField tf=new JTextField();
		tf.setBounds(10,20,160,40);
		l.setBounds(10,40,160,80);
		tf.addKeyListener(this);
		add(l);
		add(tf);
		setSize(300,400);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e)
	{
		l.setText("Key Pressed");
	}
	public void keyReleased(KeyEvent e)
	{
		l.setText("Key Released");
	}
	public void keyTyped(KeyEvent e)
	{
		l.setText("Key Typed");
	}
	public static void main(String[] args)
	{
		new KeyEvents();
	}
}