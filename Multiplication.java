import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener.*;
import java.awt.event.ActionEvent.*;

public class Multiplication extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2,t3;
	JButton b;
	Multiplication()
	{
		l1=new JLabel("First Element");
		l1.setBounds(20,10,120,40);
		t1=new JTextField(10);
		t1.setBounds(140,20,100,40);
		l2=new JLabel("Second Element");
		l2.setBounds(20,40,120,40);
		t2=new JTextField(10);
		t2.setBounds(120,40,120,40);
		b=new JButton("Product");
		b.setBounds(20,70,80,40);
		t3=new JTextField(10);
		t3.setBounds(120,70,120,120);
		b.addActionListener(this);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(t3);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int product=num1*num2;
			t3.setText(String.valueOf(product));
		}
	}
	public static void main(String[] args)
	{
		new Multiplication();
	}
}