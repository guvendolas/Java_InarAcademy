package chapters.chapter_5.exercises;

public class C05E15 {

	public static void main(String[] args) {
		int count = 1;
		System.out.print("! = " + ((int) '!') + ", and ~ = " + ((int) '~') + "\n\n");
		for (int i = 33; i < 127; i++) {
			System.out.print(((char) i) + " ");
			if (count % 10 == 0)
				System.out.println();
			count++;
		}

	}
}
