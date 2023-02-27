/*https://www.hackerrank.com/challenges/positive-lookahead/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("o(?=oo)"); //Use '\\' instead of '\'.
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }
}

/*https://www.hackerrank.com/challenges/negative-lookahead/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("(.)(?!\\1)"); //Use '\\' instead of '\'.
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }
}

/*https://www.hackerrank.com/challenges/positive-lookbehind/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("(?<=[13579])\\d"); //Use '\\' instead of '\'.
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }
}

/*https://www.hackerrank.com/challenges/negative-lookbehind/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("(?<![aeiouAEIOU])."); //Use '\\' instead of '\'.
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }
}