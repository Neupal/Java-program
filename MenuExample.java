import java.awt.*;
import javax.swing.*;
public class MenuExample extends JFrame
{
	JMenu m;
	JMenuBar mb;
	JMenuItem menuitem1,menuitem2,menuitem3;
	MenuExample()
	{
		m=new JMenu();
		mb=new JMenuBar();
		
		menuitem1=new JMenuItem("MenuItem1");
		menuitem2=new JMenuItem("MenuItem2");
		menuitem3=new JMenuItem("MenuItem3");
		
		m.add(menuitem1);
		m.add(menuitem2);
		m.add(menuitem3);
		
		mb.add(m);
		
		add(mb);
		setSize(300,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MenuExample();
	}
}
