//������ 12: �� �� ������� ��������, ����� ������� ������ 
//���������� ���������� �����, ����� ����� ������� ����� �.�. 
//100,101, 606 � �.�. �� �� ��������. 

public class Task12_ThreeDigitNumbers {

	public static void main(String[] args) {
		for (int num = 100; num < 1000; num++) {
			int firstDigit = num / 100;
			int secondDigit = (num / 10) % 10;
			int thirdDigit = num % 10;

			if ((firstDigit != secondDigit) && (firstDigit != thirdDigit)
					&& (secondDigit != thirdDigit)) {
				System.out.println(num);
			}
		}

	}

}
