package chapters.chapter_5.exercises;

public class C05E18 {

	public static void main(String[] args) {
		System.out.println("Pattern A");
		for (int i = 1; i < 7; i++) {
			String patternA = "";
			int start = 1;
			while (start <= i) {
				patternA += start + " ";
				start++;
			}
			System.out.println(patternA);
		}

		System.out.println("\nPattern B");
		for (int i = 6; i > 0; i--) {
			String patternB = "";
			int start = 1;
			while (start <= i) {
				patternB += start + " ";
				start++;
			}
			System.out.println(patternB);
		}

		System.out.println("\nPattern C");
		for (int i = 1; i < 7; i++) {
			String patternC = "";
			int start = i;
			while (start >= 1) {
				patternC += start + " ";
				start--;
			}
			System.out.printf("%12s\n", patternC);
		}

		System.out.println("\nPattern D");
		for (int i = 6, space = 0; i > 0; i--) {
			String patternD = "";
			int start = 1;
			while (start <= i) {
				patternD += start + " ";
				start++;
			}
			System.out.printf("%12s\n", patternD);
		}

	}
}
