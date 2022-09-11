package weeks.week_4;

/**
 * 
 * length(): Returns the length of the specified string.
 * 
 * substring(): Returns the substring from the specified string.
 * 
 * equalsIgnoreCase(): Compares two strings ignoring case differences.
 * 
 * contains(): Checks if a string contains a substring.
 * 
 * trim(): Returns thesubstring after removing any leading and trailing
 * whitespace from the specified string.
 * 
 * charAt(): Returns the character at specified index.
 * 
 * toLowerCase(): Converts string characters to lower case.
 * 
 * toUpperCase():Converts string characters to upper case. concat():
 * Concatenates two strings.
 * 
 * split(): Split/divide the string at the specified regex.
 * 
 * compareTo():Compares two strings on the basis of the Unicode value of each
 * string character.
 * 
 * compareToIgnoreCase(): Similar to compareTo, but it also ignores case
 * differences.
 */

public class StringPractice {

	public static void main(String[] args) {
		length();
		Substring();
		equalsIgnoreCase();
		contains();
		trim();
		charAt();
		toLowerCase();
		toUpperCase();

	}

	public static void toUpperCase() {
		String s1 = "I love İnar Academy";
		System.out.println(s1.toUpperCase());
	}

	public static void toLowerCase() {
		String s1 = "I love İnar Academy";
		System.out.println(s1.toLowerCase());

	}

	public static void charAt() {
		String s1 = "I love İnar Academy";
		System.out.print(s1.charAt(0));
		System.out.println(s1.charAt(5));

	}

	public static void trim() {
		String s1 = "      I love İnar Academy    ";
		System.out.println(s1.trim());

	}

	public static void contains() {
		String s1 = "I love inar";
		System.out.println(s1.contains("love"));
		System.out.println(s1.contains("academy"));

	}

	public static void equalsIgnoreCase() {
		String s1 = "I love İnar Academy";
		String s2 = "I love İnar Academy";
		System.out.println(s1.equalsIgnoreCase(s2));

	}

	public static void Substring() {

		String temp = "I love İnar Academy";
		System.out.println(temp.substring(0, 7));

	}

	public static void length() {
		String temp = "I love inar academy";
		int length = temp.length();
		System.out.println(length);
	}

}
