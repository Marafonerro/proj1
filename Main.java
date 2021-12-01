 /*Vladyslav Kozlov
 CIS219-66W Tuesdays and Thursdays at 3:30pm
 Project 1: Random numbers in an array, checked
 11/27/2021*/
import java.util.Random;

public class Main {
    	static void myRand() { // a main method
		// creates a random number
    	Random r = new Random();
        int[] number = new int[20]; // An array containing the numbers generated
        int count = 0;

        while (count < number.length) {
			int randNum = r.nextInt(30); // generates a random number between 1 and 30
            ++randNum;
            boolean exists = false;
            
            // Is randNum in our array? Let's check
            for (int i = 0; i < count; i++) {
                if (number[i] == randNum) {
                    exists = true;
                    break;
                }
            }
            // We didn't find it, so we're good to add it to the array
            if (!exists) {
                number[count++] = randNum;
            }
        }
		// A screen print of the numbers
        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]);
        }
    }
    public static void main(String[] args) {
    	myRand();
    }
}