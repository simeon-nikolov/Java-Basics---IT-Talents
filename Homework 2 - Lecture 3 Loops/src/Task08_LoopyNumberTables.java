import java.util.Locale;
import java.util.Scanner;

//������ 8: �� �������� ����� n, �� �� ������ �� ������ ������� ��
//������� �����:
//	
//	������:
//		�������� n:
//		1
//		0
//
//		�������� n:
//		2
//		11
//		33
//
//		�������� n:
//		3
//		222
//		444
//		666
//		
//		�������� n:
//		4
//		3333
//		5555
//		7777
//		9999
		
public class Task08_LoopyNumberTables {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter n: ");
		int size = consoleInput.nextInt();
		int outputNumber = size - 1;
		
		for (int row = 1; row <= size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print(outputNumber);
			}
			
			System.out.println();
			outputNumber += 2;
		}
		
		consoleInput.close();

	}

}
