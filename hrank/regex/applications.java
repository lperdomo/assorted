/*https://www.hackerrank.com/challenges/detect-html-links/*/
import java.util.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "<\\s*a\\s+href\\s*=\\s*\\\"(?<link>[^\\\\\"]*)\\\"[^>]*>(?:<[^>]*>)*(?<name>.*?)(?:<\\s*/[^>]*>)*<\\s*/\\s*a\\s*>";
        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher("");
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            matcher.reset(scan.nextLine());
            while (matcher.find()) {
                System.out.println(matcher.group("link").trim() + "," + matcher.group("name").trim());
            }
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/detect-html-tags/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> tree = new TreeSet<String>();
        String regex = "<\\s*([a-z0-9]+)(?:\\s(?:\\s*[a-z]+\\s*=\\s*\\\"[^\\\\\"]*\\\")*)?\\s*(?:\\/>|>)";
        Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher("");
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            m.reset(scan.nextLine());
            while (m.find()) tree.add(m.group(1));
        }
        scan.close();
        int count = 0;
        for (String tag : tree) {
            count++;
            System.out.print((count < tree.size()) ? tag + ";" : tag);
        }
    }
}

/*https://www.hackerrank.com/challenges/find-substring/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--)
            words.add(scan.nextLine());
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            String regex = "[a-zA-Z0-9_]+"+scan.nextLine()+"[a-zA-Z0-9_]+";
            Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher("");
            int count = 0;
            for (String word : words) {
                m.reset(word);
                while (m.find()) count++;
            }
            System.out.println(count);
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/alien-username/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matcher m = Pattern.compile("^[_\\.]\\d+[a-zA-Z]*_?").matcher("");
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            System.out.println((m.reset(scan.nextLine()).matches()) ? "VALID" : "INVALID");
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/ip-address-validation/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matcher ip4 = Pattern.compile("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}").matcher("");
        Matcher ip6 = Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))").matcher("");
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            String ip = scan.nextLine();
            if (ip4.reset(ip).matches())
                System.out.println("IPv4");
            else if (ip6.reset(ip).matches())
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
        scan.close();        
    }
}

/*https://www.hackerrank.com/challenges/detecting-valid-latitude-and-longitude/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "^\\([-+]?(?:90(?:\\.0+)?|[1-8]?[0-9](?:\\.[0-9]+)?), [-+]?(?:180(?:\\.0+)?|(?:(?:[0-9]?[0-9]|1[0-7][0-9])(?:\\.[0-9]+)?))\\)$";
        Matcher m = Pattern.compile(regex).matcher("");
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            System.out.println((m.reset(scan.nextLine()).matches()) ? "Valid" : "Invalid");
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/hackerrank-tweets/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = ".*hackerrank.*";
        Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher("");
        int count = 0;
        for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
            if (m.reset(scan.nextLine()).matches()) count++;
        }
        scan.close();
        System.out.println(count);
    }
}

/*https://www.hackerrank.com/challenges/stack-exchange-scraper/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "<\\s*div\\s+class\\s*=\\s*\"question-summary\"\\s*id\\s*=\\s*\"question-summary-(?<id>\\d+)\"\\s*>.*?<\\s*div\\s+class\\s*=\\s*\"summary\"\\s*>.*?<\\s*a\\s+.*?class\\s*=\\s*\"question-hyperlink\"\\s*>(?<title>.*?)</\\s*a\\s*>.*?<\\s*div\\s+class\\s*=\\s*\"user-action-time\"\\s*>.*?<\\s*span\\s+.*?>(?<time>.*?)</\\s*span\\s*>";
        String html = "";
        while(scan.hasNext())
            html += "\n" + scan.nextLine();
        scan.close();
        Matcher m = Pattern.compile(regex, Pattern.DOTALL).matcher(html);
        while (m.find())
            System.out.println(m.group("id")+";"+m.group("title")+";"+m.group("time"));
    }
}

/*https://www.hackerrank.com/challenges/utopian-identification-number/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matcher m = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}").matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            System.out.println((m.reset(scan.nextLine()).matches()) ? "VALID" : "INVALID");
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/valid-pan-format/*/
import java.io.*;
import java.util.regex.*;

public class Solution {

    // Template Credit goes to www.hackerrank.com/kogupta 
    private static boolean isValidPAN(String s) {
        Matcher m = Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]$").matcher(s);
        return m.matches();
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}

/*https://www.hackerrank.com/challenges/find-hackerrank/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matcher m1 = Pattern.compile("^hackerrank.*").matcher("");
        Matcher m2 = Pattern.compile(".*hackerrank$").matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            int out = -1;
            String s = scan.nextLine();
            if (m1.reset(s).matches()) 
                if (m2.reset(s).matches()) out = 0;
                else out = 1;
            else if (m2.reset(s).matches()) out = 2;
            System.out.println(out);
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/saying-hi/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matcher m = Pattern.compile("^hi\\s[^d]", Pattern.CASE_INSENSITIVE).matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            String s = scan.nextLine();
            if (m.reset(s).find()) System.out.println(s);
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/hackerrank-language/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "^[1-9][0-9]{4}\\s(?:C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$";
        Matcher m = Pattern.compile(regex).matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            System.out.println((m.reset(scan.nextLine()).matches()) ? "VALID" : "INVALID");
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/split-number/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "(\\d{1,3})([ -])(\\d{1,3})\\2(\\d{4,10})";
        Matcher m = Pattern.compile(regex).matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            if (m.reset(scan.nextLine()).matches())
                System.out.println("CountryCode=" + m.group(1)
                                + ",LocalAreaCode=" + m.group(3) 
                                + ",Number=" + m.group(4));
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/uk-and-us/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String regex = "([a-z]+)[sz]e";
        Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            m.reset(scan.nextLine());
            while (m.find()) {
                String s = m.group(1) + "ze";
                if (map.get(s) == null) map.put(s, 1);
                else map.put(s, map.get(s)+1);
            }
        }
        for (int t = Integer.parseInt(scan.nextLine()); t > 0; t--) {
            Integer count = map.get(scan.nextLine());
            System.out.println(count == null ? 0 : count);            
        }
        scan.close();        
    }
}

/*https://www.hackerrank.com/challenges/uk-and-us-2/*/
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String regex1  = "[a-z]*our[a-z]*";
        String regex2 = "([a-zA-Z]+)or|or([a-zA-Z]+)";
        Matcher m = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE).matcher("");
        for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
            String s = scan.nextLine().toLowerCase().replaceAll(regex2, "$1our$2");
            m.reset(s);
            while (m.find()) {
                if (map.get(m.group()) == null) map.put(m.group(), 1);
                else map.put(m.group(), map.get(m.group())+1);
            }
        }
        for (int t = Integer.parseInt(scan.nextLine()); t > 0; t--) {
            Integer count = map.get(scan.nextLine().toLowerCase());
            System.out.println(count == null ? 0 : count);            
        }
        scan.close();        
    }
}