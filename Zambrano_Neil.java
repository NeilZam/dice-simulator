package assingment2;
/* Neil Zambrano
 * 5655530/ne843347
 * Assingment 2
 * March 3
 * Main function creates a random die that will roll for 1000 times.
 * After the roll are added to an array then it will print the amount
 * of times each face value of the dice. It will put a star depending on
 * the amount of times it was rolled.
 */
public class Zambrano_Neil {
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		
		int[] amount_occured = new int[13];
		
		
		// roll dice
		for(int i = 0; i<1000;i++) {
			dice.roll();
			int add = dice.getFaceValue();
			amount_occured[add]++;
		}
		for(int i = 2; i<=12;i++) {
			System.out.println("Number of "+i+ "s are " +amount_occured[i]);
		}
		// setting the max times it can happen
		int max = 175;
		// making the array of stars that the graph will have
		int[] levels = new int[13];
        
		for (int i = 2; i <= 12; i++) {
            levels[i] = amount_occured[i] / 25; // divided by 25 because thats when it gets a star
        }
        // printing the graph
        for (int level = max / 25; level >= 1; level--) {
            for (int add = 2; add <= 12; add++) {
                // Print a star 
                if (levels[add] >= level) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   "); // Otherwise, print spaces
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        for (int i = 2; i <= 12; i++) {
            if (i < 10) {
                System.out.print(" " + i + " "); // Add space for 1 digit numbers
            } else {
                System.out.print(i + " "); // add single space for double digit
            }
        }
        System.out.println();
				}
			
				
	}
