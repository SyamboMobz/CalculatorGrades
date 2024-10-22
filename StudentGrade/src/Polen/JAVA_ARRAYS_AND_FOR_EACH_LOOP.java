package Polen;
import java.util.ArrayList;
import java.util.Scanner;
public class JAVA_ARRAYS_AND_FOR_EACH_LOOP {
	
	     public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	    	 ArrayList<Integer> grades = new ArrayList<>();
	    	 
	    	 int numberOfStudents;
	   
	    	 System.out.println("Enter the number of students: ");
	    	    numberOfStudents = scanner.nextInt();
	    	    
	    	    int[] grade = new int[numberOfStudents];
		        
		        for (int i = 0; i < numberOfStudents; i++) {
		    
		        	
		        	System.out.println("Enter grades for student- " + (i + 1) + " (Input grades from 50 to 100 for class.): ");
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Subject " + (j + 1) + ": ");
		                int grades1 = scanner.nextInt();
		                
		                scanner.close();
		        }
		            
		            
		        }
	}

}
