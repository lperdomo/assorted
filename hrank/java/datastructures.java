/*https://www.hackerrank.com/challenges/java-1d-array-introduction/*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

/*https://www.hackerrank.com/challenges/java-2d-array/*/
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
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        bufferedReader.close();
        int sum = 0, lsum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                //if (arr.get(i+1).get(j) == 0 && arr.get(i+1).get(j+2) == 0) {
                    sum = 0;
                    sum += arr.get(i).get(j);
                    sum += arr.get(i).get(j+1);
                    sum += arr.get(i).get(j+2);
                    sum += arr.get(i+1).get(j+1);
                    sum += arr.get(i+2).get(j);
                    sum += arr.get(i+2).get(j+1);
                    sum += arr.get(i+2).get(j+2);                                    
                    if (sum > lsum) lsum = sum;                                        
                //}
            }
        }
        System.out.println(lsum);
    }
}

/*https://www.hackerrank.com/challenges/java-negative-subarray/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = scan.nextInt();
        scan.close();
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum < 0) count++;
            }            
        }
        System.out.println(count);
    }
}

/*https://www.hackerrank.com/challenges/java-arraylist/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) list.add(scan.nextInt());
            lists.add(list);
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if (y <= list.size()) System.out.println(list.get(y-1));
            else System.out.println("ERROR!");
        }
    }
}

/*https://www.hackerrank.com/challenges/java-1d-array/*/
import java.util.*;

public class Solution {

    private static boolean traverse(int leap, int[] game, int i) {
        if (i >= game.length) return true;
        else if (i < 0 || game[i] == 1) return false;
        game[i] = 1;
        return traverse(leap, game, i+leap)
            || traverse(leap, game, i+1)
            || traverse(leap, game, i-1);
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if (game == null) return false;
        return traverse(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

/*https://www.hackerrank.com/challenges/java-list/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) list.add(scan.nextInt());
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String a = scan.next();
            if (a.equals("Insert")) list.add(scan.nextInt(), scan.nextInt());
            else list.remove(scan.nextInt());
        }
        scan.close();
        for (Integer num : list) System.out.print(num + " ");
    }
}

/*https://www.hackerrank.com/challenges/phone-book/*/
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
	
	public static void main(String []argh) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0;i<n;i++) {
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            map.put(name, phone);
		}
		while(in.hasNext()) {
			String s=in.nextLine();
            if (map.containsKey(s)) System.out.println(s + "=" + map.get(s));
            else System.out.println("Not found");
		}
	}
}

/*https://www.hackerrank.com/challenges/java-stack/*/
import java.util.*;

class Solution {
	
	public static void main(String []argh) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            ArrayDeque<Character> d = new ArrayDeque<Character>();
            boolean balanced = true;            
            if ((input.length() % 2) == 0) {
                for (int i = 0; i < input.length() && balanced; i++) {
                    Character c = input.charAt(i);
                    if (map.containsKey(c)) d.push(c);
                    else if (d.isEmpty() || c != map.get(d.pop())) balanced = false;
                }
            } else balanced = false;
            if (!balanced || !d.isEmpty()) System.out.println("false");
            else System.out.println("true");
		}
        sc.close();
	}
}

/*https://www.hackerrank.com/challenges/java-hashset/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
		s.close();
		//Write your code here
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }
}

/*https://www.hackerrank.com/challenges/java-generics/*/

import java.io.IOException;
import java.lang.reflect.Method;

class Printer {
	//Write your code here
    <T> void printArray(T[] array) {
        for (T element : array) System.out.println(element);
    }
}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}

/*https://www.hackerrank.com/challenges/java-comparator/*/
import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score < o2.score) return 1;
        else if (o1.score > o2.score) return -1;
        else return (o1.name.compareTo(o2.name));
    }
}

class Player {
	
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/*https://www.hackerrank.com/challenges/java-sort/*/
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (Math.abs(a.getCgpa() - b.getCgpa()) > 0.0001)
            return a.getCgpa() < b.getCgpa() ? 1 : -1;
        else if (a.getFname() != b.getFname())
            return a.getFname().compareTo(b.getFname());
        else
            return a.getId() < b.getId() ? 1 : -1;
    }
}

//Complete the code
public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			testCases--;
		}
        Collections.sort(studentList, new StudentComparator());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

/*https://www.hackerrank.com/challenges/java-dequeue/*/
import java.util.*;

public class test {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);
			if (deque.size() == m) {
				if (set.size() > max) max = set.size();
				int first = deque.remove();
				if (!deque.contains(first)) set.remove(first);
			}
		}
		System.out.println(max);       
	}
}

/*https://www.hackerrank.com/challenges/java-bitset/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        for (int i = 0; i < M; i++) {
            String op = scan.next();
            int a1 = scan.nextInt();
            int a2 = scan.nextInt();
            if (op.equals("AND")) {
                if (a1 == 1) B1.and(B2);
                else B2.and(B1);
            } else if (op.equals("OR")) {
                if (a1 == 1) B1.or(B2);
                else B2.or(B1);
            } else if (op.equals("XOR")) {
                if (a1 == 1) B1.xor(B2);
                else B2.xor(B1);
            } else if (op.equals("FLIP")) {
                if (a1 == 1) B1.flip(a2);
                else B2.flip(a2);
            } else if (op.equals("SET")) {
                if (a1 == 1) B1.set(a2);
                else B2.set(a2);
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scan.close(); 
    }
}

/*https://www.hackerrank.com/challenges/java-priority-queue/*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCGPA() {
        return cgpa;
    }
}

class PriorityQueueComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCGPA() < o2.getCGPA()) return 1;
        else if (o1.getCGPA() > o2.getCGPA()) return -1;
        else {
            int name = o1.getName().compareTo(o2.getName());
            if (name != 0) return name;
            else if (o1.getID() < o2.getID()) return -1;
            else return 1;
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> pq = new ArrayList<Student>();
        for (String event : events) {
            if (!event.equals("SERVED")) {
                String[] tokens = event.split(" ");
                pq.add(new Student(Integer.parseInt(tokens[3])
                                , tokens[1]
                                , Double.parseDouble(tokens[2])));
            } else if (!pq.isEmpty()) pq.remove(0);
            Collections.sort(pq, new PriorityQueueComparator());
        }
        return pq;
    }
}




