package weeks.week_4;
/**

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
		
	}
	

	
	
	
	
	public static void length() {
		String temp = "I love inar academy";
		int length = temp.length();
		System.out.println(length);
	}

}
