import java.util.Locale;
import java.util.Scanner;

//������ 13: �� �� ������� ��������, ����� ������� ������ 
//���������� ���������� �����, ����� ���� ���� �� ������� �����
//�� ������ �����.
//������ : sum, ������ 2>=sum<=27.
//������: 26
//�����: 899, 989, 998.

public class Task13_ThreeDigitSumNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Sum: ");
		int sum = consoleInput.nextInt();
		
		for (int num = 100; num < 1000; num++) {
			int firstDigit = num / 100;
			int secondDigit = (num / 10) % 10;
			int thirdDigit = num % 10;
			
			if (firstDigit + secondDigit + thirdDigit == sum) {
				System.out.println(num);
			}
		}
		
		consoleInput.close();

	}

}
