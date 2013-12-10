package mypkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// class that display a window and acts as its own Listener

public class UserInteraction extends JFrame implements ActionListener 
{

	// set up the components that the user needs to interact with
	// as instance variables of the class
	private JButton blueButton, greenButton;

	// Also set up components that will need to be altered or changed
	// in any way as instance variables so they are accessible
	// to different methods.
	private ColouredPanel centrePane;

	private JLabel colourText;

	public UserInteraction() 
	{

		super("A User interaction Frame"); // sets title
		setLocation(200, 200);
		setSize(450, 250);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// setup the content pane
		setContentPane(createContentPane());

		// display window
		showWindow();
	}

	// method that sets up the layout of the content pane
	private Container createContentPane() 
	{

		Container pane = new JPanel();

		pane.setLayout(new BorderLayout());

		// Set up a coloured panel as the main content pane
		centrePane = new ColouredPanel(Color.WHITE);
		colourText = new JLabel("White");
		centrePane.add(colourText);
		pane.add(centrePane, BorderLayout.CENTER);


		// set up a button panel in the south of the content pane

		JPanel p = new JPanel();


		// set up a blue button
		blueButton= new JButton("Blue");
		blueButton.setPreferredSize(new Dimension(100,30));
		blueButton.setBackground(Color.BLUE);
		blueButton.addActionListener(this);
		p.add(blueButton);

		// set up a green button
		greenButton = new JButton("Green");
		greenButton.setBackground(Color.GREEN);  
		greenButton.setPreferredSize(new Dimension(100,30));
		greenButton.addActionListener(this);
		p.add(greenButton);
		pane.add(p, BorderLayout.SOUTH);

		return pane;
	}

	// method that displays the window
	public void showWindow() 
	{
		setVisible(true);
	}

	// method that hides the window
	public void hideWindow() 
	{
		setVisible(false);
	}

	public void actionPerformed(ActionEvent e) 
	{

		// if user pressed the Blue button
		if (e.getSource() == blueButton) {
			centrePane.changeColour(Color.BLUE);
			colourText.setText("Blue");
		} else {
			// user pressed the green button
			centrePane.changeColour(Color.GREEN);
			colourText.setText("Green");

		}

	}

}
