
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import jaco.mp3.player.N;
 
public class BoardBASE extends JPanel implements fixedTHROUGHOUT{
	 private Timer timer;
	 private Image bgimage;
	 private Image mainimage;
	// public static int setting;   
	 public int fireCOUNTER=0;
	 ThePLAYERS playerme;
	 ThePLAYERS playerme2;
	// private int firetimerDELAY =0;
	 public static long counter;
	 private ArrayList<fireATTACK> fires = new ArrayList<>();
	 //public int condition;
//	public int getCondition() {
//		return condition;
//	}
//
//	public void setCondition(int condition) {
//		this.condition = condition;
//	}
//String play = "PLAY";
//String stop = "STOP";
	//	MYcamera camera;
	public BoardBASE(JFrame jframe){
		
		MusicSTUFF.play1(1);
		
		//MusicStuffFIRE2.play2();
	setSize(WIDTH_FRAME,HEIGHT_FRAME); 
	bgimage= new ImageIcon(BoardBASE.class.getResource(intropicture)).getImage();
	mainimage = new ImageIcon(BoardBASE.class.getResource(mainpicture)).getImage();
	//camera = new MYcamera(jframe);
	setFocusable(true);
	playerme = new ThePLAYERS();
	playerme2 = new ThePLAYERS();	
	keysevent();
	againloop();
	}
	

	private void addFire(){
		int firex = (playerme.getHulkx()+playerme.getW()/2+78);
		int firey = ((playerme.getHulky()+playerme.getH()/2)-10);
		fireATTACK fire1 = new fireATTACK(firex, firey);
		fires.add(fire1);
	}
	
//	public boolean flag = false;
	int checker=0;
	public static int fire2=0;
	public void fireDELAY() {
		
		fireCOUNTER=1;
		if(fire2>=12) {
			fireCOUNTER=0;
			fire2=0;
		}
		fire2++;
		
	}
private void keysevent() {
	KeyListener kyl = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {// set for ryu as well...//
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_DOWN){
				playerme.setCondition(STILL);
			}
			if(e.getKeyCode()==KeyEvent.VK_S){
				playerme2.setCondition2(DEFAULTWALK2);
			}
			if(e.getKeyCode()==KeyEvent.VK_F){
				playerme.setCondition(STILL);
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT){
				playerme.setCondition(STILL);
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT){
				playerme.setCondition(STILL);
			}
			if(e.getKeyCode()==KeyEvent.VK_UP){
				playerme.setCondition(STILL);
			}
		if(playerme2.getCondition2() == DEFAULTWALK2) {
			if(e.getKeyCode()==KeyEvent.VK_A) {
//				System.out.println("ryu key a release "+playerme2.getCondition2());
			playerme2.setCondition2(DEFAULTWALK2);
			
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			playerme2.setCondition2(DEFAULTWALK2);
			
			}
//		if(e.getKeyCode()==KeyEvent.VK_R){
//			playerme2.setCondition2(DEFAULTWALK2);
//			
//		}
//		if(e.getKeyCode()==KeyEvent.VK_T){
//			playerme2.setCondition2(DEFAULTWALK2);
//		}
		
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(counter>=150) {
			if(e.getKeyCode()==KeyEvent.VK_P){
				playerme.setCondition(PUNCH);
				checker=PUNCH;
			}
			
			if(e.getKeyCode()==KeyEvent.VK_W){
				playerme2.setCondition2(WALK2);
				playerme2.movefast2();
			}if(fireCOUNTER==0) {
			if(e.getKeyCode()==KeyEvent.VK_F){
				MusicStuffFIRE2.play2();
				addFire();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_H){
				playerme.setCondition(HEAVYPUNCH);
				checker=HEAVYPUNCH;
			}
//			if(e.getKeyCode()==KeyEvent.VK_F){
//				playerme2.setCondition2(FIRE);
//			}
			if(e.getKeyCode()==KeyEvent.VK_R){
				playerme2.setCondition2(RYUSTRONGKICK);
			checker=RYUSTRONGKICK;	
			}
			if(e.getKeyCode()==KeyEvent.VK_T){
				playerme2.setCondition2(RYUVERYSTRONGKICK);
			checker=RYUVERYSTRONGKICK;
			}
		if(!(playerme.getSpeed()==0)) {
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		playerme.setCondition(WALK);
		playerme.allroundermoving(4);
		}}
//		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {;}
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					playerme.setCondition(WALK);
					playerme.allroundermoving(1);
				}
				if(e.getKeyCode()==KeyEvent.VK_E) {
					playerme2.setCondition2(ROUNDKICKRYU);
					checker=ROUNDKICKRYU;
				}
				if(playerme2.getCondition2()==DEFAULTWALK2) {
				if(e.getKeyCode()==KeyEvent.VK_A) {
//					System.out.println("inside VK_A");
					System.out.println("condition2 is "+playerme2.getCondition2());
					playerme2.setCondition2(WALK2);
					//if(playerme2.getCondition2()==DEFAULTWALK2) {
						playerme2.allroundermoving(2);
					//}
				}
					}
				if(e.getKeyCode()==KeyEvent.VK_Q) {
					playerme2.setCondition2(PUNCHRYU2);
					checker=PUNCHRYU2;
				}
				if(e.getKeyCode()==KeyEvent.VK_D) {
				playerme2.setCondition2(WALK2);
					playerme2.allroundermoving(3);
				}
				if(e.getKeyCode()==KeyEvent.VK_S) {
					playerme2.setCondition2(SITDOWN2);
					}
//				if(e.getKeyCode()==KeyEvent.VK_U) {
//					playerme2.setCondition2(WALK2);
//					//playerme2.movefast2();}
//				if(e.getKeyCode()==KeyEvent.VK_W) {
//					playerme.setCondition(WALK);
//					playerme.movefast1();}
				
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					playerme.setCondition(WALK);
					playerme.movefast1();}
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {playerme.jump();}
				//if(e.getKeyCode()==KeyEvent.VK_J) {playerme2.jump1();}
					//if(e.getKeyCode()==KeyEvent.VK_K)
			if(e.getKeyCode()==KeyEvent.VK_L) {
				playerme.setCondition(SPECIALATTACK);
				 checker=SPECIALATTACK;
			}
//	
			if(e.getKeyCode()==KeyEvent.VK_F) {
				if(fireCOUNTER==0) {
				playerme.setCondition(FIREATTACK);
				
			}}
			
//	
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				if(playerme.getCondition()==STILL) {
					if(playerme.getHulky()==BASE_OF_GAME-180) {
				playerme.setCondition(SITDOWN);
			}}}
			}
		}
	};
	this.addKeyListener(kyl);
	
}
private void drawNameHULK(Graphics g){
	g.setColor(Color.GREEN);
	g.setFont(new Font("Arial",Font.BOLD,50));
	g.drawString("HULK ",(WIDTH_FRAME-900),100);
}
private void drawNameRYU(Graphics g){
	g.setColor(Color.GREEN);
	g.setFont(new Font("Arial",Font.BOLD,50));
	g.drawString("RYU ",(WIDTH_FRAME-500),100);
}
//private void OverlapLifelineOfHULK(Graphics g) {
//	if(playerme2.getCondition2()==RYUSTRONGKICK) {
//		g.setColor(Color.RED);
//		g.fillRect(500, 125, 50, 25);	
//	}
////	
////	timer.stop();
////	GameOver(g);
//}


private void againloop() {
	
	ActionListener kyl = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			repaint();
		playerme.setaccuracy();
		//playerme2.setaccuracy1();
	
		}
	};
	timer = new Timer(DELAY,kyl);
	timer.start();
}

private void drawbackgroundintroimage(Graphics g) {
	//System.out.println("yess..");
	//camera.drawbgimage(g);
	g.drawImage(bgimage,0,0,WIDTH_FRAME,HEIGHT_FRAME,null );
counter++;
} 

//public long counter2;
public void drawbackgroundmainimage(Graphics g){
	
	g.drawImage(mainimage,0,0,WIDTH_FRAME,HEIGHT_FRAME,null);
}

public void beartest() {
	
	if(playerme.getHulkx()==playerme2.getRyux())
	{   playerme2.setCondition2(BEARSPECIALATTACK);   }
	
}

private boolean collision(){
	
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50);
}
private boolean CollisionCHECKallTIME1() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50 && playerme.getCondition()==PUNCH);
	
}
private boolean CollisionCHECKallTIME2() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50 && playerme.getCondition()==HEAVYPUNCH);
	
}
private boolean CollisionCHECKallTIME3() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW() && ygap<=playerme2.getH()&& playerme.getCondition()==SPECIALATTACK);
	
}
private boolean CollisionCHECKallTIME4() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50 && playerme2.getCondition2()==PUNCHRYU2);
	
}
private boolean CollisionCHECKallTIME5() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50 && playerme2.getCondition2()==ROUNDKICKRYU);
	
}

private boolean CollisionCHECKallTIME6() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50 && playerme2.getCondition2()==RYUSTRONGKICK);
	
}
private boolean CollisionCHECKallTIME7() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());
	return(xgap<=playerme.getW()-50 && ygap<=playerme2.getH()-50 && playerme2.getCondition2()==RYUVERYSTRONGKICK);
	
}

int x=0;
private void GameOver(Graphics g){
	g.setFont(new Font("Arial",Font.BOLD, 70));
	g.setColor(Color.YELLOW);
	g.drawString("Game Over", (WIDTH_FRAME/2)-150, (HEIGHT_FRAME/2)-30);
	
	if(playerHULKscore>=350) {
		g.setFont(new Font("Arial",Font.BOLD, 50));
		g.setColor(Color.WHITE);
	g.drawString("RYU WON...", (WIDTH_FRAME/2)-130, (HEIGHT_FRAME/2)-90);
	//x=1;
if(playerme.isVisible()) {
	playerme.setVisible(false);
	}
	}	
	else if(playerRYUscore>=350) {
		System.out.println("i print won");
		g.setFont(new Font("Arial",Font.BOLD, 50));
		g.setColor(Color.WHITE);
		g.drawString("HULK WON...", (WIDTH_FRAME/2)-130, (HEIGHT_FRAME/2)-90);
		//playerme2.setVisible(false); // not anymore on d sc reen...
		callingALLplyerDISPOSE();
	}
	}

private int delay=0;
public void printFIRES(Graphics g){
	
	if(fires.size()>0){
	for(fireATTACK fire2 : fires){
		 if(fire2.isVisible())  {
			fire2.drawFIRE(g);
		      if(checkcollision2(fire2,playerme2)) {
				 playerme2.setCondition2(FIREBEARBYRYU);
				 checker=FIREBEARBYRYU;
//				 System.out.print?ln("RYU condition is "+playerme2.getCondition2());
				fire2.setVisible(false);
				 }
				}	
               }  
	          }				
	          }
	
	
//private void OverlapLifelineOfHULK(Graphics g) {
//
//	g.setColor(Color.BLUE);
//	g.fillRect(100, 125, 350, 25);
//}

//private void OverlapLifelineOfRYU(Graphics g) {
//if(flag==false)
//	{g.setColor(Color.BLUE);
//	g.fillRect(500, 125, 350, 25);
//	}
//	if(CollisionCHECKallTIME1())
//	{ flag=true;
//		playerRYUscore=50;
////	g.setColor(Color.RED);
//		g.setColor(Color.BLUE);
//	g.fillRect(500, 125, 350-playerRYUscore, 25);
////	if(playerRYUscore==350) {
////		timer.stop();
////		MusicSTUFF3.play3();
////		MusicSTUFF.stop();
////	}
//	}
//	
public static int playerHULKscore;
public boolean flag2=false;
public void OverlapLifelineOfHULK(Graphics g){
	if(flag2==false)
	{g.setColor(Color.BLUE);
	g.fillRect(100, 125, 350, 25);

		}
	else if(flag2==true && playerHULKscore<350)
			{g.setColor(Color.BLUE);
			g.fillRect(100, 125, 350-playerHULKscore, 25);
			}
	else if(flag2==true && playerHULKscore>=350) {
		{g.setColor(Color.RED);
		g.fillRect(100, 125, 350, 25);
		}
	}
	
}

public boolean flag=false;

//int ygap= Math.abs(playerme.getHulky()-playerme2.getRyuy());

public static int playerRYUscore;
private void OverlapLifelineOfRYU(Graphics g) {
	
 if(flag==false)
{g.setColor(Color.BLUE);
g.fillRect(500, 125, 350, 25);
	}
else if(flag==true && playerRYUscore<350)
		{g.setColor(Color.BLUE);
		g.fillRect(500, 125, 350-playerRYUscore, 25);
		}
else if(flag==true && playerRYUscore>=350) {
	{g.setColor(Color.RED);
	g.fillRect(500, 125, 350, 25);
	}





}
		}
public void runningALL() {
	int xgap = Math.abs(playerme.getHulkx()-playerme2.getRyux());
	if(xgap<=playerme.getW()-50  && checker==PUNCH)
	{
		flag=true;playerRYUscore+=10;}
	else if(xgap<=playerme.getW()-50  && checker==HEAVYPUNCH)
	{flag = true;
	playerRYUscore+=20;}
	else if(xgap<=playerme.getW()-50 && checker==SPECIALATTACK)
	{flag = true;
	playerRYUscore+=30;}
	else if(xgap<=playerme.getW()-50 && checker==SPECIALATTACK)
	{flag = true;
	playerRYUscore+=30;}
	else if(checker==FIREBEARBYRYU)
	{flag = true;
	playerRYUscore+=50;}
	else if(xgap<=playerme.getW()-50 && checker==RYUSTRONGKICK)
	{flag2 = true;
	playerHULKscore+=10;}
	
	else if(xgap<=playerme.getW()-50 && checker==RYUVERYSTRONGKICK)
	{flag2 = true;
	playerHULKscore+=20;}
	else if(xgap<=playerme.getW()-50 && checker==ROUNDKICKRYU)
	{flag2 = true;
	playerHULKscore+=30;}
	else if(xgap<=playerme.getW()-50 && checker==PUNCHRYU2)
	{flag2 = true;
	playerHULKscore+=40;}
	
	
}
public void makeitZERO(){
	checker=0;
}
public void callgameover(Graphics g){
	if(playerRYUscore>=350 || playerHULKscore>=350) {
		GameOver(g);
		MusicSTUFF.play2();
		MusicSTUFF3.play3();
		timer.stop();
	//	repaint();
	}
	 
}
//private int count;
//public void runningALL(){
//	if(CollisionCHECKallTIME1()) {
//		flag = true;
//		playerRYUscore+=20;	
//		//count=1;
//	}    	
//	if(CollisionCHECKallTIME2()) {
//		flag=true;
//		playerRYUscore+=30;
//	}
	
//	if(CollisionCHECKallTIME2()&&count!=1) {
//		flag=true;
//		playerRYUscore=30;
//	}
//	 if(CollisionCHECKallTIME2()&&count==1) {
//		
//		playerRYUscore+=30;
//	}
//	if(CollisionCHECKallTIME3()) {
//		playerRYUscore=50;
//	}
////	if(CollisionCHECKallTIME2())
//	{
//		flag=true;
//		playerRYUscore=20;
//	g.setColor(Color.RED);
//	g.fillRect(500, 125, playerRYUscore+=playerRYUscore, 25);
//	if(playerRYUscore==350) {
//		timer.stop();
//		MusicSTUFF3.play3();
//		MusicSTUFF.stop();
//	}
//	}
//	
//	if(CollisionCHECKallTIME3())
//	{flag=true;
//		playerRYUscore=60;
//	g.setColor(Color.RED);
//	g.fillRect(500, 125, playerRYUscore+=playerRYUscore, 25);
//	if(playerRYUscore==350) {
//		timer.stop();
//		MusicSTUFF3.play3();
//		MusicSTUFF.stop();
//	}
//	}

	public boolean seeRYU=false;
	int a;
	public void callingALLplyerDISPOSE() {
		if(playerRYUscore>=350) {
		seeRYU=true; 
		a=1;
	}}
	public void lifelineryu(Graphics g) {
	
	g.setColor(Color.RED);
	g.fillRect(500, 125, 350, 25);

}
public void lifelinehulk(Graphics g) {
	
	g.setColor(Color.RED);
	g.fillRect(100, 125, 350, 25);

}
int no1 =0;
int no2=0;
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	if (counter<=150) 
		drawbackgroundintroimage(g);
		if(counter>=150){
	drawbackgroundmainimage(g); 
	//callingALLplyerDISPOSE();
	playerme.drawmyplayerhulk(g);
 
	//if(playerme2.isVisible()) {
	//if(x==0) {	
	if(seeRYU==false) {
	playerme2.drawplayerryu(g); 
	}
	//System.out.println("hello");
	drawNameHULK(g);
	drawNameRYU(g);
	beartest();	
	fireDELAY();
	lifelinehulk(g);
	lifelineryu(g);
	runningALL();
	OverlapLifelineOfRYU(g);
	OverlapLifelineOfHULK(g);
	makeitZERO();
	printFIRES(g);
	if(a==0) {
	callgameover(g);
	}	if(collision()){ // if nothing written then it is true.....!!!!!!!
		playerme.setSpeed(0);
		playerme2.setSpeed(0);
	}
		if(CollisionCHECKallTIME1()) {
			playerme2.setCondition2(RYUBEARPUNCH);
			//OverlapLifelineOfRYU(g);
		}
		if(CollisionCHECKallTIME2()) {
			playerme2.setCondition2(BEARSPECIALATTACK);
			
		}
		if(CollisionCHECKallTIME3()) {
			playerme2.setCondition2(RYUBEARPUNCH);
		}
		if(CollisionCHECKallTIME4()) {
			playerme.setCondition(BEARPUNCH);
			//OverlapLifelineOfHULK(g);
		}
		if(CollisionCHECKallTIME5()) {
			playerme.setCondition(BEARSPECIALATTACK);
			//OverlapLifelineOfHULK(g);
		}
		if(CollisionCHECKallTIME6()) {
			playerme.setCondition(BEARSPECIALATTACK);
			//OverlapLifelineOfHULK(g);
		}
		if(CollisionCHECKallTIME7()) {
			playerme.setCondition(BEARSPECIALATTACK);
			//OverlapLifelineOfHULK(g);
		}
		}
  // rest strat if counter turns 10; 
//ryuspecialattack now images of cut aage aage  and coliision ------array of images;...;
//try//if(player.getstate()==playerstates.kick && player2.geststate()==walk)
//{player2.setstate(kickbear);0
//e.IS CONTROL DOWN()&& 

//    Thread.sleep(1000000000);
		
//}
//catch(InterruptedException ex)
//{`
//    Thread.currentThread().interrupt();
//}
//	public  void checkcollisionoffireandryu() {
//		for(fireATTACK fire2 : fires)
//		if(checkcollision2(fire2,playerme2))
//			bearryufireattack1(g);
//		
//		                                                                   
//	}
}
	public boolean checkcollision2(fireATTACK fire2,ThePLAYERS playerme2) {
	int xgap = Math.abs(fire2.getX()-playerme2.getRyux());
	int ygap= Math.abs(fire2.getY()-playerme2.getRyuy());
	System.out.println("ygap of fire and ryu is"+ygap);

	return(xgap<=playerme.getW()-150 && ygap<=playerme2.getH()-50 );
}
	

}