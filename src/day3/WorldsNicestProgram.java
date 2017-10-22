package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class WorldsNicestProgram {
	public static void main(String[] args) {
		
		String name;
		String fvc;
		String ssn;
		name = JOptionPane.showInputDialog("What is your name");
		
		System.out.println(name);
		speak("Hello " + name);
		speak( "you are a person" );
		
		fvc = JOptionPane.showInputDialog("What is your favorite colour");
		speak( "yours is " + fvc + "! Me too");
		
		speak( "one more question..." );
		ssn = JOptionPane.showInputDialog("what is your credit card number?");
		
		if(ssn.equals(ssn)) {
			
			speak( "thanks" );
			
		}else {
			JOptionPane.showMessageDialog(null, "fine" );
		}
		}
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
	}
	}
	
