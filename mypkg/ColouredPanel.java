package mypkg;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;


public class ColouredPanel extends JPanel 
{


	public ColouredPanel (Color color) 
	{
		super();
		setBackground(color);
		JPanel text = new JPanel();
//		text.add(addtext("text"));
		
	}

	public ColouredPanel (Color color, int x, int y) 
	{
		super();
		setBackground(color);
		setPreferredSize(new Dimension(x, y));
	}

	public void changeColour ( Color color) 
	{

		setBackground(color);
	}

}
