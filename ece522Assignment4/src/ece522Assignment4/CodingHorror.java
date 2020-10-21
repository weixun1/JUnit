
package ece522Assignment4;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Assignment 4 Part 1: Static Code Analysis <br />
 * The buggy {@code CodingHorror} source code
 */
public class CodingHorror {

    public static void main(String args[]) {
        // TODO: Assignment 4 Part 1 -- run FindBugs on the code

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = null;
        try {
           input = br.readLine();			// e.g., peel
   
        } catch (IOException ioex) {
            System.err.println(ioex.getMessage());
        }
        
    	// BUG #3: null input
    	// Cause: readLine might take a null value as its input, and this would cause an exception to be thrown if null value is dereferenced
    	// Solution: check if readLine has taken a null value as its input or not, if it is, then report for invalid input
        if (input == ""| input == null)
        {
        	System.out.println("No input entered, please try again.");
        	return;
        }
        else
        {
            // BUG# 4: If user entered "pool" the if condition will be true and it will assume user entered peel
            // Cause: input is checked after it is being modified
            // Solution: use another if condition to check the value of the input, before it is modified
            if(input.equals("pool"))
            {
            	System.out.println("user entered something else.");
            	return;
            }
            
            // BUG# 1: input is not affected.
            // Cause: input.replace returns the modified string, but it does not affect the object input
            // Solution: make input = input.replace
            input = input.replace('e', 'o');
        

        
        
        
        
            // BUG 2: wrong comparison method in the if condition
            // Cause: String should not be compared using ==, because string is a reference to an address, and "xxx" refers to its actual value
            // Solution: use input.compareTo function to evaluate the actual value of the arguments.
            if (input.compareTo("pool") == 0) 
            {
            	System.out.println("User entered peel.");
            } else 
            {
            	System.out.println("User entered something else.");
            }
        }
    }
}