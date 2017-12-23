
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(10);
		rob.penDown();
for (int a = 0; a < 5; a++) {
	

		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you like the robot to draw?");
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}else if(color.equals("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equals("yellow")) {
			rob.setPenColor(Color.yellow);
		}else if(color.equals("green")) {
			rob.setPenColor(Color.green);
		}else {
			rob.setRandomPenColor();
		}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		rob.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		for(int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
}

	}
}
