import java.awt.event.*;
import javax.swing.*;

public class ItemEvents extends JFrame implements ItemListener
{
	JRadioButton maleRBtn, femaleRBtn;
	JLabel genderTitle, genderSelected;
	JPanel panel;
	
	ItemEvents(){
	setVisible(true);
	setBounds(500, 400, 300, 200);
		
		panel= new JPanel();
		add(panel);
		
		maleRBtn= new JRadioButton("Male");
		femaleRBtn= new JRadioButton("Female");
		panel.add(maleRBtn);
		panel.add(femaleRBtn);
		
		maleRBtn.addItemListener(this);
		femaleRBtn.addItemListener(this);
		
		panel.add(maleRBtn);
		panel.add(femaleRBtn);
		
		genderTitle= new JLabel("Gender Msg: ");
		panel.add(genderTitle);
		genderSelected= new JLabel("");
		panel.add(genderSelected);
		
	}
	public void itemStateChanged(ItemEvent e) {
	
		if(e.getSource()== maleRBtn)
		{
			if(maleRBtn.isSelected()== true)
			{
				femaleRBtn.setSelected(false);
			}
				
		}
		else if(e.getSource()== femaleRBtn)
		{
			if(femaleRBtn.isSelected()== true)
			{
				maleRBtn.setSelected(false);
			}
				
		}
	}
	
	public static void main(String[] args) {
		new ItemEvents();
	}
}
