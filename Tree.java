import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JFrame
{
	Tree()
	{
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
		
		style.add(color);
		style.add(font);
		
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
		
		color.add(red);
		color.add(blue);
		
		JTree t=new JTree(style);
		add(t);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new Tree();
	}

}
