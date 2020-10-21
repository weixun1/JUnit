import java.util.*;
import java.math.*;


public class bigNumbers {

	
	public static void main(String[] arg)
	{
		String test = "14695981039346656037";
		
		String[] and = new String[2];
		and[0] = "4357048923752380957832957832";
		and[1] = "192385791834758293569387";
		
		BigInteger output = calc(test,and.length,and);
		
		System.out.print(output);
	}
	

	
	public static BigInteger calc(String val, int repetition, String[] andArray)
	{
		
		val = val.trim();
		BigInteger result = new BigInteger(val);
		String num = "1099511628211";
		BigInteger multiply = new BigInteger(num);
		for(int i = 0; i < repetition; i++)
		{
			BigInteger temp = new BigInteger(andArray[i]);
			result = result.multiply(multiply);
			result = result.and(temp);
		}
		
		return result;
	}
}
