//������ 1:
//����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
//�������� �������������.
//�� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
//� ���-������� � ���-�������� ��������.
//������:
//48,72,13,14,15
//21,22,53,24,75
//31,57,33,34,35
//41,95,43,44,45
//59,52,53,54,55
//61,69,63,64,65
//�����:
//���-����� 13;
//���-������ 95

public class Task01_MinAndMax {

	public static void main(String[] args) {
		int[][] array = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65},
		};
		
		int min = array[0][0];
		int max = array[0][0];
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (min > array[row][col]) {
					min = array[row][col];
				}
				
				if (max < array[row][col]) {
					max = array[row][col];
				}
			}
		}
		
		System.out.println("Min: " + min + "\nMax: " + max);

	}

}
