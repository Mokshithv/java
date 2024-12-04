public class CustomDivision 
{ 
public static void main(String[] args) { 
int numerator = 10; 
int denominator = 0; 
try 
{ 
if (denominator == 0) 
{ 
throw new DivisionByZeroException("Division by zero is not allowed!"); 
} 
int result = numerator / denominator; 
System.out.println("Result: " + result); 
} 
catch (DivisionByZeroException e) 
{ 
System.err.println("Error: " + e.getMessage()); 
} 
finally 
{ 
System.out.println("This block always executes, 
regardless of exceptions."); 
} 
} 
} 
// Custom exception class for DivisionByZero 
class DivisionByZeroException extends Exception 
{ 
public DivisionByZeroException(String message) 
{ 
super(message); 
} 
}
