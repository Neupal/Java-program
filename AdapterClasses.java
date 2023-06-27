import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AdapterClasses extends JFrame
{
	JLabel l;
	JTextField t;
	JButton b;
	public AdapterClasses()
	{
		l=new JLabel("Text");
		t=new JTextField(10);
		b=new JButton("Click me");
		b.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				t.setText("Welcome");
			}
		});
		add(l);
		add(t);
		
		add(b);
		setSize(500,500);
		setLayout(new GridLayout(2,1));
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AdapterClasses();
	}

}
