/*https://www.hackerrank.com/challenges/java-strings-introduction/*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
		scan.close();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length()+B.length();
        String sa = A.substring(0, 1).toUpperCase() + A.substring(1);
        String sb = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(sum);
        if (A.compareTo(B) > 0) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(sa + " " + sb);
    }
}

/*https://www.hackerrank.com/challenges/java-substring/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
		System.out.println(S.substring(start, end));
    }
}

/*https://www.hackerrank.com/challenges/java-string-compare/*/
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);
        for (int i = 0; i < s.length()-k+1; i++) {                        
            String current = s.substring(i, i+k);
            if (smallest.compareTo(current) > 0) smallest = current;
            if (largest.compareTo(current) < 0) largest = current;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*https://www.hackerrank.com/challenges/java-string-reverse/*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
		scan.close();
        /* Enter your code here. Print output to STDOUT. */
        boolean p = true;
        for (int i = 0; i < (A.length()/2); i++) {
            if (A.charAt(i) != A.charAt(A.length()-i-1)) p = false;
        }
        if (p) System.out.println("Yes");
        else System.out.println("No");
    }
}

/*https://www.hackerrank.com/challenges/java-anagrams/*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();
        int[] counts = new int[26];
        for (int i = 0; i < A.length; i++) {
            counts[A[i]-97]++;
            counts[B[i]-97]--;
        }
        for (int i = 0; i < 26; i++)
            if (counts[i] != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*https://www.hackerrank.com/challenges/java-string-tokens/*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        s = s.trim();        
        if (s.length() != 0) {
            String tokens[] = s.split("[!,?._'@ ]+");
            System.out.println(tokens.length);
            for (String i : tokens) System.out.println(i);
        } else {
            System.out.println(0);
        }
    }
}

/*https://www.hackerrank.com/challenges/pattern-syntax-checker/*/
import java.util.Scanner;
import java.util.regex.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0 && in.hasNextLine()){
			String pattern = in.nextLine();
          	//Write your code
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
		}
        in.close();
	}
}

/*https://www.hackerrank.com/challenges/java-regex/*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
		in.close();
    }
}

//Write your code here
class MyRegex {
	
    String pattern;
    public MyRegex() {
        pattern = "^((0?1?\\d?\\d|2[0-4]\\d|25[0-5])($|\\.(?!$))){4}$"; 
    }
}

/*https://www.hackerrank.com/challenges/duplicate-word/*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        in.close();
    }
}

/*https://www.hackerrank.com/challenges/valid-username-checker/*/
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

/*https://www.hackerrank.com/challenges/tag-content-extractor/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
			boolean match = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                match = true;
            }
            if (match == false) System.out.println("None");
			testCases--;
		}
        in.close();
	}
}




