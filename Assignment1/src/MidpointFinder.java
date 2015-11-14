/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class MidpointFinder extends SuperKarel {
	public void run() {
		initRow();
		while(beepersPresent()) {
			moveToTheLastBeeper();
			pickBeeper();
			move();
		}
		turnAround();
		move();
		putBeeper();
	}

	private void initRow() {
		move();
		while(frontIsClear()) {
			putBeeper();
			move();
		}
		turnAround();
		move();
	}
	
	private void moveToTheLastBeeper() {
		while(beepersPresent()) {
			move();
		}
		turnAround();
		move();
	}
}
