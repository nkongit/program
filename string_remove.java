package basics;
import java.util.Scanner;
public class string_remove {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);

	System.out.println("enter the string:"); 
	String str =input.next();

	System.out.println("enter the character you want to remove from the string:");

	char ch =input.next().charAt(0);
	int i = str.indexOf(ch);

	String str1= str.substring(0, 1)+str.substring(i+1);

	System.out.println(str1);
	  }

}
