import java.util.Scanner;
class Add
{ 
	// int c;
	int addition(int x, int y,int z)
	{ 	// c = x + y;
		return x + y + z; 
		// Return the sum instead of storing it in a variable
	}
}

public class Aclass
{
	public static void main(String[] arg)
	{ 
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
        System.out.println("Enter third Number");
        c=sc.nextInt();
		Add r = new Add(); //Create Object for Add class
		// r.addition(a, b);
		// System.out.println("Addition of two numbers is : " + r.c);
		System.out.println("Addition of two numbers is : " + r.addition(a, b,c));
        sc.close();
	} 
}

