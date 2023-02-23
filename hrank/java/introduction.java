/*https://www.hackerrank.com/challenges/welcome-to-java*/
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

/*https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

/*https://www.hackerrank.com/challenges/java-if-else/*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if ((N & 1) != 0) System.out.println("Weird");
        else if (2 <= N && N <= 5) System.out.println("Not Weird");
        else if (6 <= N && N <= 20) System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}

/*https://www.hackerrank.com/challenges/java-stdin-stdout/*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*https://www.hackerrank.com/challenges/java-output-formatting/*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1=sc.next();
			int x=sc.nextInt();
			System.out.printf("%-15s", s1);
			System.out.printf("%03d", x);
			System.out.println();
			//Complete this line
		}
		System.out.println("================================");
    }
}

/*https://www.hackerrank.com/challenges/java-loops-i/*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        bufferedReader.close();
    }
}

/*https://www.hackerrank.com/challenges/java-loops/*/
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = 0;
            for (int j = 0; j < n; j++) {
                x = 0;
                for (int k = 0; k <= j; k++) x += Math.pow(2,k)*b;
                System.out.printf("%d ", a+x);
            }
            System.out.println(); 
        }
        in.close();
    }
}

/*https://www.hackerrank.com/challenges/java-datatypes/*/
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++) {
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=Math.pow(-2, 31) && x<=Math.pow(2, 31)-1)System.out.println("* int");
                if(x>=Math.pow(-2, 63) && x<=Math.pow(2, 63)-1)System.out.println("* long");
            } catch(Exception e) {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
		scan.close();
    }
}

/*https://www.hackerrank.com/challenges/java-end-of-file*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 1;
        while (scan.hasNext()) {
            System.out.printf("%d ", n);
            System.out.println(scan.nextLine());
            n++;
        }
		scan.close();
    }
}

/*https://www.hackerrank.com/challenges/java-static-initializer-block/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int B, H;
	static boolean flag;
	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		scan.close();
		if (B > 0 && H > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	};

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}

/*https://www.hackerrank.com/challenges/java-int-to-string/*/
import java.util.*;
import java.security.*;

public class Solution {
	
	public static void main(String[] args) {
		DoNotTerminate.forbidExit();
		try {
			Scanner in = new Scanner(System.in);
			int n = in .nextInt();
			in.close();
			//String s=???; Complete this line below
			//Write your code here
			String s = Integer.toString(n);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {
		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
		@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
				 throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}

/*https://www.hackerrank.com/challenges/java-date-and-time/*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month-1);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.YEAR, year);
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}

public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);
        bufferedWriter.write(res);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*https://www.hackerrank.com/challenges/java-currency-formatter/*/
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String india = us.replace("$", "Rs.");
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}