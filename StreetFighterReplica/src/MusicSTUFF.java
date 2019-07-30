import java.io.File;

import jaco.mp3.player.MP3Player;

	public class MusicSTUFF {

		static MP3Player mp3;
	public static void play1(int a) {

	    try{
	         
	         mp3 = new MP3Player(MusicSTUFF.class.getResource("30. E. Honda Stage.mp3"));
	        if(a==1) {
	        mp3.play();
	        }
//	        else if(a==2) {System.out.println("i am in stop");
//	        mp3.stop();
//	      //  mp3.pause();
//	    }
	       }
	    catch(Exception e){System.err.println(e);}
	}
	

	public static void play2() {
		//System.out.println("Music stopped");
			mp3.stop();
	}
	}
	
//	public static void stop() {
//		try{
//	         
//	        MP3Player mp3 = new MP3Player(MusicSTUFF.class.getResource("30. E. Honda Stage.mp3"));
//	        mp3.pause();
//	    }
//	    catch(Exception e){System.err.println(e);}
//	}
//	}
	
	
	
	


