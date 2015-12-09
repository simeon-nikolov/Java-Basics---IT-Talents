import java.util.Locale;
import java.util.Scanner;

//������ 21:
//������ � �������� ����� �����. 
//��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����, 
//���, ���.
//��������� �� ���� �� ������� �: ������, ����, ����, ����.
//�� �� ������� ��������, ���� ����� �� ������� N - ����� �� 
//��������� [1..51] (<- ������, ������ �� � 52 - ��� 52 ����� � ���� �����!) � �� �������� ��������� ����� ����� � 
//���������� ��-������ ����� �� �������. 
//������: 47. 
//�����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ��� 
//���� 

public class Task21_CardPicker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int card = 0;

		do {
			System.out.print("Enter a card number [1..52]: ");
			card = consoleInput.nextInt();
		} while (card < 1 || card > 52);

		for (int rank = 2; rank <= 14; rank++) {
			for (int suit = 1; suit <= 4; suit++) {
				if (suit + ((rank - 2) * 4) >= card) {
					switch (rank) {
					case 11:
						System.out.print("Jack of ");
						break;
					case 12:
						System.out.print("Queen of ");
						break;
					case 13:
						System.out.print("King of ");
						break;
					case 14:
						System.out.print("Ace of ");
						break;
					default:
						System.out.print(rank + " of ");
						break;
					}

					switch (suit) {
					case 1:
						System.out.print("Clubs");
						break;
					case 2:
						System.out.print("Diamonds");
						break;
					case 3:
						System.out.print("Hearts");
						break;
					case 4:
						System.out.print("Spades");
						break;
					}
					
					if (suit + ((rank - 2) * 4) < 52) {
						System.out.print(", ");
					}
				}
			}
		}

		consoleInput.close();

	}

}
