package lab01;
import java.util.Scanner;
public class factorial {
		 public static void main(String args[]){ 
		  System.out.println("------Factorial of a number------");
		  System.out.println("Enter an inter:");
		  
		  try {
		  //GETTING USER INPUT
		  Scanner input = new Scanner(System.in);
		  
		  //CAST TO INTEGER
		  int number = input.nextInt();
		  
		  int factorial=1;
		  
		  //CALCULATE FACTORIAL
		  for(int i=1;i<=number;i++){    
			  factorial=factorial*i;    
		  } 
		  
		  //OUTPUT
		  System.out.println("Factorial of "+number+" is: "+factorial); 
		  
		  //CLOSING THE RESOURCE
		  input.close();
		  
		  //EXCEPTION
		  }catch(Exception e) {
			  System.out.println("ENTERED NUMBER NOT VALID"); 
		  }
		} 
}

