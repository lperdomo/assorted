/*https://www.hackerrank.com/challenges/matching-same-text-again-again/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^([a-z]\\w\\s\\W\\d\\D[A-Z][a-zA-Z][aeiouAEIOU]\\S)\\1"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
    
}

/*https://www.hackerrank.com/challenges/backreferences-to-failed-groups/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2}(-?)\\d{2}\\1\\d{2}\\1\\d{2}$"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
    
}

/*https://www.hackerrank.com/challenges/branch-reset-groups/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2}(---|-|.|:)\\d{2}\\1\\d{2}\\1\\d{2}$"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
    
}

/*https://www.hackerrank.com/challenges/forward-references/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^(\\2tic|(tac))+$"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
		Input.close();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
    
}