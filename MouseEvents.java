import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseEvents extends JFrame implements MouseListener
{
	JLabel l=new JLabel();
	MouseEvents()
	{
		l.setBounds(10,40,160,80);
		addMouseListener(this);
		add(l);
		setSize(300,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered");
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("Mouse Clicked");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed");
	}
	public static void main(String[] args)
	{
		new MouseEvents();
	}
}