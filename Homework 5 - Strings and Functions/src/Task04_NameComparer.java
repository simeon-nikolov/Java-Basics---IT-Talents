import java.util.Locale;
import java.util.Scanner;

//Задача 4:
//Да се състави програма, чрез която по въведени трите имена на двама 
//човека разделени със запетая, се извежда чие име има по-голям сбор 
//от ASCII кодовете на съставящите името букви.
//Пример: Anna Dosewa Asenowa, Iwo Peew Peew 
//Изход: Anna Dosewa Asenowa 

public class Task04_NameComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter the two names: ");
		String input = consoleInput.nextLine();
		String[] names = input.split(",");
		int[] sums = new int[names.length];
		int maxSum = 0;
		int maxIndex = 0;
		
		for (int currentName = 0; currentName < names.length; currentName++) {
			names[currentName] = names[currentName].trim();
			
			for (int index = 0; index < names[currentName].length(); index++) {
				if (names[currentName].charAt(index) != ' ') {
					sums[currentName] += names[currentName].charAt(index);
				}
			}
			
			if (maxSum < sums[currentName]) {
				maxSum = sums[currentName];
				maxIndex = currentName;
			}
		}
		
		System.out.println(names[maxIndex]);
		
		consoleInput.close();

	}

}
