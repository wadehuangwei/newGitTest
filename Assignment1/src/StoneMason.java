/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class StoneMason extends SuperKarel {
	public void run() {
		fixColumn();
		while(frontIsClear()) {
		moveToTheNextColumn();
		fixColumn();
		}
	}
	
	public void fixColumn() {
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()) putBeeper();
			move();
		}
		if(noBeepersPresent()) putBeeper();
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	public void moveToTheNextColumn() {
		for(int i=0; i<4; i++) {
			move();
		}
	}
}
