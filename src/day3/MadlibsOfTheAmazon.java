package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		
		String adjective;
		String lqd;
		String bp;
		String v;
		String place;
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		speak("If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		adjective = JOptionPane.showInputDialog("Adjective");
		// Get the user to enter a type of liquid
		lqd = JOptionPane.showInputDialog("Type of liquid");
		// Get the user to enter a body part
		bp = JOptionPane.showInputDialog("body part");
		// Get the user to enter a verb
		v = JOptionPane.showInputDialog("verb");
		// Get the user to enter a place
		place = JOptionPane.showInputDialog("place");
		// Fit the user's words into this sentence, and save it in a String:
		/* Piranhas are more [adjective] during the day, so cross the river at
		 night. Piranhas are attracted to fresh [type of liquid] and will most
		 likely take a bite out of your [body part] if you [verb]. Whatever
		 you do, if you have an open wound, try to find another way to get
		 back to the [place]. Good luck!*/
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		speak("Piranhas are more "+adjective+" during the day, so cross the river at night. Piranhas are attracted to fresh "+lqd+" and will mostlikely take a bite out of your "+bp+" if you "+v+". Whateveryou do, if you have an open wound, try to find another way to getback to the "+place+". Good luck!");

	}
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
	}
}

