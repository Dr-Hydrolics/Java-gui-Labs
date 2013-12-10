package mypkg;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class FlowLayoutExample extends JFrame 
{


	public FlowLayoutExample () 
	{

	
		// Set the title of the window
		super ("FlowLayout Example");

		// Set the default size of the window
		setSize(300,400);
		setLocation(320,100);		

		setContentPane(createContentPane());
		setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
		showPane();

	}

	public Container createContentPane() 
	{


		ColouredPanel p;
		JLabel text;

		Container pane = new JPanel();
		pane.setLayout(new FlowLayout());


		p = new ColouredPanel(Color.BLUE);
		text = new JLabel("Blue");
		p.add(text);
		pane.add(p);

		p = new ColouredPanel(Color.RED);
		text = new JLabel("Red");
		p.add(text);
		pane.add(p);

		p = new ColouredPanel(Color.GREEN);
		text = new JLabel("Green");
		p.add(text);
		pane.add(p);

		p = new ColouredPanel(Color.YELLOW);
		text = new JLabel("Yellow");
		p.add(text);
		pane.add(p);

		p = new ColouredPanel(Color.MAGENTA);
		text = new JLabel("Magenta");
		p.add(text);
		pane.add(p);


		return pane;

	}

	public void showPane() 
	{

		setVisible(true);
	}

	public void hidePane() 
	{

		setVisible(false);
	}

}
