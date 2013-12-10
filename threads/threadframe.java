package threads;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class threadframe extends JFrame implements ActionListener {
	public JLabel j = new JLabel();
	public threadframe(){
		super("Main");
		setSize(800,800);
		setContentPane(setLayout());
		setLocation(100,100);
		setVisible(true);
		
	}
	private Container setLayout(){
		Container p = new JPanel(new BorderLayout());
		JButton b = new JButton("click here");
		b.addActionListener(this);
		p.add(b,BorderLayout.EAST);
		j.setText(("click to start"));
		p.add(j);
		return p;
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		for (int i =0;i<=10;i++){
			j.setText("counting..."+i);
			System.out.println("counting..."+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
