package Polen;
import java.util.Scanner;
public class StudentGradesAnalysis {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfStudents;
        
        System.out.print("Enter the number of students: ");
        numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];    //Create an array

        for (int i = 0; i < numberOfStudents; i++) {
            while (true) {
                System.out.print("Enter the grade for student " + (i + 1) + " (50 out of 100): ");
                               //Input grades from 50 to 100 for a class
                try {
                    int grade = scanner.nextInt();
                    if (grade >= 50 && grade <= 100) {
                        grades[i] = grade;
                        break; 
                    } else {
                        System.out.println("Error: Grade must be 50 out of 100. Try again.");
                    }
                } catch (Exception e) {           // Add error handling.
                    System.out.println("Error: Invalid input. Please enter an integer 50 out of 100.");
                    scanner.next(); 
                }
            }
        }

        System.out.println("\nDisplay all grades:");         //Display all grades.
       
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println(); 
      
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numberOfStudents;
        System.out.printf("Class Average: %.2f\n", average);      //Calculate the class average.
        
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {								 //Determine the highest grades.
            if (grade > highest) highest = grade;				 //Determine the lowest grades.
            if (grade < lowest) lowest = grade;
        }
        System.out.println("Highest Grade: " + highest);         
        System.out.println("Lowest Grade: " + lowest);			  

        	scanner.close();
	}

    }


