
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Boardbase2intro extends JPanel implements fixedTHROUGHOUT{
private Image bgimage;
private Timer timer2;
public int counter;
	public int getCounter() {
	return counter;
}

public void setCounter(int counter) {
	this.counter = counter;
}

	public Boardbase2intro() throws IOException {

		setSize(WIDTH_FRAME,HEIGHT_FRAME);
		bgimage = new ImageIcon(BoardBASE.class.getResource(intropicture)).getImage();
		setFocusable(true);
		keysevent2();
		againloop2();   
	}
	
	private void keysevent2() {
		KeyListener l = new KeyListener () {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			} 

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		
		
	};
	this.addKeyListener(l);
	
	
	
}

private void againloop2() {
ActionListener l = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			repaint();
		
	
		}
	};
	timer2 = new Timer(DELAY2,l);
	timer2.start();
}
public void drawbackgroundintroimage(Graphics g) {
	//System.out.println("yess..");
	//camera.drawbgimage(g);
	g.drawImage(bgimage,0,0,WIDTH_FRAME,HEIGHT_FRAME,null );
counter++;

} 

public void paintComponent(Graphics g ) {
	drawbackgroundintroimage(g);
	if(counter==12)
		timer2.stop();
}

}