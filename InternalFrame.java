import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class InternalFrame extends JFrame
{
	InternalFrame()
	{
		JDesktopPane d=new JDesktopPane();
		JInternalFrame internal=new JInternalFrame("Our Frame",true,true,true,true);
		d.add(internal);
		internal.setBounds(60,100,190,240);
		JLabel l=new JLabel(internal.getTitle(),JLabel.CENTER);
		JButton b=new JButton("Demo Button");
		internal.add(l,BorderLayout.CENTER);
		internal.add(b,BorderLayout.WEST);
		internal.setVisible(true);
		
		add(d,BorderLayout.CENTER);
		setSize(700,400);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new InternalFrame();
	}
}
