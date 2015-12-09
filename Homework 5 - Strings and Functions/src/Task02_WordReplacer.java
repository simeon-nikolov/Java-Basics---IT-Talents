import java.util.Locale;
import java.util.Scanner;

//������ 2:
//�� �� ������� ��������, ���� ����� �� ������������ �� �������� 
//�������������� ��� ���� � ������� 10-20 �����.
//���������� �� ������� ������� �� 5 ����� � �� ������ ��������� �� 
//��-�������, ����� � ������ �� ����������.
//������: uchilishe uchenik
//�����: 9 uchenishe 

public class Task02_WordReplacer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		String firstWord = "";
		String secondWord = "";
		
		do {
			System.out.print("Enter first word (10-20): ");
			firstWord = consoleInput.next();
		} while (firstWord.length() > 20);
		
		do {
			System.out.print("Enter second word (10-20): ");
			secondWord = consoleInput.next();
		} while (secondWord.length() > 20);
		
		String firstFiveChars = secondWord.substring(0, 5);
		secondWord = firstWord.substring(0, 5) + secondWord.substring(5, secondWord.length());
		firstWord = firstFiveChars + firstWord.substring(5, firstWord.length());
		
		System.out.println("Result: ");
		
		if (firstWord.length() > secondWord.length()) {
			System.out.print(firstWord.length());
		}
		else {
			System.out.print(secondWord.length());
		}
		
		System.out.println(" " + firstWord + " " + secondWord);
		
		consoleInput.close();
		
	}

}
