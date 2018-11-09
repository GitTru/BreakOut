import java.util.Random;
import javax.swing.JOptionPane;

public class Guess_the_number {

	public int userinput;
	static Random rand = new Random();
	static int n = rand.nextInt(256) +256;
	public int answer = n; 
	public static int num;
	public static void main(String[] args) {
		
		windowpopup();
		
		}
	
	public static void windowpopup() {
		String response = JOptionPane.showInputDialog(null, "Guess a number", "Type in a number between 0 and 256:",
		JOptionPane.QUESTION_MESSAGE);
		int userresponse = Integer.parseInt(response);
		num = userresponse;
				
		processnum();
	}
	
	public static void processnum(){
		if (num > 256 ) {
			System.out.println("Error : java.io.FileNotFoundException: File not found: /cgi-bin/cognos.cgi ");
			windowpopup();}
		else {
			if (num < n  ){
			System.out.println("Your number is too small!");
			windowpopup();
			}
			else if (num > n ) {
			System.out.println("Your number is too large!");
			windowpopup();
			}
			else if (num == n) {
			System.out.println("You guessed the correct number!");
			
				}
			}
		}
	}
		

