import java.util.Locale;
import java.util.Scanner;

//������ 17: 
//�� �� ������� ��������, ����� ������� �������, ����� ������ �� 
//�������� ��� ����� *, � ������������ � ��������� ��� ������� 
//����. 
//������ ����� b - ������� �� �������� ����� �� ��������� 
//[3..20], c - ����� ����. 
//���������� �� �������� ����� for. 
//������: 4 + 
//�����: 
//****
//*++*
//*++*
//**** 

public class Task17_Square {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Enter b [3..20]: ");
			size = consoleInput.nextInt();
		} while (size < 3 || size > 20);
		
		System.out.print("Enter a symbol: ");
		char symbol = consoleInput.next().charAt(0);
		
		System.err.println();
		
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || col == 1 || col == size) {
					System.out.print("*");
				} else {
					System.out.print(symbol);
				}
			}
			
			System.out.println();
		}
		
		consoleInput.close();

	}

}
