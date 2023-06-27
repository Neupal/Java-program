package swing.java;
import javax.swing.*;

public class SwingApp extends JFrame{
	SwingApp()
	{
		JLabel firstName=new JLabel("First Name");
		firstName.setBounds(20,50,80,20);
		
		JTextField firstNameTF=new JTextField();
		firstNameTF.setBounds(120,50,100,20);
		
		JButton st=new JButton("submit");
		st.setBounds(20,160,100,30);
		
		add(firstName);
		add(firstNameTF);
		add(st);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingApp f=new SwingApp();
	}
}
