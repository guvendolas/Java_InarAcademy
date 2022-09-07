package chapters.chapter_5.exercises;

public class C05E05 {

	public static void main(String[] args) {

		
		int pound = 20;

		System.out.printf("%-9s%15s", "Kilograms", "Pounds");
		System.out.print("\t|\t");
		System.out.printf("%-9s%15s\n", "Pounds", "Kilograms");

		for (int j = 0, i = 1; i <= 199; i += 2, j += 5) {
			System.out.printf("%-9d%15.1f", i, i * 2.2);
			System.out.print("\t|\t");
			System.out.printf("%-9d%15.1f\n", pound + j, (pound + j) / 2.2);

		}

	}

}
