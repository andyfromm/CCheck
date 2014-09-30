package creditcards;
import java.util.Scanner;

public class CheckDigit {
	
	public static void Credit (){
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Input your credit card number: ");
		int number = input.nextInt();
		
		/*Still not sure how to manipulate arraylists
		what i would do is see how long the number entered was, ie. see the array.length
		if it was even then i would take all the indexes from 0 to the end mod 2 = 0 and multiply those by 2 to follow the algorithm in the word doc
		while mod 10 those values when doubled, then add them up
		then add up the indexes mod 2 = 1 and that would be the odd integers, again opposite if array length was odd
		now i would take those two values, add them up and keep following along the word doc. if divisible by 10 then valid ie. 'true'
		
		

		*/
	


}
}