import java.util.Locale;
import java.util.Scanner;

//������ 9: �� �� �������� 2 ����� �� ������������ � � �.
//�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
//�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
//������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
//������������) ����� ��-������ �� 200, �� �� �������� �����������.
//
//������:
//	������ �:
//	1
//	�������� B
//	107

public class Task09_OutputIntervalByConditions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter A: ");
		int start = consoleInput.nextInt();
		System.out.println("Enter B: ");
		int end = consoleInput.nextInt();
		
		if (start > end) {
			int swapValue = start;
			start = end;
			end = swapValue;
		}
		
		int sum = 0;
		
		for (int number = start; number <= end; number++) {
			int power = number * number;
			
			if (power % 3 == 0) {
				System.out.print("skip 3,");
			} else {
				sum += power;
				
				if (sum > 200) {
					break;
				}
				
				System.out.print(power + ",");
			}
		}
		
		consoleInput.close();

	}

}
