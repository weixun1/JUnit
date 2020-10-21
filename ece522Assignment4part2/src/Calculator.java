/**
 * Assignment 4 Part 2: Unit Testing <br />
 * The calculator to run the test cases
 */
// TODO: Assignment 4 Part 2 -- Create the Calculator here

public class Calculator{
	CreationTests test;
	
	
	public Double add(double arg1, double arg2)
	{
		return Double.valueOf(arg1 + arg2);
	}
	
	public Double subtract(double arg1, double arg2)
	{
		return Double.valueOf(arg1 - arg2);
	}
	public Double multiply(double arg1, double arg2)
	{
		return Double.valueOf(arg1 * arg2);
	}
	public Double divide(double arg1, double arg2)
	{
		return Double.valueOf(arg1 / arg2);
	}
	public Double[] getRoots(double a, double b, double c)
	{
		double[] result = new double[2];
		Double[] x = new Double[2];
		Double[] singleRoot = new Double[1];
		
		result[0] = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
		
		result[1] = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
		
		x[0] = Double.valueOf(result[0]);
		x[1] = Double.valueOf(result[1]);
		if(x[0].isNaN() && x[1].isNaN())
		{
			return x;
		}
		else if(x[1].equals(x[0]))
		{
			singleRoot[0] = x[0];
			
			return singleRoot;
		}
		else
		{
			return x;
		}
	}
	
	public Double[] sqrRoot(double arg1)
	{
		int arraysize = 2;
		double[] roots = new double[arraysize];
		Double[] distinctRoots = new Double[arraysize];
		
		roots[0] = Math.sqrt(arg1);
		roots[1] = - Math.sqrt(arg1);
		
		for(int i = 0; i < roots.length; i++)
		{
			distinctRoots[i] = Double.valueOf(roots[i]);
		}
		
		if(distinctRoots[0].isNaN() && distinctRoots[1].isNaN())
		{
			return distinctRoots;
		}
		else
		{
			return distinctRoots;
		}
		
		
	}
}