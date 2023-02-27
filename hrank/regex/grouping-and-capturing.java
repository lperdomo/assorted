/*https://www.hackerrank.com/challenges/matching-word-boundaries/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
}

/*https://www.hackerrank.com/challenges/capturing-non-capturing-groups/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("(ok){3,}"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}

/*https://www.hackerrank.com/challenges/alternative-matching/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr\\.|Mrs\\.|Ms\\.|Dr\\.|Er\\.)([a-zA-Z]+)$"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}