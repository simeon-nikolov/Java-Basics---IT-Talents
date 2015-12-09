import java.util.Locale;
import java.util.Scanner;

//������ 3:
//�������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
//������������ ������ ���������

public class NumberSwapper {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Please input first integer number: ");
		int firstNumber = consoleInput.nextInt();
		System.out.println("Please input second integer number: ");
		int secondNumber = consoleInput.nextInt();
		
		int oldValue = firstNumber;
		firstNumber = secondNumber;
		secondNumber = oldValue;

		System.out.println("Swapped number values:\nFirst Number = "
				+ firstNumber + "\nSecond Number = " + secondNumber);

		consoleInput.close();
	}

}
