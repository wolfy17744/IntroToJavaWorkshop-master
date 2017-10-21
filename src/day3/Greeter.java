package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		
		String name;
		String fvc;
		
		name = JOptionPane.showInputDialog("What is your name");
		fvc = JOptionPane.showInputDialog("What is your favorite colour");
		
		System.out.println(name);
		System.out.println("Hello "+ name);
	}

}
