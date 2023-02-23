/*https://www.hackerrank.com/challenges/java-biginteger/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        scan.close();
        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    }
}

/*https://www.hackerrank.com/challenges/java-primality-test/*/
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
        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger i = new BigInteger(n);
        if (i.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}

/*https://www.hackerrank.com/challenges/java-bigdecimal/*/
import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for (int i=0;i<n;i++) {
            s[i]=sc.next();
        }
      	sc.close();
        //Write your code here
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String sa, String sb) {
                BigDecimal a = new BigDecimal(sa);
                BigDecimal b = new BigDecimal(sb);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s, 0, n, c);
        //Output
        for (int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}