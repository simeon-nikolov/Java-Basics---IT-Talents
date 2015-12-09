import java.util.Locale;
import java.util.Scanner;

//Задача 5:
//Да се състави програма, чрез която се въвеждат 2 редици от знаци 
//(думи).
//Ако в двете редици участва един и същи знак, да се изведе на екрана 
//първата редица хоризонтално, а втората вертикално, така че да се 
//пресичат в общия си знак.
//Ако редиците нямат общ знак да се изведе само уведомително 
//съобщение.
//Пример :
//м
//а
//шапка
//и
//н
//а

public class Task05_Crossword {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String firstWord = consoleInput.next();
		String secondWord = consoleInput.next();
		int rowIndex = -1;
		int colIndex = -1;
		boolean found = false;
		
		for (int i = 0; i < firstWord.length(); i++) {
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					rowIndex = j;
					colIndex = i;
					found = true;
					break;
				}
			}
			
			if (found) {
				break;
			}
		}
		
		if (rowIndex > -1 && colIndex > -1) {
			for (int row = 0; row < secondWord.length(); row++) {
				if (row == rowIndex) {
					System.out.print(firstWord);
				}
				
				for (int col = 0; col < firstWord.length(); col++) {
					if (col == colIndex && row != rowIndex) {
						System.out.print(secondWord.charAt(row));
					}
					else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}
		} else {
			System.out.println("The 2 words don't have any same letters.");
		}
		
		consoleInput.close();

	}

}
