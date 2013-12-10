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


public class BorderLayoutExample extends JFrame 
{


	public BorderLayoutExample () 
	{


		// Set the title of the window
		super ("BorderLayout Example");

		// Set the default size of the window
		setSize(300,400);
		setLocation(100,100);

		setContentPane(createContentPane());
		setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
		showPane();
	}

	public Container createContentPane() 
	{


		ColouredPanel p;
		JLabel text;

		Container pane = new JPanel();
		pane.setLayout(new BorderLayout());


		p = new ColouredPanel(Color.BLUE);
		text = new JLabel("Blue");
		p.add(text);
		pane.add(p,BorderLayout.NORTH);

		p = new ColouredPanel(Color.RED);
		text = new JLabel("Red");
		p.add(text);
		pane.add(p,BorderLayout.CENTER);

		p = new ColouredPanel(Color.GREEN);
		text = new JLabel("Green");
		p.add(text);
		pane.add(p,BorderLayout.SOUTH);

		p = new ColouredPanel(Color.YELLOW);
		text = new JLabel("Yellow");
		p.add(text);
		pane.add(p,BorderLayout.WEST);

		p = new ColouredPanel(Color.MAGENTA);
		text = new JLabel("Magenta");
		p.add(text);
		pane.add(p,BorderLayout.EAST);
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
