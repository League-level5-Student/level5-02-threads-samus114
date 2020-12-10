package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	 // Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	static boolean raceWon = false;
	Thread[] threads;
	static String winner = "";
	static Random rand = new Random();
	static int randNum = rand.nextInt(300);
	public static void main(String[] args) {
		Thread r1 = new Thread(() -> {
			while (raceWon == false) {
				randNum = rand.nextInt(300);
				rob.move(randNum);
				if(rob.getY() <= 100) {
					raceWon = true;
					winner = "rob";
				}
			}
		});
		r1.start();
	}
void setUpRace() {
	threads = new Thread[5];
	for(int i = 0; i < threads.length; i++) {
		threads[i] = new Thread(new AdvancedRobot(i));
	}
		
}
public class AdvancedRobot implements Runnable {
	Robot robot;
	int botPos;
	AdvancedRobot(int pos) {
		robot = new Robot();
		botPos = pos;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (raceWon == false) {
			randNum = rand.nextInt(300);
			robot.move(randNum);
			if(robot.getY() <= 100) {
				raceWon = true;
				System.out.println(botPos + "won the race!");
			}
		}
	}
}
}
