import java.io.*;
public class userInputOperations
{
	static InputStreamReader reader = new InputStreamReader (System.in);
	static BufferedReader input = new BufferedReader(reader);

    	public static void main(String[] args) throws Exception
    	{
    		double num1, num2, sum, diff, quotient, modulo;

   			System.out.println("Enter first number:");
   			num1 = Double.parseDouble(input.readLine());
   			System.out.println("Enter second number:");
   			num2 = Double.parseDouble(input.readLine());

   			sum = num1 + num2;
				diff = num1 - num2;
   			quotient = num1 / num2;
   			modulo = num1 % num2;

				System.out.println("The sum is: " + sum);
				System.out.println("The difference is: " + diff);
   			System.out.println("The quotient is: " + quotient);
   			System.out.println("The remainder is: " + modulo);

    	}


}
