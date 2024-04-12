package rappmahaboob.com23Java.lang.packagesCodeAlphaIntermship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GradeTracker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<>();

		// Input grades from the teacher
		System.out.println("Enter students' grades (Enter -1 to finish):");
		while (true) {
			int grade = scanner.nextInt();
			if (grade == -1) {
				break;
			}
			grades.add(grade);
		}

		// Calculate average
		double average = calculateAverage(grades);

		// Find highest and lowest grades
		int highest = Collections.max(grades);
		int lowest = Collections.min(grades);

		// Output results
		System.out.println("Average grade: " + average);
		System.out.println("Highest grade: " + highest);
		System.out.println("Lowest grade: " + lowest);
	}

	// Method to calculate average
	private static double calculateAverage(ArrayList<Integer> grades) {
		int sum = 0;
		for (int grade : grades) {
			sum += grade;
		}
		return (double) sum / grades.size();
	}
}
