import java.util.Locale;
import java.util.Scanner;

//������ 6:
//�� �� ������� ��������, ���� �����  �� ������� ��������� � ������� 
//����.
//���� �������� �� ������ �� �� ������� ����� �����, �� ����� ������� 
//���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
//������: ����� ����� ������
//�����: ����� ����� ������ 

public class Task06_PascalCase {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = consoleInput.nextLine();
		String[] words = sentence.split(" ");
		
		for (int index = 0; index < words.length; index++) {
			words[index] = (char) (words[index].charAt(0) - ('A' - 'a')) + words[index].substring(1);
			System.out.print(words[index] + " ");
		}
		
		consoleInput.close();

	}

}
