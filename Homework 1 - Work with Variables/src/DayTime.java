import java.util.Locale;
import java.util.Scanner;

//Задача 15:
//Да се състави програма, която въвежда естествено число от интервала
//[0..24].
//Програмата да изведе съответстващо съобщение съобразно въведения
//час.
//Периодите са:
//[18..4] - Добър вечер;
//[4..9] - Добро утро;
//[9..18] - Добър ден
//Пример: 10
//Изход: Добър ден

public class DayTime {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter an hour [0..24]: ");
		int hour = consoleInput.nextInt();
		
		if (hour < 0 || hour > 24) {
			System.out.println("Invalid hour!");
		} else if (hour <= 4 || hour >= 18) {
			System.out.println("Good evening!");
		} else if (hour <= 9) {
			System.out.println("Good morning!");
		} else if (hour < 18) {
			System.out.println("Good day!");
		}
		
		consoleInput.close();

	}

}
