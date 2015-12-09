import java.util.Locale;
import java.util.Scanner;

//������ 4:
//�������� 2 �������� ����� �� ��������� � �� ������������ �
//��������� ���.

public class AscendingOutput {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Please input first integer number: ");
		int firstNumber = consoleInput.nextInt();
		System.out.println("Please input second integer number: ");
		int secondNumber = consoleInput.nextInt();

		if (firstNumber < secondNumber) {
			System.out.println(firstNumber + " " + secondNumber);
		} else {
			System.out.println(secondNumber + " " + firstNumber);
		}
		
		consoleInput.close();

	}

}
