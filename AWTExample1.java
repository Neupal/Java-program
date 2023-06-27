package awt.java;
import java.awt.*;

public class AWTExample1 extends Frame {
	AWTExample1()
	{
		Frame f=new Frame();
		Label l=new Label("Employee id:");
		Button b=new Button("submit");
		TextField t=new TextField();
		
		l.setBounds(20, 80, 80, 30);
		t.setBounds(20,100,80,30);
		b.setBounds(100,100,80,30);
		
		f.add(b);
		f.add(l);
		f.add(t);
		
		f.setSize(300,300);
		f.setTitle("Employee info");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		AWTExample1 f=new AWTExample1();
	}
}
