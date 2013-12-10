package threads;

import java.awt.event.ActionEvent;

public class threadframe2 extends threadframe {

	public void actionPerformed(ActionEvent arg0) {
		
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
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
			});
			
	
			}
	}
}
