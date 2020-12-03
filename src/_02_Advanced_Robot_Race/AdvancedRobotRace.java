package _02_Advanced_Robot_Race;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static Robot ob = new Robot(340, 100);
	static Robot rob = new Robot(140, 100);
	static Robot rib = new Robot(190, 140);
	static Robot rb = new Robot(240, 100);
	static Robot ro = new Robot(290, 140);
	public static void main(String[] args) {
		Thread r1 = new Thread(() ->{
			for (int i = 0; i < 360; i++) {
			rob.turn(1); 
		rob.move(1);
		rob.setRandomPenColor();
			}
		});
		Thread r2 = new Thread(()->{
			for (int i = 0; i < 360; i++) {

		rib.move(1);
			}
		});
		Thread r3 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
		rb.move(1);
		}
		});
		Thread r4 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
		ob.move(1);
			}
			});
		Thread r5 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
		ro.move(1);
			}
			});
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
	}
}
