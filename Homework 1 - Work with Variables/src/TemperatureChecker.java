import java.util.Locale;
import java.util.Scanner;


//������ 13:
//�� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
//���������� ����������� t � ������ ������.
//�������������� ��������� ��:
//��� -20 ������ �������;
//����� 0 � -20 - �������;
//����� 15 � 0 - ������;
//����� 25 � 15 - �����;
//��� 25 � ������.
//������ �����: ���� ����� �� ��������� [-100..100].
//������: 12
//�����: ������

public class TemperatureChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius from the interval [-100..100]: ");
		int temperature = consoleInput.nextInt();
		
		if (temperature < -20) {
			System.out.println("Freezing cold!!!");
		} else if (temperature < 0) {
			System.out.println("Cold!");
		} else if (temperature < 15) {
			System.out.println("Cool");
		} else if (temperature <= 25) {
			System.out.println("Warm");
		} else if (temperature > 25) {
			System.out.println("Hot!");
		}
		
		consoleInput.close();

	}

}
