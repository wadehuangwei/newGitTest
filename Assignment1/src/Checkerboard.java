/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class Checkerboard extends SuperKarel {
	public void run() {
		putBeeper();
		checkColumn();
		while(frontIsClear()) {
			beepersEast();
			beepersWest();
		}
	}
	
	private void beepersEast() {
		while(facingEast()) {
			move();
			if(frontIsClear()) {
				move();
				putBeeper();
			}
			upEast();
		}
	}
	
	private void upEast() {
		if(frontIsBlocked()) {
			turnLeft();
			if(beepersPresent()) {
				if(frontIsClear()) {
					move();
					turnLeft();
					move();
					putBeeper();
				}
			} else {
				if(frontIsClear()) {
					move();
					turnLeft();
					putBeeper();
				}
			}
		}
	}
	
	private void beepersWest() {
		while(facingWest()) {
			move();
			if(frontIsClear()) {
				move();
				putBeeper();
			}
			upWest();
		}
	}
	
	private void upWest() {
		if(frontIsBlocked()) {
			turnRight();
			if(beepersPresent()) {
				if(frontIsClear()) {
					move();
					turnRight();
					move();
					putBeeper();
				}
			} else {
				if(frontIsClear()) {
					move();
					turnRight();
					putBeeper();
				}
			}
		}
	}
	
	private void checkColumn() {
		if(frontIsBlocked()) {
			turnLeft();
			while(frontIsClear()) {
				move();
				if(frontIsClear()) {
					move();
					putBeeper();
				}
			}
		}
	}
}