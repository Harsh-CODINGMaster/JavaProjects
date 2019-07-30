
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MainMUSIC {

	
		// TODO Auto-generated method stub
public static void playMAIN(int a) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
	try {
 
		File f = new File("30. E. Honda Stage.mp3");
	AudioInputStream ai = AudioSystem.getAudioInputStream(f);
	Clip clip = AudioSystem.getClip();
	
	if(a==1) {clip.start();}
	else if(a==2) {
		System.out.println("i am in stop");
		clip.stop();}
	
	}

catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	}



