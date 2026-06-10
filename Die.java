package assingment2;
import java.util.Random;

public class Die {
	private int faceValue;
	// setting face value to 1
	public Die() {
		faceValue = 1;
	}
	// making the getter and the setter
	public int getFace() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	//rolling
	public void roll() {
		Random roll = new Random();
		faceValue = roll.nextInt(6)+1;
	}
}
