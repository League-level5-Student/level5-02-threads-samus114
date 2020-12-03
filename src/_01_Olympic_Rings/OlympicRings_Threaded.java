package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	static Robot ob = new Robot(340, 100);
	static Robot rob = new Robot(140, 100);
	static Robot rib = new Robot(190, 140);
	static Robot rb = new Robot(240, 100);
	static Robot ro = new Robot(290, 140);

public static void main(String[] args) {
	ob.penDown();
	ob.hide();
	rob.penDown();
	rob.hide();
	rib.penDown();
	rib.hide();
	rb.penDown();
	rb.hide();
	ro.penDown();
	ro.hide();
	Thread r1 = new Thread(() ->{
		for (int i = 0; i < 360; i++) {
		rob.turn(1); 
	rob.move(1);
	rob.setRandomPenColor();
		}
	});
	Thread r2 = new Thread(()->{
		for (int i = 0; i < 360; i++) {

	rib.turn(1);
	rib.move(1);
	rib.setRandomPenColor();
		}
	});
	Thread r3 = new Thread(()->{
		for (int i = 0; i < 360; i++) {
	rb.turn(1);
	rb.move(1);
	rb.setRandomPenColor();
		}
	});
	Thread r4 = new Thread(()->{
		for (int i = 0; i < 360; i++) {
	ob.turn(1);
	ob.move(1);
	ob.setRandomPenColor();
		}
		});
	Thread r5 = new Thread(()->{
		for (int i = 0; i < 360; i++) {
	ro.turn(1);
	ro.move(1);
	ro.setRandomPenColor();
		}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}