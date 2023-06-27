import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EventHandelings extends JFrame implements ActionListener
{
	JTextField tf=new JTextField();
	EventHandelings()
	{
		tf.setBounds(10,20,160,40);
		JButton b=new JButton("Click me ok");
		b.setBounds(10,60,160,40);
		b.addActionListener(this);
		add(b);
		add(tf);
		setSize(300,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome");
	}
	public static void main(String[] args)
	{
		new EventHandelings();
	}
}