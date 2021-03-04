import java.util.Scanner;

public class Prob4 {
  public static void main(String[] args){
    int count = 1;
    for (int number = 100; number <= 1000; number++)
      if (count % 5 == 0 && count % 6 == 0)
        System.out.println((count++ % 10 != 0) ? number + " ": number + "/n");
  //make a count variable 
//write a for loop to iterate through the numbers
//write an if statement using the modulo operator to check if the numbers are divisible by one another
//this will be the final print stmt         System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");


  }
}