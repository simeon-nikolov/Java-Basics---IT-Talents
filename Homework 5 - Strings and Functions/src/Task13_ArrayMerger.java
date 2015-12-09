import java.util.Arrays;

//������ 13:
//�� �� ������� �����, ����� ������ ��� ������ �� ����� � �����
//�����, �������� ������ �������� �� ���������� ������, ���� �
//������� ���� �� ������ �� ���������� �� ������ ������� �����,
//� ��� ������� ���� � ���� �� ������ ������� �����.

public class Task13_ArrayMerger {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] secondArray = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		int[] both = mergeArrays(firstArray, secondArray);
		System.out.println(Arrays.toString(both));

	}

	private static int[] mergeArrays(int[] firstArray, int[] secondArray) {
		int lenght = firstArray.length + secondArray.length;
		int[] newArray = new int[lenght];
		
		for (int index = 0; index < firstArray.length; index++) {
			newArray[index] = firstArray[index];
		}
		
		for (int index = 0; index < secondArray.length; index++) {
			newArray[index + firstArray.length] = secondArray[index];
		}
		
		return newArray;
	}

}
