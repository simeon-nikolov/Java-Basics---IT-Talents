import java.util.Locale;
import java.util.Scanner;

//Задача 10:
//Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
//3 литра и ги ползвате едновременно.
//Да се състави програма, която по даден обем извежда как ще прелеете
//течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
//кофите. Кофите не могат да се ползват с частично количество вода.
//Входни данни: естествено число от интервала [10..9999].
//Пример: 107
//Изход: 21 пъти по 2 литра,
// 21 пъти по 3 литра
// допълнително кофа от 2 литра

public class CisternFiller {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter cistern volume: ");
		int volume = consoleInput.nextInt();
		int fillTimes = volume / 5;
		int remainder = volume % 5;

		if (remainder == 0) {
			System.out.println(fillTimes + " times of 2 liters.");
			System.out.println(fillTimes + " times of 3 liters.");
		} else {
			if (remainder == 1) {
				System.out.println((fillTimes - 1) + " times of 2 liters.");
				System.out.println((fillTimes - 1) + " times of 3 liters.");
				System.out.println("additionally 2 buckets of 3 liters.");
			} else {
				if (remainder == 2) {
					System.out.println(fillTimes + " times of 2 liters.");
					System.out.println(fillTimes + " times of 3 liters.");
					System.out.println("additionally bucket of 2 liters.");
				} else {
					if (remainder == 3) {
						System.out.println(fillTimes + " times of 2 liters.");
						System.out.println(fillTimes + " times of 3 liters.");
						System.out.println("additionally bucket of 3 liters.");
					} else {
						if (remainder == 4) {
							System.out.println(fillTimes
									+ " times of 2 liters.");
							System.out.println(fillTimes
									+ " times of 3 liters.");
							System.out
									.println("additionally 2 buckets of 2 liters.");
						}
					}
				}
			}
		}

		consoleInput.close();
	}

}
