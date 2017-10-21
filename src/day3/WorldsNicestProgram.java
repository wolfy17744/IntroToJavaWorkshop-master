package day3;

import javax.swing.JOptionPane;

public class WorldsNicestProgram {
	public static void main(String[] args) {
		
		String name;
		String fvc;
		String ssn;
		name = JOptionPane.showInputDialog("What is your name");
		
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hello " + name);
		JOptionPane.showMessageDialog(null, "you are a person" );
		
		fvc = JOptionPane.showInputDialog("What is your favorite colour");
		JOptionPane.showMessageDialog(null, "yours is " + fvc + "! Me too");
		
		JOptionPane.showMessageDialog(null, "one more question..." );
		ssn = JOptionPane.showInputDialog("what is your credit card number?");
		
		if(ssn == ssn) {
			
			JOptionPane.showMessageDialog(null, "thanks" );
			
		}else {
			JOptionPane.showMessageDialog(null, "fine" );
		}
		}
	}
	
