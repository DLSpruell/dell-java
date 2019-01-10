import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Please enter a number.");
		Scanner reader = new Scanner(System.in);
		int firstNum = reader.nextInt();
		System.out.println("Please enter another number.");
		int secondNum = reader.nextInt();
		int num1 = firstNum;
		int num2 = secondNum;
		reader.close();
		addition(num1, num2);
		subtraction(num1, num2);
		multiplication(num1, num2);
		division(num1, num2);
	}

	public static int addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition Result:" + num1 +" + "+ num2 +" = "+ sum +"");
		return sum;
	}

	public static int subtraction(int num1, int num2) {
		int difference = num1 - num2;
		System.out.println("Subtraction Result: "+ num1 +" - "+ num2 +" = "+ difference +"");
		return difference;
	}

	public static int multiplication(int num1, int num2) {
		int multiply = num1 * num2;
		System.out.println("Multiplication Result: "+ num1 +" * "+ num2 +" = "+ multiply +"");
		return multiply;
	}

	public static int division(int num1, int num2) {
		int divide = num1 / num2;
		System.out.println("Division Result: "+ num1 +" / "+ num2 +" = "+ divide +"");
		return divide;
	}
}