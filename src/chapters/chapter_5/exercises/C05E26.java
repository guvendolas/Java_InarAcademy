package chapters.chapter_5.exercises;

public class C05E26 {

	public static void main(String[] args) {
		double e = 1;
		double p = 1;
		for (int i = 1; i <= 100000; i++) {
			p = p / i;
			e += p;
			if (i == 10000) {
				System.out.println("10000 is = " + e);
			} else if (i == 20000) {
				System.out.println("20000 is = " + e);
			} else if (i == 100000) {
				System.out.println("100000 is = " + e);
			}

		}
	}

}
