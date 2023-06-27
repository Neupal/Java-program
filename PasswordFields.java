import javax.swing.*;
public class PasswordFields {
	public static void main(String[] args)
	{
		JFrame f=new JFrame("Password Field Example");
		JPasswordField pf=new JPasswordField();
		JLabel l1=new JLabel("Password:");
		
		l1.setBounds(20, 100, 80, 30);
		pf.setBounds(100, 100, 100, 30);
		
		f.add(pf);
		f.add(l1);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);	
	}
}
