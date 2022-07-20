package Tasks;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
int a=sc.nextInt();
System.out.println("Enter the second number");
int b=sc.nextInt();
System.out.println("Enter the third number");
int c=sc.nextInt();

if (a >b)
 if (a >c)
  System.out.println("The greatest: " + a);
 
if (b > c)
 if (b > a)
  System.out.println("The greatest: " + b);
 
if (c > a)
 if (c> b)
  System.out.println("The greatest: " + c);
	}

}
