package awt.java;
import java.awt.*;

public class AwtApp extends Frame{
	AwtApp()
	{
		Label firstName=new Label("First Name");
		firstName.setBounds(20,50,80,20);
		
		TextField firstNameTF=new TextField();
		firstNameTF.setBounds(120,50,100,20);
		
		Button st=new Button("submit");
		st.setBounds(20,160,100,30);
		
		add(firstName);
		add(firstNameTF);
		add(st);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		AwtApp f=new AwtApp();
	}
}
