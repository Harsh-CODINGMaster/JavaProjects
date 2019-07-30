
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class fireATTACK implements fixedTHROUGHOUT{
	private boolean isVisible2;
	private Image fireimage;
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	public fireATTACK(int x, int y){ // param const
		this.x = x ;
		this.y = y;
		this.h = this.w = 50;
		this.speed = 12;
		this.isVisible2 = true;    
	fireimage = new ImageIcon(fireATTACK.class.getResource(firepicture)).getImage();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public  void  move () {
		if(x>=WIDTH_FRAME){
			this.isVisible2 = false;
		}
		x+=speed;
	}
	
	public boolean isVisible() {
		return isVisible2;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible2 = isVisible;
	}
	
	public void drawFIRE(Graphics g){
		g.drawImage(fireimage,x,y,w,h,null);
		move();
	}
}
