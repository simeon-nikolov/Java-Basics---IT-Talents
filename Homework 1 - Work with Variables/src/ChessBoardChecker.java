import java.util.Locale;
import java.util.Scanner;

//������ 14:
//�� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
//�� ���������� ����� ������� ������� ���� �� �������� � ������� ���
//�������� ����.
//���������� ����� � ���������.
//�������� �� ��� ������ ����� �� ��������� [1..8].
//������: 2 2 3 2
//�����: ��������� �� � �������� ����

public class ChessBoardChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Please eneter squares coordinates: ");
		int firstXCoord = consoleInput.nextInt();
		int firstYCoord = consoleInput.nextInt();
		int secondXCoord = consoleInput.nextInt();
		int secondYCoord = consoleInput.nextInt();
		int difference1 = firstXCoord - firstYCoord;
		int difference2 = secondXCoord- secondYCoord;
		boolean sameColor = ((difference1 % 2 == 0) == (difference2 % 2 == 0));
		
		if (sameColor) {
			System.out.println("The squares are in same color!");
		} else {
			System.out.println("The squares are in different colors");
		}
		
		consoleInput.close();

	}

}
