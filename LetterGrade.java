package lettergrade;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class LetterGrade {

    public static void main(String[] args) {
        
        System.out.print("Enter Grade: ");// Prompt user to enter Grade
        Scanner input = new Scanner(System.in); //imports Java.util.scanner
        int studentGrade = input.nextInt(); //set student grade by user input
        int totalGrades = studentGrade + 1; // sum of grades entered by user
        int numGrades = 0; // sum of grades entered by user
        int average; // average of grades
        totalGrades = totalGrades + studentGrade; // add grade to total
        studentGrade = studentGrade + 1; // increment counter by 1
        
        
        while ( (studentGrade >= 0) && (studentGrade < 101))//condition
         {
            if ((studentGrade >= 90) && (studentGrade == 100)){
            System.out.println("A");
            }
            else if ((studentGrade >= 80) && (studentGrade <= 90)){
            System.out.println("B");
            }
            else if ((studentGrade >= 70) && (studentGrade <= 80)){
            System.out.println("C");
            }
            else if ((studentGrade >= 60) && (studentGrade <= 70)){
            System.out.println("D");
            }
            else{
            System.out.println("F");
            }
            
            System.out.print("Enter Grade: ");
            studentGrade = input.nextInt();
            studentGrade++; // to repeat loop
            numGrades++; //add another number of grade
            average = totalGrades / numGrades; // integer division yields integer result
            System.out.printf("Average grade is: ", average);
         }
       }
    }
