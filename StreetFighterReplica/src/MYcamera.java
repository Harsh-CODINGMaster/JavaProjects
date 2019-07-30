//package streetFIGHTERmyOWN;
//
//import java.awt.Graphics;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//
//public class MYcamera implements fixedTHROUGHOUT{
//	JFrame frame;
//	BufferedImage image;
//	private int speed;
//	private int x; 
//	private int y;
//	public MYcamera(JFrame jframe)  {
//		
//		this.frame= jframe; 
//		speed = 6;
//		loadcameraIMAGE();
//	}
//public void drawbgimage(Graphics g) {
//	System.out.println("tes222");
//	BufferedImage image2 = image.getSubimage(x, y, WIDTH_FRAME, HEIGHT_FRAME);
//	g.drawImage(image2,0, 0, WIDTH_FRAME, HEIGHT_FRAME,null);
//	System.out.println("end/..");
//}	
//
//public void loadcameraIMAGE()  {
//	
//	try {
//		image = ImageIO.read(MYcamera.class.getResource(backgroundcamera));
//	}
//		catch(IOException e){
//			JOptionPane.showMessageDialog(frame, "Something went Wrong, No Background Found");
//			System.out.println(e);
//			System.exit(0);
//		}
//		catch(IllegalArgumentException e){
//			JOptionPane.showMessageDialog(frame, "Something went Wrong, No Background Found");
//			e.printStackTrace();
//			System.out.println(e);
//			System.exit(0);
//		}
//}
//
//public void left() {
//	if(x>4)
//	x=x-speed;
//}
//
//public void right() {
//	if(x<2400-WIDTH_FRAME)
//	{
//		x+=speed;
//	}
//	
//}
//public void right1()
//{if(x<2400-WIDTH_FRAME)
//{
//	x+=speed*5;
//}
//
//}
//}