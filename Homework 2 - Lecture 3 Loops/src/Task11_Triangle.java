import java.util.Locale;
import java.util.Scanner;

//Задача 11: Въведете число N чрез конзолата и изкарайте като 
//резултат следния триъгълник с височина N:
//		  *
//       ***
//      *****
//.................
//Кaто допълнително упражнение – нарисувайте същия 
//триъгълник, но незапълнен.

public class Task11_Triangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter height: ");
		int height = consoleInput.nextInt();
		int width = 2 * height - 1;
		int mid = height;
		
		// filled triangle
		for (int row = 1; row <= height; row++) {
			
			for (int col = 1; col <= width; col++) {
				if (col <= mid) {
					if (row + col > mid) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if (col > mid) {
					if (col - row < mid) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.println("\n.................\n");
		
		// hollow triangle
		for (int row = 1; row < height; row++) {
			for (int col = 1; col <= width; col++) {
				if (col <= mid) {
					if (row + col == mid + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if (col > mid) {
					if (col - row == mid - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}
		
		for (int col = 1; col <= width; col++) {
			System.out.print("*");
		}
		
		consoleInput.close();

	}

}
