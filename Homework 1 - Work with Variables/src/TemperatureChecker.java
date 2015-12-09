import java.util.Locale;
import java.util.Scanner;


//Задача 13:
//Да се състави програма, която да отгатне колко е студено/топло по
//въведената температура t в градус Целзий.
//Температурните интервали са:
//под -20 ледено студено;
//между 0 и -20 - студено;
//между 15 и 0 - хладно;
//между 25 и 15 - топло;
//над 25 – горещо.
//Входни данни: цяло число от интервала [-100..100].
//Пример: 12
//Изход: хладно

public class TemperatureChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius from the interval [-100..100]: ");
		int temperature = consoleInput.nextInt();
		
		if (temperature < -20) {
			System.out.println("Freezing cold!!!");
		} else if (temperature < 0) {
			System.out.println("Cold!");
		} else if (temperature < 15) {
			System.out.println("Cool");
		} else if (temperature <= 25) {
			System.out.println("Warm");
		} else if (temperature > 25) {
			System.out.println("Hot!");
		}
		
		consoleInput.close();

	}

}
