/*https://www.hackerrank.com/challenges/matching-x-repetitions/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-zA-Z02468]{40}[\\s13579]{5}$"); // Use \\ instead of using \ 
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

/*https://www.hackerrank.com/challenges/matching-x-y-repetitions/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{1,2}[a-zA-Z]{3,}\\.{0,3}$"); // Use \\ instead of using \ 
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

/*https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \ 
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

/*https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \ 
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

/*https://www.hackerrank.com/challenges/matching-one-or-more-repititions/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d+[A-Z]+[a-z]+$"); // Use \\ instead of using \ 
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

/*https://www.hackerrank.com/challenges/matching-ending-items/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-zA-Z]*s$"); // Use \\ instead of using \ 
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}