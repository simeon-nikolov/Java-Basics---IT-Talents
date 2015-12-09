import java.util.Locale;
import java.util.Scanner;

//������ 6: �� �� ������� ����� �� ������(���������) � �� ��
//������ ����� �� ������ ����� ����� 1 � ���������� �����.
//������ �����:
//7
//��������� � 28

public class Task06_NumbersSum {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = consoleInput.nextInt();
		int sum = 0;
		
		for (int num = 1; num <= number; num++) {
			sum += num;
		}
		
		System.out.println("The result is " + sum);
		
		consoleInput.close();

	}

}
