import java.util.Locale;
import java.util.Scanner;

//Задача 2:
//Да се състави програма, чрез която от клавиатурата се въвеждат 
//последователно две думи с дължина 10-20 знака.
//Програмата да размени първите им 5 знака и да изведе дължината на 
//по-дългата, както и новото им съдържание.
//Пример: uchilishe uchenik
//Изход: 9 uchenishe 

public class Task02_WordReplacer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		String firstWord = "";
		String secondWord = "";
		
		do {
			System.out.print("Enter first word (10-20): ");
			firstWord = consoleInput.next();
		} while (firstWord.length() > 20);
		
		do {
			System.out.print("Enter second word (10-20): ");
			secondWord = consoleInput.next();
		} while (secondWord.length() > 20);
		
		String firstFiveChars = secondWord.substring(0, 5);
		secondWord = firstWord.substring(0, 5) + secondWord.substring(5, secondWord.length());
		firstWord = firstFiveChars + firstWord.substring(5, firstWord.length());
		
		System.out.println("Result: ");
		
		if (firstWord.length() > secondWord.length()) {
			System.out.print(firstWord.length());
		}
		else {
			System.out.print(secondWord.length());
		}
		
		System.out.println(" " + firstWord + " " + secondWord);
		
		consoleInput.close();
		
	}

}
