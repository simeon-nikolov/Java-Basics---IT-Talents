import java.util.Locale;
import java.util.Scanner;

//������ 10: �������� ����� �� ������������ � ���������� ���� �
//������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ����
//��.

public class Task10_PrimeNumberChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long number = consoleInput.nextInt();
		double sqrt = Math.sqrt(number);
		long end = Math.round(sqrt);
		boolean isPrime = true;
		
		for (long num = 2; num <= end; num++) {
			if (number % num == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("The number is prime!");
		} else {
			System.out.println("The number is NOT prime!");
		}
		
		consoleInput.close();

	}

}
