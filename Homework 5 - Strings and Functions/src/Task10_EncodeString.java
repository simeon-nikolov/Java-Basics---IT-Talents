import java.util.Locale;
import java.util.Scanner;

//������ 10:
//�� �� ������� ��������, ����� �� ����� ��� ����� ����,
//���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
//�� ASCII ��������� � ���������� ������� 5 � � �������
//������������� ������.
//������ :
//����: Hello
//�����: Mjqqt

public class Task10_EncodeString {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter string: ");
		String word = consoleInput.next();
		char[] chars = word.toCharArray();
		word = "";
		
		for (int index = 0; index < chars.length; index++) {
			chars[index] += 5;
			word = word + chars[index];
		}
		
		System.out.println(word);
		
		consoleInput.close();
		
	}

}
