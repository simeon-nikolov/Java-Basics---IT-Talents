import java.util.Locale;
import java.util.Scanner;


//������ 9:
//�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
//���������� ����� a,b.
//���������� �� ������ � ��������� ���� ���������� ����� ��
//�������������� �� ����� ����� � �����, ����� � ������ �����.
//������ �����: a,b - ���������� ����� �� ��������� [10..99].
//������: 15, 25
//�����: 375, 5 �������

public class ParityChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		
		System.out.print("Enter a 2 digit number a: ");
		int firstNumber = consoleInput.nextInt();
		System.out.print("Enter a 2 digit number b: ");
		int secondNumber = consoleInput.nextInt();
		int product = firstNumber * secondNumber;
		int lastDigit = product % 10;
		System.out.print(product + ", " + lastDigit);
		
		if ((lastDigit % 2) == 0) {
			System.out.println(" even");
		} else {
			System.out.println(" odd");
		}
		
		consoleInput.close();

	}

}
