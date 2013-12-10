

/*
 * Nicholas Murphy
 * D12124126
 * Presentation class responsible for displaying information  onto the screen in a reasonable format
 */
package com.assignment.clothes;
import java.awt.BorderLayout;
import java.util.Random;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.xml.bind.ValidationEvent;

public class Assignment extends JFrame implements ActionListener{
	
	
	
	
	
	
			//declare Objects
			ProductManager pm;
			Product hat, top, glove, bottom,boot;
			JPopupMenu popup; 
			JMenuItem j,k,l;
			JButton b,b2;
			int max = Integer.MAX_VALUE;
			
			
			JPanel products;
			//create labels
	
			JLabel hatsLabel = new JLabel();
			JLabel hatImage = new JLabel();
			
			JLabel topsLabel = new JLabel();
			JLabel topsImage = new JLabel();
			
			JLabel glovesLabel = new JLabel();
			JLabel glovesImage = new JLabel();
			
			JLabel bottomsLabel = new JLabel();
			JLabel bottomsImage = new JLabel();
			
			JLabel bootsLabel = new JLabel();
			JLabel bootsImage = new JLabel();
			
			JLabel totalLabel = new JLabel();
			JLabel maxlabel = new JLabel();
			
			//create radio buttons
			JRadioButton hatsradio = new JRadioButton();
			
			JRadioButton topsradio = new JRadioButton();
			
			JRadioButton glovesradio = new JRadioButton();
			
			JRadioButton bottomsradio = new JRadioButton();
			
			JRadioButton bootsradio = new JRadioButton();
			//declare ints
			

	
			//Constructor
			public Assignment(){
				
				super ("Assignment");
				pm = new ProductManager();
				setContentPane(setLayout());
				setSize(600,800);
				setLocation(100,100);
				setVisible(true);
				setResizable(false);
				
				
			}
			
			
			
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b){
					totalLabel.setVisible(false);
					products.setVisible(true); 
						double total=0;
						
					do{ 
						if (!hatsradio.isSelected()){
							hat =pm.randomHat();
							hatsLabel.setText("<html>"+hat.getName()+"<br>€" + hat.getPrice()+"</html>");
							hatImage.setIcon(hat.getIcon());
							
							
						}
						if (!topsradio.isSelected()){
							top =pm.randomtop();
							topsLabel.setText("<html>"+top.getName()+"<br>€" + top.getPrice()+"</html>");
							topsImage.setIcon(top.getIcon());
							
							
						}
						if (!glovesradio.isSelected()){
							glove = pm.randomgloves();
							glovesLabel.setText("<html>"+glove.getName()+"<br>€" + glove.getPrice()+"</html>");
							glovesImage.setIcon(glove.getIcon());
							
							
						}
						if (!bottomsradio.isSelected()){
							bottom =pm.randombottoms();
							bottomsLabel.setText("<html>"+bottom.getName()+"<br>€" + bottom.getPrice()+"</html>");
							bottomsImage.setIcon(bottom.getIcon());
							
							
						}
						if (!bootsradio.isSelected()){
							boot=pm.randomboots();
							bootsLabel.setText("<html>"+boot.getName()+"<br>€" + boot.getPrice()+"</html>");
							bootsImage.setIcon(boot.getIcon());
						}
						total = hat.getPrice()+top.getPrice()+bottom.getPrice()+glove.getPrice()+boot.getPrice();
						
						
							
					}while(total>max);
					l.setVisible(true);
					b2.setVisible(true);
				}
				else if (e.getSource() ==j){
					System.exit(DISPOSE_ON_CLOSE);
				}
				else if (e.getSource()==l){
						totalLabel.setVisible(true);
						totalLabel.setText("The Total is " + (hat.getPrice() + top.getPrice() +glove.getPrice() + bottom.getPrice() + boot.getPrice())+"   ");
						
				}
				else if (e.getSource()==b2) 
				{
			
					String Smax =JOptionPane.showInputDialog("Input number");
					try
					{
						max = Integer.parseInt(Smax);
						if (max<pm.getMinValue())
						{
							JOptionPane.showMessageDialog(this,"Max value too low, changes disregarded");
							max = Integer.MAX_VALUE;
						}
						if (max!=Integer.MAX_VALUE)
						{
								maxlabel.show();
								maxlabel.setText("Maximum value  " +max+"  ");
						}
					}
					
					catch ( Exception error)
					{
						JOptionPane.showMessageDialog(this, "not valid number");
					}
					
					
				}
					
				
				
					
				
			
					
				
				
				
				
				else if (e.getSource() ==k){
					
					JOptionPane.showMessageDialog(this, "<html>Start a search by clicking Randomize<br><br>If you are not happy with your selection click randomize again<br><br> If you like one of the closen products click its button to keep it<br><br> When finished right click Total to find the total price","Help",JOptionPane.INFORMATION_MESSAGE );
					
					
				}
				revalidate();
				repaint();
						
					}
	
		
			
			private Container setLayout() {
							
							
							
							Container p = new JPanel(new BorderLayout()); 
									
							//create products panel
							products = new JPanel(new GridLayout(5,1));
							products.setVisible(false); 
							
							//hats panel
							JPanel hats = new JPanel(new BorderLayout());
							hatsLabel.setText("hats");
							hats.add(hatsLabel,BorderLayout.NORTH);
							hats.add(hatsradio,BorderLayout.SOUTH);
							hats.add(hatImage, BorderLayout.CENTER);
							
							
							//tops panel
							JPanel tops = new JPanel(new BorderLayout());
							topsLabel.setText("tops");
							tops.add(topsLabel,BorderLayout.NORTH);
							tops.add(topsradio,BorderLayout.SOUTH);
							tops.add(topsImage, BorderLayout.CENTER);
							
							//gloves panel
							JPanel gloves = new JPanel(new BorderLayout());
							glovesLabel.setText("gloves");
							gloves.add(glovesLabel,BorderLayout.NORTH);
							gloves.add(glovesradio,BorderLayout.SOUTH);
							gloves.add(glovesImage, BorderLayout.CENTER);
							
							//bottoms panel
							JPanel bottoms = new JPanel(new BorderLayout());
							bottomsLabel.setText("bottoms");
							bottoms.add(bottomsLabel,BorderLayout.NORTH);
							bottoms.add(bottomsradio,BorderLayout.SOUTH);
							bottoms.add(bottomsImage, BorderLayout.CENTER);
							
							//boots panel
							JPanel boots = new JPanel (new BorderLayout());
							bootsLabel.setText("boots");
							boots.add(bootsLabel,BorderLayout.NORTH);
							boots.add(bootsradio,BorderLayout.SOUTH);
							boots.add(bootsImage, BorderLayout.CENTER);
							
							//button panel
							JPanel button = new JPanel();
							b = new JButton("Randomize");
							b.addActionListener(this);
							button.add(b);
							
							//west Panel
							JPanel west = new JPanel(new FlowLayout());
							b2=new JButton("Set Max total");
							b2.addActionListener(this);
							west.add(button);
							b2.setVisible(false);
							west.add(b2);
							
							
							
							//add to products
							products.add(hats);
							products.add(tops);
							products.add(gloves);
							products.add(bottoms);
							products.add(boots);
							
							//Create Total Panel
							JPanel total = new JPanel(new BorderLayout());
							total.add(totalLabel,BorderLayout.WEST);
							total.add(maxlabel,BorderLayout.CENTER);
							
							//add to main panel
							
							p.add(products,BorderLayout.EAST);
							p.add(total,BorderLayout.SOUTH);
							p.add(west,BorderLayout.WEST);
							
							PopUpListener popup = new PopUpListener(SetPopup());
							
							p.addMouseListener(popup);
							
							
							
							
							return p;
							
		
	}
			public JPopupMenu SetPopup(){
				//iknstanciate menu items
				JPopupMenu pop = new JPopupMenu();
				j = new JMenuItem("Close");
				j.addActionListener(this);
				k = new JMenuItem("Help");
				k.addActionListener(this);
				l = new JMenuItem("Total");
				l.addActionListener(this);
				//make invisible
				l.setVisible(false);
				//add menu items to popup
				pop.add(j);
				pop.add(k);
				pop.add(l);
				return pop;
				
				
			}

	
}
