package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int userAnswer = input.nextInt();

		if (userAnswer > 15 || userAnswer < 0) {
			System.out.println(userAnswer + " is invalid number!");
			
			//if (userInput >= 0 && userInput <= 9) {
       //     System.out.println("The hex value is " + userInput);
        

       // switch (userInput) {
           // case 10:
               // System.out.println("The hex value is " + "A");
             //   break;

           // case 11:
              //  System.out.println("The hex value is " + "B");
            //    break;

          //  case 12:
              //  System.out.println("The hex value is " + "C");
            //    break;

          //  case 13:
              //  System.out.println("The hex value is " + "D");
            //    break;

          //  case 14:
            //    System.out.println("The hex value is " + "E");
           //     break;

         //   case 15:
          //      System.out.println("The hex value is " + "F");
        //        break; 
			
			
			System.exit(0);
		}

		System.out.println("The hex value is " + Integer.toHexString(userAnswer).toUpperCase());
		input.close();
	}

}
