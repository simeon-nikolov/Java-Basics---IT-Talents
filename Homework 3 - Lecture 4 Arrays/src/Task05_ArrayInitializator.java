//������ 5:
//�������� ��������, ����� ������� ����� � 10 �������� � 
//������������ ����� �� ���������� ��� �������� ����� �� ������� �� 
//�������� ������� �� 3.
//�� �� ������� ���������� �� ������.

public class Task05_ArrayInitializator {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = index * 3;
			System.out.print(numbers[index] + " ");
		}

	}

}
