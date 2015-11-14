/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CollectNewspaper extends Karel {
	
	// TODO: write the code to implement this program
	public void run() {
		moveToTheNewspaper();
		pickBeeper();
		moveBack();
	}
		public void moveToTheNewspaper() {
			turnRight();
			move();
			turnLeft();
			move();
			move();
			move();
		}
		
		public void moveBack() {
			turnAround();
			move();
			move();
			move();
			turnRight();
			move();
			turnRight();
		}
		
		public void turnRight() {
			for(int i=0; i<3; i++)
				turnLeft();
		}
		
		public void turnAround() {
			turnLeft();
			turnLeft();
		}
}
