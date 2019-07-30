

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ThePLAYERS implements fixedTHROUGHOUT {
	BufferedImage image;
	BufferedImage image2;
//	ThePLAYERS playerme;
//	ThePLAYERS playerme2;
	private int speed = 5;
	private int hulky;
    private int ryuy;
    private int hulkx; 
    private int ryux;
//	private int y;
	private int w;
	private int h;
	private int check; 
	private int condition;
	private int condition2;
	private boolean isVisible;
	 public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	 public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCondition2() {
		return condition2;
	}
	public int getHulkx() {
		return hulkx;
	}
	public void setHulkx(int hulkx) {
		this.hulkx = hulkx;
	}
	public int getRyux() {
		return ryux;
	}
	public void setRyux(int ryux) {
		this.ryux = ryux;
	}
	public void setCondition2(int condition2) {
		this.condition2 = condition2;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	 BufferedImage walk[] = new BufferedImage[5];
	 BufferedImage roundkick[] = new BufferedImage[7];
	 BufferedImage walkryu[] = new BufferedImage[3];
	 BufferedImage defaultwalk[] = new BufferedImage[2];
	 BufferedImage punch[] = new BufferedImage[5];
	 BufferedImage punchryu[] = new BufferedImage[4];
	 BufferedImage heavypunch[] = new BufferedImage[4];
	 BufferedImage bearpunch[] = new BufferedImage[3];
	 BufferedImage specialattack[] = new BufferedImage[6];
	 BufferedImage ryubearspecialattack[] = new BufferedImage[5];
	 BufferedImage ryubearpunch[] = new BufferedImage[3];
	 BufferedImage bearryufireattack[] = new BufferedImage[6];
	 BufferedImage sitdown[] = new BufferedImage[1];
	 BufferedImage ryusitdown[] = new BufferedImage[1];
	 BufferedImage bearspecialattack[] = new BufferedImage[8];
	 BufferedImage ryustrongkick[] = new BufferedImage[3];
	 BufferedImage ryuverystrongkick[] = new BufferedImage[4];
	 BufferedImage onehulkfireactionattack[] = new BufferedImage[1];
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public BufferedImage[] getRyuverystrongkick() {
		return ryuverystrongkick;
	}
	public void setRyuverystrongkick(BufferedImage[] ryuverystrongkick) {
		this.ryuverystrongkick = ryuverystrongkick;
	}
	private int DOWNWARD_FORCE;
	public ThePLAYERS() {
		condition= STILL;
		condition2= DEFAULTWALK2;
		w=180;
	this.isVisible=true;
		h=180; 
		hulkx= 50;
		ryux=800;
		// since x is starting corner of player...
		hulky=ryuy=(BASE_OF_GAME-w); // since y is starting corner of player... basically y=700-100-200;
	loadhulkplayerwholeallimage(); 
	loadryuplayerwholeallimage(); 
	loadwalk();
	loaddefaultwalkryu();
	loadwalkryu();
	loadpunch();
	loadpunchryu();	
	loadspecialattack();
	loadbearpunch();
	loadheavypunch();     									
	loadsitdown();
	loadbearspecialattack();
	loadbearryufireattack();
	loadroundkick();
	loadryuspecialattackbear();
	loadryubearpunch();
	loadryusitdown();
	loadryustrongkick();
	loadryuverystrongkick();
	loadonehulkfireactionattack();
	}
	
	public void movefast2() {
		if(ryux>40)
		ryux-=speed*3;
		
	}
//	public void movefast2() {
//		if(hulkx>=(50))
//		hulkx-=speed*3;
//		
	
public void loadonehulkfireactionattack(){
	onehulkfireactionattack[0]=image.getSubimage(148,285,239-148,372-285);
}
	public void movefast1() {
		if(hulkx<=(WIDTH_FRAME-200)) 
		hulkx+=speed*3;
	}
	public int getHulky() {
		return hulky;
	}
	public void setHulky(int hulky) {
		this.hulky = hulky;
	}
	public int getRyuy() {
		return ryuy;
	}
	public void setRyuy(int ryuy) {
		this.ryuy = ryuy;
	}
	public void drawmyplayerhulk(Graphics g) {
		if(condition==STILL)
			defaultstandbyhulkimage(g);
		if(condition==WALK)
			walk(g);
		if (condition==PUNCH)
			punch(g);
//		if(condition==SPECIALS)
//			specialattack(g);
		if (condition==HEAVYPUNCH)
			heavypunch(g);
		if(condition==BEARPUNCH)
			bearpunch(g);
		if(condition==BEARSPECIALATTACK)
			bearspecialattack(g); 
		if(condition==SPECIALATTACK)
			specialattack(g);
	if(condition==SITDOWN)
		sitdown(g);
	if(condition==FIREATTACK)
		onehulkfireactionattack(g);
	}
	public void drawplayerryu(Graphics g) {
		if(condition2==DEFAULTWALK2) 
			defaultwalkryu(g);
		if(condition2==PUNCHRYU2)
				punchryu(g);
		if(condition2==WALK2)
				walkryu(g);
			if(condition2==ROUNDKICKRYU)
				roundkickryu(g);
			if(condition2==SITDOWN2)
				ryusitdown(g);
			if(condition2==RYUSTRONGKICK)
				ryustrongkick(g);
			if(condition2==RYUVERYSTRONGKICK)
				ryuverystrongkick(g);
				if(condition2==BEARSPECIALATTACK)
					ryuspecialattackbear(g);
				if(condition2==FIREBEARBYRYU)
					bearryufireattack1(g);
				if(condition2==RYUBEARPUNCH)
					ryubearpunch(g);
			//		if(condition2==FIRE) {
//	bearryufireattack(g);
//	}
	}
	public void allroundermoving(int direction) {
		
		if(direction==1 && hulkx>50)
		{	//	speed=5;
		hulkx-=speed;
		if(speed==0)
		{	speed=5;
			hulkx-=speed;
	}
		}
		if(direction==2  && ryux>40) {// call colliosoin this is not good; getx of both width calculate height difference
			//speed=5;
			System.out.println("ryu x is"+ryux);
			System.out.println("speed inside direction 2   "+speed);
//			System.out.println("condition 2 is "+condition2);
//			if(condition2==WALK2) {
				ryux-=speed;
			
			
//			System.out.println("ryux after changing x is "+ryux);
		}
			if(direction==3 && ryux<(WIDTH_FRAME-200))
			{//	speed=5;
				ryux+=speed;
				if(speed==0)
				{	speed=5;
					ryux+=speed;
					}
			}	if(direction==4 &&  hulkx<(WIDTH_FRAME-180))
				{		//System.out.println("hulk x is"+hulkx);
				
	//speed =5;			
	hulkx+=speed;	
				}
	}
//	public void moveleft1() {
	
//if(ryux>=50)
//		ryux-=speed;
//	}
//	public void moveright1() {
//		if(ryux<=(WIDTH_FRAME-200))
//		ryux+=speed;
//		
	//}
	public void loadroundkick() { 
		roundkick[0]= image2.getSubimage(79,147,112-79,203-147);
		roundkick[1]= image2.getSubimage(112,153,146-112,203-153);
		roundkick[2]= image2.getSubimage(369,140,413-369,202-140);
		roundkick[3]= image2.getSubimage(414,142,444-414,201-142);
		roundkick[4]= image2.getSubimage(445,143,494-445,204-143);
		roundkick[5]= image2.getSubimage(493,141,521-493,203-141);
		roundkick[6]= image2.getSubimage(261,73,314-261,126-73);
		}
	public void loadryubearpunch() {
		ryubearpunch[0] = image2.getSubimage(0,148,30,195-148);
		ryubearpunch[1] = image2.getSubimage(112,152,145-112,202-152);
		ryubearpunch[2] = image2.getSubimage(144,167,196-144,202-167);
//		ryubearpunch[3] = image2.getSubimage();
//		ryubearpunch[4] = image2.getSubimage();
		
	}
	public void loadryuspecialattackbear() {
		
		ryubearspecialattack[0] = image2.getSubimage(0,211,29,265-211);
		ryubearspecialattack[1] = image2.getSubimage(33,219,73-33,266-219);
		ryubearspecialattack[2] = image2.getSubimage(76,227,105-76,265-227);
		ryubearspecialattack[3] = image2.getSubimage(110,223,145-110,264-223);
		ryubearspecialattack[4] = image2.getSubimage(146,243,201-146,265-243);
		
		
		
	}
	public void loadryusitdown() {
		
		ryusitdown[0] = image2.getSubimage(57,23,83-57,58-23);
		
		
	}
	int countryubearpunch =0;
	int delayryubearpunch =0;
	public void ryubearpunch(Graphics g) {
		
		
		if(countryubearpunch>=3) {// according to the array
			countryubearpunch = 0;
		condition2= DEFAULTWALK2;
		
	}
		g.drawImage(ryubearpunch[countryubearpunch], ryux,ryuy,w,h,null);
		if(delayryubearpunch>=8) {// according to the my requirement of delaying the gap.............
			countryubearpunch++;
			delayryubearpunch=0;
			if(ryux<(WIDTH_FRAME-200)) {
				ryux+=50;
				}

		}delayryubearpunch++;
		
		
	}
	int fcount =0;
	int fdelay =0;
	public void onehulkfireactionattack(Graphics g) {
		if(fcount>=1) {// according to the array
			fcount = 0;
		condition= STILL;
	}
		g.drawImage(	onehulkfireactionattack[fcount], hulkx,hulky,w,h,null);
		if(bearryufiredelay>=5) {// according to the my requirement of delaying the gap.............
			fcount++;
			fdelay=0;
			
		}fdelay++;
		
	}
	int countryubearspecialattack =0;
	int delayryubearspecialattack =0;
    public void ryuspecialattackbear(Graphics g ) {
    	
    	if(countryubearspecialattack>=5) {// according to the array
    		countryubearspecialattack = 0;
		condition2= DEFAULTWALK2;
	}
		g.drawImage(	ryubearspecialattack[countryubearspecialattack], ryux,ryuy,w,h,null);
		if(delayryubearspecialattack>=8) {// according to the my requirement of delaying the gap.............
			countryubearspecialattack++;
			delayryubearspecialattack=0;
			ryux+=50;
		}delayryubearspecialattack++;
		
    	
    	
    	
    	
    }
    public void loadryuverystrongkick() {
    	
    	ryuverystrongkick[0]=image2.getSubimage(113,153,145-113,202-153);
    	ryuverystrongkick[1]=image2.getSubimage(30,149,75-30,184-149);
    	ryuverystrongkick[2]=image2.getSubimage(103,68,146-103,125-68);
    	ryuverystrongkick[3]=image2.getSubimage(78,62,103-78,125-62);
    	
    } int c2=0;
    		int d2=0;
    public void ryuverystrongkick(Graphics g) {
            if(c2>=4) {
    		c2 = 0;
		condition2= DEFAULTWALK2;
	}
		g.drawImage(	ryuverystrongkick[c2], ryux,ryuy,w,h,null);
		if(d2>=5) {
			c2++;
			d2=0;
			}d2++;
    	 }
    int c1=0;
    int d1=0;
    
    public void ryustrongkick(Graphics g) {
    	
    	
    	if(c1>=3) {// according to the array
    		c1 = 0;
		condition2= DEFAULTWALK2;
	}
		g.drawImage(	ryustrongkick[c1], ryux,ryuy,w,h,null);
		if(d1>=5) {// according to the my requirement of delaying the gap.............
			c1++;
			d1=0;
			
		}d1++;
		
    	
    	
    }
    public void loadryustrongkick() {
    	
    	ryustrongkick[0]=image2.getSubimage(315,77,346-315,126-77);
    	ryustrongkick[1]=image2.getSubimage(261,73,314-261,124-73);
    	ryustrongkick[2]=image2.getSubimage(230,75,261-230,125-75);
    	
    	
    	
    }
    int c=0;
    int d=0;
    public void ryusitdown(Graphics g ) {
    	if(c>=1) {// according to the array
    		c = 0;
    	condition2= DEFAULTWALK2;
    }
    	g.drawImage(ryusitdown[c], ryux,ryuy,w,h,null);
    	if(d>=5) {// according to the my requirement of delaying the gap.............
    		//sitdowncount++;
    		d=0;
    		
    	}d++;    }
	public void moveleft() {
		if(hulkx>=50)
		{	
		hulkx=hulkx-speed;
	}}
	public void moveright() {
		if(hulkx<=(WIDTH_FRAME-200))
		hulkx+=speed;
		
	}int countryu=0;
	int delayryu=0;
	public void roundkickryu(Graphics g) {
		
		if(countryu>=7) {// according to the array
			countryu = 0;
		condition2= DEFAULTWALK2;
	}
		g.drawImage(	roundkick[countryu], ryux,ryuy,w,h,null);
		if(delayryu>=4) {// according to the my requirement of delaying the gap.............
			countryu++;
			delayryu=0;
			
		}delayryu++;
	}
	
public void loadhulkplayerwholeallimage() {
	try{
		image = ImageIO.read(ThePLAYERS.class.getResource("hulk.gif"));
		}
		catch(Exception e){
		System.out.println("There is some problem in hulkplayerload...");
		}
	} 
public void loadryuplayerwholeallimage() {
	try{
		image2 = ImageIO.read(ThePLAYERS.class.getResource("RYU.gif"));
		}
		catch(Exception e){
		System.out.println("There is some problem in kenplayerload...");
		}
	} 
public void loadbearryufireattack() {
	
	bearryufireattack[0]=image2.getSubimage(242,207,273-242,263-207);
	bearryufireattack[1]=image2.getSubimage(273,205,307-273,265-205);
	bearryufireattack[2]=image2.getSubimage(203,210,234-203,265-210);
	bearryufireattack[3]=image2.getSubimage(306,220,353-306,255-220);
	bearryufireattack[4]=image2.getSubimage(352,219,400-352,257-219);
	bearryufireattack[5]=image2.getSubimage(143,243,202-143,266-243);
	
	
	
	
	
} 
int bearryufirecount =0;
int bearryufiredelay=0;
public void bearryufireattack1(Graphics g) {
	//BoardBASE.setting=1;
		//	System.out.println("setting is "+ BoardBASE.setting);;
	if(bearryufirecount>=6) {// according to the array
		bearryufirecount = 0;
		//BoardBASE.setting=0;
	condition2= DEFAULTWALK2;
	
	}
	g.drawImage(	bearryufireattack[bearryufirecount], ryux,ryuy,w,h,null);
	if(bearryufiredelay>=8) {// according to the my requirement of delaying the gap.............
		bearryufirecount++;
		bearryufiredelay=0;
//		System.out.println("ryu condition inside bearfire function is "+condition2);
	}bearryufiredelay++;
}
public void loadheavypunch() {
	
	heavypunch[0]=image.getSubimage(7,199,75-7,275-199);
	heavypunch[1]=image.getSubimage(86,197,155-86,275-197); 
	heavypunch[2]=image.getSubimage(161,199,246-161,275-199);
	heavypunch[3]=image.getSubimage(248,200,347-248,277-200);

} public void loadwalkryu() {
	
	walkryu[0]= image2.getSubimage(116,7,142-116,59-7);
	walkryu[1]= image2.getSubimage(401,208,439-401,265-208);
	walkryu[2]= image2.getSubimage(147,68,180-147,126-68);
	
}
public void loaddefaultwalkryu() {
	defaultwalk[0] = image2.getSubimage(0,3,27-0,59-3);
	//defaultwalk[1] = image2.getSubimage(26,4,54-26,58-4);
	defaultwalk[1] = image2.getSubimage(117,7,142-117,59-7);
	//defaultwalk[3] = image2.getSubimage(86,4,117-86,59-4);
	}
public void loadsitdown() {
	
	//sitdown[0]= image.getSubimage(458,38,527-458,103-38);
	sitdown[0]= image.getSubimage(532,43,614-532,106-43);
}

int heavypunchcount =0;
int heavypunchdelay=0;
public void punch(Graphics g) {
	
	if(punchcount>=5) {// according to the array
		punchcount = 0;
	condition= STILL;
}
	g.drawImage(punch[punchcount], hulkx,hulky,w,h,null);
	if(punchdelay>=5) {// according to the my requirement of delaying the gap.............
		punchcount++;
		punchdelay=0;
		
	}punchdelay++;
	
}int walkryucount =0;
int walkryudelay =0;
public void walkryu(Graphics g) {
	
	
	
	if(walkryucount>=3) {	// according to the array
		walkryucount = 0;
	condition2= DEFAULTWALK2;
}
	
	g.drawImage(walkryu[walkryucount], ryux,hulky,175,175,null);
	if(walkryudelay>=5) {// according to the my requirement of delaying the gap.............
		walkryucount++;
		walkryudelay=0;
		
	}walkryudelay++; 
	
	
	//  5,4,71,71 fire
	
}
private int punchryucount = 0;
private int punchryudelay = 0;
public void punchryu(Graphics g) {
	 
	if(punchryucount>=4) {// according to the array
		punchryucount = 0;
	condition2= DEFAULTWALK2;
}
	g.drawImage(punchryu[punchryucount], ryux,ryuy,175,175,null);
	if(punchryudelay>=3) {// according to the my requirement of delaying the gap.............
		punchryucount++;
		punchryudelay=0;
		
	}punchryudelay++;
	
}
int sitdowncount =0;
int sitdowndelay=0;
public void sitdown(Graphics g) {
	
	if(sitdowncount>=1) {// according to the array
		sitdowncount = 0;
	condition= STILL;
}
	g.drawImage(sitdown[sitdowncount], hulkx,hulky,w,h,null);
	if(sitdowndelay>=5) {// according to the my requirement of delaying the gap.............
		//sitdowncount++;
		sitdowndelay=0;
		
	}sitdowndelay++;
	
}
public void loadwalk() {
	walk[0]=image.getSubimage(5,282,82-5,373-282);
	walk[1]=image.getSubimage(85,283,146-85,372-283);
	walk[2]=image.getSubimage(148,285,239-148,371-285);
	walk[3]=image.getSubimage(243,290,313-243,379-290);
	walk[4]=image.getSubimage(385,297,474-385,384-297);
}

public void loadpunch() {
	punch[0]=image.getSubimage(85,2,145-85,90-2);
	punch[1]=image.getSubimage(159,1,220-159,91-1); 
	punch[2]=image.getSubimage(221,1,282-221,90-1);
	punch[3]=image.getSubimage(289,4,354-289,92-4);

	punch[4]=image.getSubimage(361,5,470-361,92-5);
}
public void loadpunchryu() {
	punchryu[0]=image2.getSubimage(147,69,179-147,126-69);
	punchryu[1]=image2.getSubimage(438,209,469-438,265-209); 
	punchryu[2]=image2.getSubimage(401,209,440-401,265-209);
	punchryu[3]=image2.getSubimage(179,70,226-179 ,126-70);

	//punch[4]=image.getSubimage(361,5,470-361,92-5);
}
public void loadbearpunch() {// should be called when the distance is min. to min almost touched...
	//image.getSubimage(394,107,458-394,200-107);
	bearpunch[0]=image.getSubimage(394,107,458-394,200-107);
	bearpunch[1]=image.getSubimage(6,198,74-6,276-198);
	bearpunch[2]=image.getSubimage(86,198,154-86,275-198);
}
public void loadbearspecialattack() 
{
	bearspecialattack[0]=image.getSubimage(395,106,457-395,200-106);
	bearspecialattack[1]=image.getSubimage(465,106,555-465,156-106);
	bearspecialattack[2]=image.getSubimage(464,161,566-464,203-161);
	bearspecialattack[3]=image.getSubimage(571,105,663-571,167-105);
	bearspecialattack[4]=image.getSubimage(582,167,670-582,232-167);
	bearspecialattack[5]=image.getSubimage(436,210,509-436,280-210);
	bearspecialattack[6]=image.getSubimage(517,210,575-517,282-210);
	bearspecialattack[7]=image.getSubimage(585,237,639-585,320-237);

}
public void loadspecialattack() 
{
	specialattack[0]=image.getSubimage(7,94, 69-7,185-94);
specialattack[1]=image.getSubimage(85,94,153-85,192-94);
specialattack[2]=image.getSubimage(163,96,217-163,197-96);
specialattack[3]=image.getSubimage(233,109,308-233,181-109);
specialattack[4]=image.getSubimage(319,115,387-319,188-115);
specialattack[5]=image.getSubimage(584,237,642-584,321-237);
}
int bearcount = 0;
int beardelay = 0;
public void bearpunch(Graphics g) {
	
	if(bearcount>=3) {
		bearcount = 0;
	condition= STILL;
}
	g.drawImage(bearpunch[bearcount], hulkx,hulky,w,h,null);
	if(beardelay>=6) {
		bearcount++;
		beardelay=0;
		
	}beardelay++;
}  
int specialbearattackcount = 0;
int specialbearattackdelay = 0;
public void bearspecialattack(Graphics g ) {
	
	if(specialbearattackcount>=8) {
		specialbearattackcount = 0;
	condition= STILL;
}
	g.drawImage(bearspecialattack[specialbearattackcount],hulkx,hulky,w,h,null);
	if(specialbearattackdelay>=6) {
		specialbearattackcount++;
		specialbearattackdelay=0;
		
	}specialbearattackdelay++;
}
int specialcount = 0;
int specialdelay = 0;
public void specialattack(Graphics g ) {
	
	if(specialcount>=6) {
		specialcount = 0;
	condition= STILL;
}
	g.drawImage(specialattack[specialcount], hulkx,hulky,w,h,null);
	if(specialdelay>=6) {
		specialcount++;
		specialdelay=0;
		
	}specialdelay++;
}
int walkcount = 0;
int walkdelay = 0;
public void walk(Graphics g) {
	if(walkcount>=5) {
		walkcount = 0;
	condition= STILL;
}
	g.drawImage(walk[walkcount], hulkx,hulky,w,h,null);
	if(walkdelay>=4) {
		walkcount++;
		walkdelay=0;
		
	}walkdelay++;  
	
}
int defaultwalkcount = 0;
int defaultwalkdelay = 0;
public void defaultwalkryu(Graphics g) {
	if(defaultwalkcount>=2) {
		defaultwalkcount = 0;

}
	g.drawImage(defaultwalk[defaultwalkcount], ryux,ryuy,175,175,null);
	if(defaultwalkdelay>=6) {
		defaultwalkcount++;
		defaultwalkdelay=0;
		
	}defaultwalkdelay++;  
	
}

int punchcount = 0;
int punchdelay = 0;
public void heavypunch(Graphics g) {

	if(heavypunchcount>=4) {// according to the array
		heavypunchcount = 0;
	condition= STILL;
}
	g.drawImage(heavypunch[heavypunchcount], hulkx,hulky,w,h,null);
	if(heavypunchdelay>=5) {// according to the my requirement of delaying the gap.............
		heavypunchcount++;
		heavypunchdelay=0;
		
	}heavypunchdelay++;
	
}
public void defaultstandbyhulkimage(Graphics g) {
	BufferedImage imagex = image.getSubimage(7,198,74-7,276-198);
	g.drawImage(imagex,hulkx,hulky,w,h,null);
	}
//public void defaultstandbyryuimage(Graphics g) {
//	BufferedImage imagex = image2.getSubimage(26,4,53-26,59-4);
//	g.drawImage(imagex,x+500,y,175,175,null);
//	}

public void jump() {
	if(check==0) {
		check=1;
		 DOWNWARD_FORCE=-18;
	hulky+=DOWNWARD_FORCE;
	
	}
}

public void setaccuracy() {
		 if(hulky>=(BASE_OF_GAME-h)){
			 check=0;
			hulky  = (BASE_OF_GAME - h);
		 }
		  if(hulky<((BASE_OF_GAME-w)))	
	{  hulky+=DOWNWARD_FORCE;
	DOWNWARD_FORCE+=GRAVITY; 
	//System.out.println(y);	}
	} 
		  }
	
//		  public void jump1() {
//				if(check==0) {
//					check=1;
//					 DOWNWARD_FORCE=-18;
//				ryuy+=DOWNWARD_FORCE;
//				
//				}
//
//				
//			}

//				public void setaccuracy1() {
//					 if(ryuy>=(BASE_OF_GAME-h)){
//						 check=0;
//						 ryuy = (BASE_OF_GAME - h);
//					 }
//					  if(ryuy<(BASE_OF_GAME-w))	
//				{ryuy+=DOWNWARD_FORCE;
//				//System.out.println("ryuy is "+ ryuy);
//				DOWNWARD_FORCE+=GRAVITY; 
//				//System.out.println(y);	}
//				}
//				
//	
//}
}