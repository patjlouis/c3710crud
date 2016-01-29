import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class MaxandAvg
{
 
private static Scanner userInput;

public static void main(String[] args)
   {
      ArrayList<Double> numbList = new ArrayList<Double>();
 
      userInput = new Scanner(System.in);
      System.out.println("Please enter 10 numbers and . when done: ");
       
      while (userInput.hasNextDouble())
      {
    	  if(numbList.size() >= 10)
    		  break;
    		  
         double number = userInput.nextDouble();
         numbList.add(number);
      }
 
      
         double i = 0;
         for (double element : numbList)
         {
            i = i + element;
            
         }
         
         double average = i / numbList.size();
         System.out.println("The average is: " + average);
         Object max = Collections.max(numbList);
         System.out.println("The max is: " + max);

   }

}




