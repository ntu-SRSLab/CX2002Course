import java.util.Scanner;

public class CircleApp
{
	public static void main(String[] args) {
		Circle cir = null;
		int option;
		double radius = 0.0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("==== Circle Computation =====");
			System.out.println("|1. Create a new circle     |");
			System.out.println("|2. Print Area              |");
			System.out.println("|3. Print circumference     |");
			System.out.println("|4. Quit                    |");
			System.out.println("=============================");
			System.out.println("Choose option (1-3):");
			option = sc.nextInt();
			if (option == 1) {
        System.out.println("Enter the radius to compute the area and circumference");
        radius = sc.nextDouble();	
        cir = new Circle(radius);
        System.out.println("A new circle is created");
      }
			else if (option == 2) {
        cir.printArea();
      }
			else if (option == 3) {
        cir.printCircumference();
      }
		} while (option < 4);
		System.out.println("Thank you!!");	
	}
}
