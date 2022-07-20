package Tasks;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1;        
        int num2;  
      
        System.out.print( "Input first integer: " ); // prompt        
        num1 = sc.nextInt(); // read first number from user   
 
        System.out.print( "Input second integer: " ); // prompt        
        num2 = sc.nextInt(); // read second number from user               
        if(num1<num2) {
    		System.out.println(num1+"is greater than "+num2);	
    		}
    		else if(num1>num2) {
    			System.out.println(num1+"is lesser than"+num2);
    		}
    		else if(num1==num2) {
    			System.out.println("Both are Equal");
    		}
    		         }
  }
