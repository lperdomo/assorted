/*https://www.hackerrank.com/challenges/simple-addition-varargs/*/
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
	
    void add(int n1, int n2, int... ns) {
        int sum = n1 + n2;
        System.out.print(n1 + "+" + n2);
        for (int n : ns) {
            sum += n;
            System.out.print("+" + n);
        }
        System.out.println("=" + sum);
    }
}

public class Solution {

    public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++) {
				if(set.contains(methods[i].getName())) {
					overload=true;
					break;
				}
				set.add(methods[i].getName());				
			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*https://www.hackerrank.com/challenges/java-reflection-attributes/*/
public class Solution {

	public static void main(String[] args) {
		Class student = Student.class;
		Method[] methods = student.getDeclaredMethods();
		ArrayList<String> methodList = new ArrayList<>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for(String name: methodList) {
			System.out.println(name);
		}
	}
}

/*https://www.hackerrank.com/challenges/can-you-access/*/
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            o = new Inner().new Private();
            System.out.println(num + " is " + ((Solution.Inner.Private) o).powerof2(num));
		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
	
	static class Inner {
		
		private class Private {
			
			private String powerof2(int num) {
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}
	
}

class DoNotTerminate { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {
		
		private static final long serialVersionUID = 1L;
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

/*https://www.hackerrank.com/challenges/prime-checker/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {
    void checkPrime(int... ns) {
        for (int n : ns) {          
            if (BigInteger.valueOf(n).isProbablePrime(1)) System.out.print(n + " ");
        }
        System.out.println();
    }
}

//InputStream in = System.in;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for (int i=0;i<methods.length;i++) {
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
			}
			if(overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

/*https://www.hackerrank.com/challenges/java-factory/*/
import java.util.*;
import java.security.*;

interface Food {
	
	public String getType();
}
	
class Pizza implements Food {
	
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {

	public String getType() {
		return "Someone ordered a Dessert!";
	}
}
	
class FoodFactory {
	
	public Food getFood(String order) {
        if (order.equals("pizza")) return new Pizza();
        else return new Cake();
	}
}
	
public class Solution {

	public static void main(String args[]) {
		Do_Not_Terminate.forbidExit();
		try {
			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();
			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	 }
}

class Do_Not_Terminate {
		 
	public static class ExitTrappedException extends SecurityException {
		
		private static final long serialVersionUID = 1L;
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

/*https://www.hackerrank.com/challenges/java-singleton/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    
    public String str;
    private Singleton() {}
    private static Singleton instance = null;
    public static Singleton getSingleInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}

/*https://www.hackerrank.com/challenges/java-annotations/*/
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
	String userRole() default "GUEST";
	int budgetLimit() default 0;
}

class FamilyMember {
	
	@FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
	public void seniorMember(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}

	@FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
	public void juniorUser(int budget, int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}
}

public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String role = in.next();
			int spend = in.nextInt();
			try {
				Class annotatedClass = FamilyMember.class;
				Method[] methods = annotatedClass.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method
								.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit = family.budgetLimit();
						if (userRole.equals(role)) {
							if(spend <= budgetLimit){
								method.invoke(FamilyMember.class.newInstance(),
										budgetLimit, spend);
							}else{
								System.out.println("Budget Limit Over");
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			testCases--;
		}
	}
}

/*https://www.hackerrank.com/challenges/java-covariance/*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
	
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
	
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }    
}

/*https://www.hackerrank.com/challenges/java-md5/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(scan.next().getBytes());
        scan.close();
        byte[] digest = md.digest();
        for (byte b : digest) System.out.format("%02x", b);
    }
}

/*https://www.hackerrank.com/challenges/sha-256/*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(scan.next().getBytes());
        scan.close();
        byte[] digest = md.digest();
        for (byte b : digest) System.out.format("%02x", b);
    }
}
