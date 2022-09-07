package chapters.chapter_5.exercises;

public class C05E06 {

	public static void main(String[] args) {

		int miles = 20;

		System.out.printf("%-9s%15s", "Miles", "Kilometers");
		System.out.print("\t|\t");
		System.out.printf("%-9s%15s\n", "Kilometers", "Miles");

		for (int j = 0, i = 1; i <= 10; i++, j += 5) {
			System.out.printf("%-9d%15.3f", i, i * 1.609);
			System.out.print("\t|\t");
			System.out.printf("%-9d%15.3f\n", miles + j, (miles + j) / 1.609);
		}
	}

}
