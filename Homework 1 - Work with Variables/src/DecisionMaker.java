import java.util.Locale;
import java.util.Scanner;

//Задача 7:
//Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
//пари (число с плаваща запетая), дали съм здрав – булев тип.
//Съставете програма, която взема решения на базата на тези данни по
//следния начин:
// - ако съм болен, няма да излизам
// - ако имам пари, ще си купя лекарства
// - ако нямам – ще стоя вкъщи и ще пия чай
// - ако съм здрав, ще отида на кино с приятели
// - ако имам по-малко от 10 лв, ще отида на кафе.
//Полученото решение покажете като съобщение в конзолата.

public class DecisionMaker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Please enter: ");
		System.out.print("What hour is it now: ");
		int hour = consoleInput.nextInt();
		hour = hour + 1 - 1; // To get rid of the ANNOYING WARNING!!! that the variable is not used
		System.out.print("How much money do you have: ");
		float money = consoleInput.nextFloat();
		boolean isHealthy = false;

		boolean valid = false;
		do {
			System.out.print("Are you healthy? (Yes/No): ");
			String answer = consoleInput.next();
			valid = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");;
			
			if (valid) {
				isHealthy = answer.equalsIgnoreCase("yes");
			}
			else {
				System.out.println("Please enter a valid answer!");
			}
			
		} while (!valid);
		
		if (!isHealthy) {
			System.out.println("I won't go out.");
			
			if (money > 0) {
				System.out.println("I will buy medicine.");
			}
			else {
				System.out.println("I will stay home and drink tea.");
			}
		} else {
			if (money >= 10) {
				System.out.println("I will go to cinema with friends.");
			}
			else {
				System.out.println("I will go to cafe.");
			}
		}
		
		consoleInput.close();

	}

}
