package chapters.chapter_5.exercises;

public class C05E12 {

	public static void main(String[] args) {
		int i = 0;
		
		while (true) {
			if (Math.pow(++i, 3) > 12000)
				break;
		}
		System.out.println(--i);
	}
	

}
