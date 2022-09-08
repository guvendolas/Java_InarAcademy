package chapters.chapter_5.exercises;

public class C05E13 {

	public static void main(String[] args) {
		int i = 0;
		
		while (true) {
			if (Math.pow(++i, 2) < 12000)
				break;
		}
		System.out.println(++i);
	}

}
