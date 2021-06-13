package basics;
import java.util.Scanner;
public class number {
	public static void main (String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		System.out.print("Enter the third number: ");
		int num3=sc.nextInt();
		if(num1<=num2 && num1<=num3){
		    System.out.println("\n The Smallest number is: "+num1);
		}
		else if(num2<=num1 && num2<=num3){
		    System.out.println("\n The Smallest number is: "+num2);
		}
		else{
		    System.out.println("\n The Smallest number is: "+num3);
		}
		if(num1>=num2 && num1>=num3){
		    System.out.println("\n The Smallest number is: "+num1);
		}
		else if(num2>=num1 && num2>=num3){
		    System.out.println("\n The Smallest number is: "+num2);
		}
		else{
		    System.out.println("\n The largest number is: "+num3);
		}

}
	}

