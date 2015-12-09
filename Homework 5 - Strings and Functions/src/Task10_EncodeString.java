import java.util.Locale;
import java.util.Scanner;

//Задача 10:
//Да се състави програма, която по даден низ връща друг,
//символите, на който са получени като към всеки код на символ
//от ASCII таблицата е добавеното числото 5 и е записан
//новополучения символ.
//Пример :
//Вход: Hello
//Изход: Mjqqt

public class Task10_EncodeString {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter string: ");
		String word = consoleInput.next();
		char[] chars = word.toCharArray();
		word = "";
		
		for (int index = 0; index < chars.length; index++) {
			chars[index] += 5;
			word = word + chars[index];
		}
		
		System.out.println(word);
		
		consoleInput.close();
		
	}

}
