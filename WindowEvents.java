import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.WindowEvent.*;
import java.awt.event.WindowListener.*;
public class WindowEvents extends JFrame implements WindowListener
{
	WindowEvents()
	{
		addWindowListener(this);
		setSize(300,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void windowActivated(WindowEvent e)
	{
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Deactivated");
	}
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Opened");
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Closed");
	}
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Iconified");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Deiconified");
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Closing");
		dispose();
	}
	public static void main(String[] args)
	{
		new WindowEvents();
	}
}