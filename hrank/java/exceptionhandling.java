/*https://www.hackerrank.com/challenges/java-exception-handling-try-catch/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        try {
			int x = s.nextInt();
			int y = s.nextInt();
			s.close();
			System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

/*https://www.hackerrank.com/challenges/java-exception-handling/*/
import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) throw new Exception("n or p should not be negative.");
        else if (n == 0 && p == 0) throw new Exception("n and p should not be zero.");
        return (long)Math.pow(n, p);
    }
    
}

public class Solution {
	
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
