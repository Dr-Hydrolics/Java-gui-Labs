package mypkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

import lab6.mypopup;

public class textFrame extends JFrame implements ActionListener {
	
	public textFrame(){
		super ("TextFrame");
		 setSize(300,400);
		 setContentPane(createPane());
		 setJMenuBar(createMenuBar());
		 
		 setVisible(true);
	
	}
	
	JButton ok,cancel;
	JLabel text;
	JMenuItem blank,blankety;
	ColouredPanel center;
	
	
	public Container createPane(){
		JPanel main = new JPanel(new BorderLayout());
		JPanel dataPanel = new JPanel(new BorderLayout());
		JPanel labelPanel = new JPanel(new GridLayout(2,1));
		JPanel textPanel = new JPanel(new GridLayout(2,1));
		
		JPopupMenu J = createPopUp();
		
		JLabel lab = new JLabel("Name");
		labelPanel.add(lab);
		lab = new JLabel("E-mail");
		labelPanel.add(lab);
		
		JTextField name = new JTextField();
		JTextField email = new JTextField();
		textPanel.add(name);
		textPanel.add(email);
		 
		dataPanel.add(labelPanel,BorderLayout.WEST);
		dataPanel.add(textPanel,BorderLayout.CENTER);
		main.add(dataPanel,BorderLayout.NORTH);
		
		text = new JLabel("");
		
		JPanel bottom = new JPanel(new BorderLayout());
		JPanel buttons = new JPanel();
		ok = new JButton("OK");
		ok.addActionListener(this);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		buttons.add(ok);
		buttons.add(cancel);
		bottom.add(buttons,BorderLayout.EAST);
		main.add(bottom,BorderLayout.SOUTH);
		
		mypopup popup = new mypopup(J);
		center = new ColouredPanel(Color.WHITE);
		center.addMouseListener(popup);
		center.add(text);
		main.add(center,BorderLayout.CENTER);
		
		
		return main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == ok)
		{
			text.setText("You clicked OK");
		}
		if(e.getSource() == cancel)
		{
			System.exit(0);
		}
		if(e.getSource() == blank)
		{
			text.setText("You SUCK");
		}
		if(e.getSource() == blankety)
		{
			text.setText("I SUCK");
		}
		
	}
	
	private JPopupMenu createPopUp(){
		JPopupMenu popup = new JPopupMenu();
		blank = new JMenuItem("hello");
		blank.addActionListener(this);
		blankety = new JMenuItem("sexy");
		blankety.addActionListener(this);
		return popup;
	}
	
	public JMenuBar createMenuBar(){
		JMenuBar bar = new JMenuBar();
		JMenu file = new JMenu("file");
		bar.add(file);
		return bar;
		
	}

}
