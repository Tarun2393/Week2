package Week3;

import java.util.*;

public class GradesAverage {

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numStudents = obj.nextInt();
		int[] Array = new int[numStudents];
		float sum = 0;
		for (int i = 0; i < numStudents; i++) {
			if (Array[i] >= 0 && Array[i] <= 100) {
				System.out.println("Enter the grade for student " + (i+1));

				Array[i] = obj.nextInt();
			}

			else {
				System.out.println("Invalid grade, try again...");

			}
			sum = sum + Array[i];
		}
		float average = sum / numStudents;
		System.out.println("The average is: " + average);

	}
}
