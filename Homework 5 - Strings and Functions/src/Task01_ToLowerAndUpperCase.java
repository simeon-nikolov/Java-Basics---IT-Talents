//������ 1:
//�� �� ������� ��������, ���� ����� �� �������� ��� ���� ��������� 
//�� 40 ������ � ����� �����.
//���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
//� ����� �����.
//������: Abcd Efgh
//�����: ABCD abcd EFGH efgh

import java.util.Locale;
import java.util.Scanner;

public class Task01_ToLowerAndUpperCase {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String firstString = consoleInput.next();
		String secondString = consoleInput.next();
		
		if (firstString.length() >= 40) {
			firstString = firstString.substring(0, 40);
		}
		
		if (secondString.length() >= 40) {
			secondString = secondString.substring(0, 40);
		}
		
		System.out.print(firstString.toUpperCase() + " " + firstString.toLowerCase() + " ");
		System.out.print(secondString.toUpperCase() + " " + secondString.toLowerCase());
		
		consoleInput.close();
		
	}
}
