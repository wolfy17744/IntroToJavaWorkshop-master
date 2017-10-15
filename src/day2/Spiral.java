package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 5. Set your robot's pen to the down position
		r2d2.penDown();
		// 3. Set the robot to go at max speed (10)
		r2d2.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		for (int i = 0; i < 750; i++) {
			
		
			// 7. Change the pen color to random
			r2d2.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			r2d2.move((int) (0.05*i));
			// 2. Turn the robot 1/7 of 360 degrees to the right
			r2d2.turn((int) (360/70));
			// 8. Set the pen width to i
			r2d2.setPenWidth(i);
		}
	}
}
