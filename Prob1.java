import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a number of grades you would like");

  int numgrade = scan.nextInt();
  int gradessum = 0 ;
  for(int x =1 ; x <= numgrade; x++  ){
    System.out.println("Enter a grade" + x);
    int grade = scan.nextInt();
    gradessum += grade ;

  }

  System.out.println(" the sum of the grades is :" + gradessum);
  
  }
}
//move bracket for loop line 11
//
//import java.util.Scanner;  
//public class Main {

	//public static void main(String[] args) {
		
		//Scanner scan = new Scanner (System.in);
		//System.out.print("How many grades would you like to enter: ");
		
		//int times = scan.nextInt();
		//int sumOfGrades = 0; //outside the loop so condition does not get set to 0
		//every time the loop iterates
		
		//for (int i = 0; i <= times;i++) {
			
			//System.out.println("Enter grade " + i + "-->");
			//int grade = scan.nextInt();//inside the loop- eval to this grade only
			//sumOfGrades = sumOfGrades + grade;
			//sumOfGrades += grade;
			
		//}
		
		//System.out.println("The sum of the grades is:: " + sumOfGrades);
			
			
		//}
		
		

	//}
//