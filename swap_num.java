package basics;

import java.util.Scanner;

public class swap_num {
	public static void main(String a[])
    {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
        int x = reader.nextInt();
        System.out.print("Enter the value of y: ");
        int y = reader.nextInt();
        
      
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y);
    }
}


