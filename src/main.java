import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to simple calculator app.");
		System.out.println("...................");
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("...................");
		System.out.println("Please choose operation:");
		System.out.println("1- add");
		System.out.println("2- subtract");
		System.out.println("3- multiply");
		System.out.println("4- divide");
		int choice = sc.nextInt();
		switch (choice){
		case 1:
			System.out.println("Answer is: " + add(x,y));
			break;
		case 2:
			System.out.println("Answer is: " + subtract(x,y));
			break;
		case 3:
			System.out.println("Answer is: " + multiply(x,y));
			break;
		case 4:
			System.out.println("Answer is: " + divide(x,y));
			break;
		default:
			System.out.println("Error: unknown operation. App will terminate.");
		}
	}
	
	public static int add(int x, int y) {
		return x + y;
		
	}
	public static int subtract(int x, int y) {
		return x - y;
		
	}
	public static int multiply(int x, int y) {
		return x * y;
	}
	public static int divide(int x, int y) {
		return x / y;
		
	}
}
