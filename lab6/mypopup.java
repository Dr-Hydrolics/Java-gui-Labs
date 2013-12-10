package lab6;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

public class mypopup extends MouseAdapter {
	JPopupMenu popup;
	
	public mypopup(JPopupMenu popup){
		this.popup= popup;
	}
	public void mousePressed(MouseEvent e)
	{
		if(e.isPopupTrigger()) doPop(e);
	}
	public void mouseReleased(MouseEvent e)
	{
		if(e.isPopupTrigger()) doPop(e);
	}
	
	private void doPop(MouseEvent e)
	{
		popup.show(e.getComponent(),e.getX(),e.getY());
	}
	
}
