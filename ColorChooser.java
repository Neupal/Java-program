import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ColorChooser extends JFrame  implements ActionListener {
	Container c;
	ColorChooser()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b=new JButton("color");
		b.addActionListener(this);
		c.add(b);
		
		setSize(300,400);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Color initialcolor=Color.red;
		Color color=JColorChooser.showDialog(this,"select a color",initialcolor);
		c.setBackground(color);
	}
	public static void main(String[] args)
	{
		new ColorChooser();
	}
}
