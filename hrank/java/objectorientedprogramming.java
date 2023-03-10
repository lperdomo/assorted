/*https://www.hackerrank.com/challenges/java-inheritance-1/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal {
	
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	
	void fly() {
		System.out.println("I am flying");
	}
    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution{

   public static void main(String args[]) {
	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
   }
}

/*https://www.hackerrank.com/challenges/java-inheritance-2/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

/*https://www.hackerrank.com/challenges/java-abstract-class/*/
import java.util.*;

abstract class Book {
	
	String title;
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}

//Write MyBook class here
class MyBook extends Book {
	
    public void setTitle(String s) {
        title = s;
    }
}

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
	}
}

/*https://www.hackerrank.com/challenges/java-interface/*/
import java.util.*;

interface AdvancedArithmetic {
	
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic {
	
    public int divisor_sum(int n) {
        int sum = n;
        for (int f = 1; f <= n/2; f++)
            if (n % f == 0) sum += f;
        return sum;
    }
}

class Solution {
	
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

/*https://www.hackerrank.com/challenges/java-method-overriding/*/
import java.util.*;

class Sports {

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

}

public class Solution {
	
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}

/*https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/*/
import java.util.*;
import java.io.*;

class BiCycle {
	
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		String temp = super.define_me(); //Fix this line
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class Solution {
	
	public static void main(String []args){
		MotorCycle M = new MotorCycle();
	}
}

/*https://www.hackerrank.com/challenges/java-instanceof-keyword/*/
import java.util.*;

class Student{}
class Rockstar{}
class Hacker{}

public class InstanceOFTutorial {
	
   static String count(ArrayList mylist) {
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student) a++;
         if(element instanceof Rockstar) b++;
         if(element instanceof Hacker) c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String[] args) {
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i=0; i<t; i++) {
         String s = sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
	  sc.close();
      System.out.println(count(mylist));
   }
}

/*https://www.hackerrank.com/challenges/java-iterator/*/
import java.util.*;

public class Main {
	
	static Iterator func(ArrayList mylist) {
		Iterator it=mylist.iterator();
		while (it.hasNext()) {
		 Object element = it.next();
		 if(element instanceof String)//Hints: use instanceof operator
			break;
		}
		return it;
	}
	
	@SuppressWarnings({ "unchecked" })
	public static void main(String []args){
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0;i<n;i++) {
			mylist.add(sc.nextInt());
		}
		mylist.add("###");
		for (int i=0;i<m;i++) {
			mylist.add(sc.next());
		}
		sc.close();
		Iterator it=func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String)element);
		}
	}
}
