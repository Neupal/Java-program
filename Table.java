import javax.swing.*;

public class Table extends JFrame
{
	Table()
	{
		String data[][]= {{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};
		String header[]= {"ID","NAME","SALARY"};
		
		JTable t=new JTable(data,header);
		t.setBounds(40, 50, 190, 290);
		JScrollPane sp=new JScrollPane(t);
		
		add(sp);
		setSize(400,500);
		setVisible(true);
		
		}
	public static void main(String[] args)
	{
		new Table();
		
	}
	}