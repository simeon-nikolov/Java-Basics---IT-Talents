import java.util.Locale;
import java.util.Scanner;

//������ 6:
//�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
//�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
//�3 �� ��� ������� �������� �� �1.

public class ThreeNummbersSwapper {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Please enter 3 numbers (a1, a2 and a3): ");
		int firstNumber = consoleInput.nextInt();
		int secondNumber = consoleInput.nextInt();
		int thirdNumber = consoleInput.nextInt();

		int oldValue = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		thirdNumber = oldValue;

		System.out.println("Swapped values: a1=" + firstNumber + "; a2=" + secondNumber + "; a3=" + thirdNumber + ";");

		consoleInput.close();
	}

}
