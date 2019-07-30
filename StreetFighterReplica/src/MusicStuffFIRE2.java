
import jaco.mp3.player.MP3Player;

public class MusicStuffFIRE2 {

	

		public static void play2() {

		    try{
		         
		        MP3Player mp3 = new MP3Player(MusicSTUFF.class.getResource("GUN_FIRE-GoodSoundForYou-820112263.mp3"));
		        mp3.play();
		    }
		    catch(Exception e){System.err.println(e);}
		}
		
		}



