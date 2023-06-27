package swing.java;
import java.io.*;
import javax.swing.*;

public class SwingExample extends JFrame{
	SwingExample()
	{
	JButton b=new JButton("GFG Website Click");
	
	b.setBounds(150,200,220,50);
	add(b);
	setSize(500,600);
	setLayout(null);
	setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingExample f=new SwingExample();
	}
}
