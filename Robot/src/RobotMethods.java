import org.jointheleague.graphical.robot.Robot;

public class RobotMethods {

	public static void main(String[] args) {
		Robot brandon = new Robot();
		//Robot Dylan = new Robot(500,400);
		//drawsquare(brandon, 100, 120);
		//drawtriangle(brandon, 100, 120);
		drawShape(brandon, 100, 7 );
	}

	//static void drawsquare(Robot R, int length, int width) {
	//R.setSpeed(10);
	//	R.setSpeed(10);
	//	R.penDown();
	//	for (int i = 0; i <= 4; i++) {
	//		R.move(length);
	//		R.turn(width);
	//	}//t.setSpeed(10);
		//t.setSpeed(10);
		//t.penDown();
		//for (int i = 0; i <= 4; i++) {
		//	t.move(200);
		//	t.turn(90);
		//}
	//static void drawtriangle(Robot C, int length, int width) {
		//C.setSpeed(10);
		//for (int i = 0; i<= 3; i++) {
		//	C.penDown ();
		//	C.move(length);
		//	C.turn(width);
		//	
	//	}
	static void drawShape(Robot X, int length, int side ){
		X.setSpeed(10);
		for (int i = 0; i<side; i++ ){
			X.penDown();
			X.move(length);
			X.turn(360/(side));
	}
		X.hide();
}
}
//}

//}
