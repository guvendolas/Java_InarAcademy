package chapters.chapter_2.exercises;

public class C02E08 {

	public static void main(String[] args) {
		long totalMiliseconds = System.currentTimeMillis();
		
		long totalSecond = totalMiliseconds / 1000;
		long currenSecond = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		long currenMinutes = totalMinutes % 60;
		long totalHour = totalMinutes / 60;
		long currenHour = totalHour % 24;
		
		System.out.println(currenHour + ":" + currenMinutes + ":" + currenSecond + " GMT");
		

	}

}
