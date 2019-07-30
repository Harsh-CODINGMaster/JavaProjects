import java.io.File;

import jaco.mp3.player.MP3Player;

	public class MusicSTUFF3 {

	public static void play3() {

	    try{
	         
	        MP3Player mp3 = new MP3Player(MusicSTUFF.class.getResource("gameoverSOUND.mp3"));
	        mp3.play();
	    }
	    catch(Exception e){System.err.println(e);}
	}
	
	}


