import java.util.Locale;
import java.util.Scanner;

//������ 7:
//�� �� ������� ��������, ����� ���� ����� �� ���� ��������� � 
//��������.
//���� �������� �� �� �������� ���� �� ���������� ����, ����� � ���� 
//����� � ���-������� ����.
//������: asd fg hjkl
//�����: 3 ����, ���-������� � � 4 �������. 

public class Task07_WordsCounter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter words: ");
		String wordsInput = consoleInput.nextLine();
		String[] words = wordsInput.split(" ");
		int maxLenght = 0;
		
		for (int index = 0; index < words.length; index++) {
			if (words[index].length() > maxLenght) {
				maxLenght = words[index].length();
			}
		}
		
		System.out.println(words.length + " words, the longest is with " + maxLenght + " symbols.");
		
		consoleInput.close();

	}

}
