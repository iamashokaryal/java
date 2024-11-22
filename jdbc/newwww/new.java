import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class new
{
	public static void main(String arg[])
	{
		JFrame f = new JFrame("Uppercase");
		f.setSize(400,400);
		f.setVisible(true);
		
		TextField t1 = new TextField(40);
		t1.setBounds(120,40,50,30);
		
		Button b = new Button ("Uppercase");
		b.setBounds(120,140,50,20);
		
		
		f.add(t1);
		f.add(b);
		
		b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						String a = t1.getText();
						a= a.toUpperCase();
						t1.setText(String.valueOf(a));
					}
				});	
	}
}
