package Polen;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        ArrayList<ArrayList<Integer>> subjectGrades = new ArrayList<>();

	        System.out.println("Enter the number of students: ");
	        int numberOfStudents = scanner.nextInt();

	        
	        for (int i = 0; i < numberOfStudents; i++) {
	            ArrayList<Integer> grades = new ArrayList<>();

	            System.out.println("Enter grades for student- " + (i + 1) + " (Physics, Chemistry, Math): ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Subject " + (j + 1) + ": ");
	                int grade = scanner.nextInt();
	                grades.add(grade);
	            }

	            subjectGrades.add(grades);
	        }

	        
	        System.out.println("\nOverall Statistics:");

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Subject " + (i + 1) + " - ");
	            System.out.println("Average: " + calculateAverage(subjectGrades, i));
	            System.out.println("Highest: " + findHighest(subjectGrades, i));
	            System.out.println("Lowest: " + findLowest(subjectGrades, i));
	            System.out.println();
	        }

	        scanner.close();
	    }

	    private static double calculateAverage(ArrayList<ArrayList<Integer>> grades, int subjectIndex) {
	        int sum = 0;
	        for (ArrayList<Integer> studentGrades : grades) {
	            sum += studentGrades.get(subjectIndex);
	        }
	        return (double) sum / grades.size();
	    }

	    private static int findHighest(ArrayList<ArrayList<Integer>> grades, int subjectIndex) {
	        int highest = Integer.MIN_VALUE;
	        for (ArrayList<Integer> studentGrades : grades) {           
	         highest = Math.max(highest, studentGrades.get(subjectIndex));
	        }
	        return highest;
	    }

	    private static int findLowest(ArrayList<ArrayList<Integer>> grades, int subjectIndex) {
	        int lowest = Integer.MAX_VALUE;
	        for (ArrayList<Integer> studentGrades : grades) {
	            lowest = Math.min(lowest, studentGrades.get(subjectIndex));
	        }
	        return lowest;
	    }
	}


