package chapters.chapter_5.exercises;

public class C0E39 {

	public static void main(String[] args) {
		double commision = 0;
		double sales = 30_000;
		
		System.out.printf("\nWhat is 8%% of $5000?  $%1.2f", 5000 * 0.08);
		System.out.printf("\nWhat is 10%% of $5000?  $%1.2f", 5000 * 0.10);
		
		while (commision < 30_000) {
			commision = 0;
			commision += 5000 * 0.08;
			commision += 5000 * 0.10;
			commision += (sales - 10_000) * 0.12;
			sales += 0.01;
		}
		
		System.out.printf("\n\nYou'll need to make $%1.2f in sales.", sales);

	}
}
