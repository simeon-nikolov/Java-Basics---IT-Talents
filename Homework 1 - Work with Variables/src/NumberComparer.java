import java.util.Locale;
import java.util.Scanner;

//������ 1:
//�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
//������������ A � B (���� �� �� � ������� ������� � double).
//����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
//�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

public class NumberComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Please input number A (double type): ");
		double numberA = consoleInput.nextDouble();
		System.out.println("Please input number B (double type): ");
		double numberB = consoleInput.nextDouble();
		System.out.println("Please input number C (double type): ");
		double numberC = consoleInput.nextDouble();
		
		if ((numberA < numberC) && (numberC < numberB) ||
				(numberB < numberC) && (numberC < numberA)) {
			System.out.println("The number " + numberC + " is between " + numberA + " and " + numberB);
		} else {
			System.out.println("The number " + numberC + " is NOT between " + numberA + " and " + numberB);
		}
		
		consoleInput.close();

	}

}
