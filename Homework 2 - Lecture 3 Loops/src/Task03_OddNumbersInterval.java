// ������ 3: �� �� ������� �� ������ ������ ������� ����� �� -10
// �� 10

public class Task03_OddNumbersInterval {

	public static void main(String[] args) {
		for (int num = -10; num <= 10; num++) {
			if ((num & 1) == 1) {
				System.out.println(num);
			}
		}

	}

}
