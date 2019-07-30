
//1800 lines till now

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/**   This is a basic REPLICA of the game STREET FIGHTER
 *  The Game has only one level and is a 2 PLAYER game
 *  This is basic project made purely by using GUIs and OOPS
 *  It has lots of moves,features, and sound effects
 *  The game consists of 2 players namely - RYU and HULK
 *
 *  KEY CONTROLS FOR PLAYER 1 i.e. HULK ARE :
 *  
 *  P = PUNCH 
 *  F = FIRE
 *  H = HEAVY PUNCH 
 *  UPARROWKEY = MOVE FAST 
 *  DOWNARROWKEY = SIT DOWN
 *  RIGHTARROWKEY = walk towards right 
 *  LEFTARROWKEY = walk towards left
 *  L = special attack  
 *  SPACE = jump 
 *  
 *  
 *  KEY CONTROLS FOR PLAYER 2 i.e. RYU ARE :
 *  
 *  W = move fast towards left
 *  A = left walk
 *  D = right walk
 *  S = sit down
 *  R = strongkick
 *  T = VERYSTRONGKICK
 *  E = RoundKICK
 *  Q = Punch
 *  
 *  RYU NEVER JUMPS....
 *  
 *  * @author Harsh Gupta
 *
 */

public class FrameBase extends JFrame implements fixedTHROUGHOUT
{
	Boardbase2intro b1;
	FrameBase() throws IOException  //throws IOException
, UnsupportedAudioFileException, LineUnavailableException
	{
	
		setResizable(false);
	//	setLocationRelativeTo(null); // don't open frame from centre from top left corner of d screen
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH_FRAME,HEIGHT_FRAME);
//		Boardbase2intro bb = new Boardbase2intro();
//		add(bb);
  
		//if (b1.getCounter()==12) 
			BoardBASE board = new BoardBASE(this);  
	         add(board);
		     setVisible(true);
		
	}

	public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException  {

		FrameBase framebase =  new  FrameBase ();
		

	}
	
}
