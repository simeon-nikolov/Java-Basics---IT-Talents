import java.util.Locale;
import java.util.Scanner;

//������ 15: �� �� ������� ��������, ����� �� ������� ������ �� 
//������  ����� �� 1 �� �������� ����� N. 
//������: 5
//�����: 15 
//����������� ����� do-while. 

public class Task15_SumToN {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter N: ");
		int number = consoleInput.nextInt();
		int sum = 0;
		int count = 1;
		
		do {
			sum += count;
			count++;
		} while (count <= number);
		
		System.out.println(sum);
		
		consoleInput.close();

	}

}
