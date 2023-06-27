package Jdbc;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect extends JFrame
{
	JFrame f=new JFrame();
	Label l1, l2, l3;
	TextField t1, t2, t3;
	JButton b=new JButton("Save");
	Connect() 
	{	
		l1 = new Label ("Name:");
		l1.setBounds(70, 100, 100, 30); 
		t1 = new TextField();
		t1.setBounds(200,100,200,30);
		l2 = new Label ("Address");
		l2.setBounds(70, 150, 100, 30);
		t2 = new TextField();
		t2.setBounds(200, 150, 200, 30);
		l3 = new Label ("Phone");
		l3.setBounds(70, 200, 100, 30);
		t3 = new TextField();
		t3.setBounds(200, 200, 200, 30);
	    b.setBounds(200,250,95,30);
	    
	    f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b);
	    
	    b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String Name = t1.getText();
	    		String Address = t2.getText();
	    		String Phone = t3.getText();
	    		
	    		try {
	    			Class.forName("com.mysql.cj.jdbc.Driver");
	    		    Connection con = DriverManager.getConnection("Connect:mysql://localhost/asian_db");
	    		    String sql = "INSERT INTO contact values('"+ Name +"','" + Address + "','" + Phone + "')";
	    		    Statement stmt = con.createStatement();
	    		    int x = stmt.executeUpdate(sql);
	    		    if(x == 0) {
	    		    	JOptionPane.showMessageDialog(b, "This is already exit");
	    		    }
	    		    else {
	    		    	JOptionPane.showMessageDialog(b, "Successfully Created");
	    		    }
	    		    con.close();
	    		    stmt.close();
	    		} catch(Exception e1)
	    		{
	    			System.out.println(e1);
	    		}
	    	}
	    });
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Connect();
	}
}