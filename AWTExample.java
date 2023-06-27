package awt.java;
import java.awt.*;

public class AWTExample {
	AWTExample()
	{
		Button b=new Button("Click Me");
		Frame f=new Frame();
		
		b.setBounds(30,100,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setTitle("This is our basic AWT example");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		AWTExample f=new AWTExample();
	}
}
