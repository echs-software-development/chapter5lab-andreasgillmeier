import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
  int countPos = 0;
  int countNeg = 0;
  int count = 0, total = 0, number;
  Scanner input = new Scanner(System.in);
  System.out.print("enter an integer however this system will end if you enter a 0 youve been warned!!!");
  number = input.nextInt();
  while (number != 0){
    if (number > 0)
      countPos++;
    else if (number < 0 )
      countNeg++;
    total += number;
    count++;
    
    number = input.nextInt();
    
  }
  if (count == 0)
    System.out.println("No numbers are entered entered except 0");
  else {
    System.out.println("there are " + countPos+ "positive numbers");
    System.out.println("there are " + countNeg+ " negative numbers");
    System.out.println("the total is " + total);
    System.out.println("the average is " + total * 1.0 / count);
  }
  //set up variables to hold positive number, negative number, count, total and number
//set up a scanner to obtain ints from the user
//create a while loop that will no longer be true when the user enters a zero.
//create an if  statement to deal with the positive number and way to count up
//create an else if to with the negative number and way to count down 
//read another number
//add the total to number
//count up with the count variable
//another if to deal with if a 0 is entered
//print that no numbers are entered but 0
//print statements for positives number, negative number, total and average-4 different

 }
}