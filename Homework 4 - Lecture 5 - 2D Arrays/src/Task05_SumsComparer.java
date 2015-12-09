
//������ 5:
//�� �� ������� ��������, ��� ����� ������������� �� ��������
//���������� ����� � �������� ����� 4*4 ��������.
//���������� �� ������� �������� �� ���������� ����� � �������������
//�� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
//������:
//1,2,3,4
//5,6,7,8
//9,10,11,12
//13,14,15,16
//�����:
//���-������ ���� �� ������ 58
//���-������ ���� �� ������ 40
//������������ ���� �� ������ � > �� ������������ ���� �� ������

public class Task05_SumsComparer {

	public static void main(String[] args) {
		int size = 4;
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		
		int rowMaxSum = 0;
		int colMaxSum = 0;
		
		for (int row = 0; row < size; row++) {
			int rowSum = 0;
			int colSum = 0;
			
			for (int col = 0; col < size; col++) {
				rowSum += matrix[row][col];
				colSum += matrix[col][row];
			}
			
			if (rowSum > rowMaxSum) {
				rowMaxSum = rowSum;
			}
			
			if (colSum > colMaxSum) {
				colMaxSum = colSum;
			}
			
			rowSum = 0;
			colSum = 0;
		}
		
		System.out.println("Max sum by rows: " + rowMaxSum);
		System.out.println("Max sum by columns: " + colMaxSum);
		
		if (rowMaxSum > colMaxSum) {
			System.out.println("Max sum by rows is > than max sum by columns");
		} else {
			if (rowMaxSum < colMaxSum) {
				System.out.println("Max sum by rows is < than max sum by columns");
			} else {
				System.out.println("Both sums are equal");
				
			}
		}

	}

}
