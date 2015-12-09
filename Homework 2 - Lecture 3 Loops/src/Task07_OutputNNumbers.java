import java.util.Locale;
import java.util.Scanner;

//������ 7: ���������� �� 3, �� �� ������� �� ������ ������� n
//����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
//�������� n:
//5
//3,6,9,12,15

public class Task07_OutputNNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter n: ");
		int numbersCount = consoleInput.nextInt();
		int number = 3;
		
		while (numbersCount > 0) {
			if (number % 3 == 0) {
				System.out.print(number);
				numbersCount--;
				
				if (numbersCount != 0) {
					System.out.print(",");
				}
			}
			
			number++;			
		}
		
		consoleInput.close();

	}

}
