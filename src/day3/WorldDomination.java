package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String yeenee;
		yeenee = JOptionPane.showInputDialog("can you write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(yeenee.equalsIgnoreCase("yes") || yeenee.equalsIgnoreCase("yee") ||yeenee.equalsIgnoreCase("y") ) {
			speak("yay");
		// 3. Otherwise, wish them good luck washing dishes.
		}else {
			speak("WHAT HAVE YOU DONE");
		}
	}
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
	}
}

