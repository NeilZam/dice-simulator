package simulation;

public class Dice {
	
	private Die die1;
	private Die die2;
	
	// making the dice
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}
	// getting the face value of both dice
	public int getFaceValue() {
		return die1.getFace() + die2.getFace();
		
	}
	//rolling
	public void roll() {
		die1.roll();
		die2.roll();
	}

}
