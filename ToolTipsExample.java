import java.awt.*;
import javax.swing.*;

public class ToolTipsExample extends JFrame
{
	ToolTipsExample()
	{
		JPasswordField pf=new JPasswordField();
		pf.setToolTipText("Password");
		JLabel l=new JLabel("Password:");
		pf.setBounds(100, 100, 70, 50);
		l.setBounds(20, 100, 70, 50);
		
		add(pf);
		add(l);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new ToolTipsExample();
	}

}
