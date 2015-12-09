import java.util.Locale;
import java.util.Scanner;

//Задача 3:
//Да се състави програма, чрез която се въвеждат последователно две 
//редици от символи без интервали. 
//Програмата да извежда съобщение за резултата от сравнението им по 
//позиции.
//Пример: хипопотам, хипопотук
//Изход:
//Двата низа са с равна дължина.
//Разлика по позиции:
//8 а-у
//9 м-к 

public class Task03_WordComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String firstString = consoleInput.next();
		String secondString = consoleInput.next();

		if (firstString.length() == secondString.length()) {
			System.out.println("The two strings have equal length.");
		} else {
			System.out.println("The two strings have different lengths.");
		}

		int minLenght = (firstString.length() < secondString.length()) ? firstString
				.length() : secondString.length();

		for (int index = 0; index < minLenght; index++) {
			if (firstString.charAt(index) != secondString.charAt(index)) {
				System.out.println((index + 1) + " "
						+ firstString.charAt(index) + "-"
						+ secondString.charAt(index));
			}
		}

		consoleInput.close();

	}

}
