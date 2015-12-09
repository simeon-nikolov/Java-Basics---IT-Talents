import java.util.Locale;
import java.util.Scanner;

//������ 8:
//�� �� ������� ��������, ���� ����� �� ������� ��� �� ������� 
//(������, ���).
//���������� �� ������ �� ������ ���� ��������� ������ � ���������, 
//�.�. ���� ����� ������-������� � �������-������ � ���� � ���. 
//����: ����� 
//�����: ��.  
//����: �������� 
//�����: ��.

public class Task08_PalindromChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = consoleInput.next();
		int mid = word.length() / 2;
		boolean isPalindrom = true;
		
		for (int index = 0; index < mid; index++) {
			if (!(word.charAt(index) == word.charAt(word.length() - index - 1))) {
				isPalindrom = false;
				break;
			}
		}
		
		if (isPalindrom) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		consoleInput.close();
		
	}

}
