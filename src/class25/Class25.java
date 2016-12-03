package class25;
import java.awt.FlowLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Dictionary;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.Calendar;
import java.util.Collections;

public class Class25 {
	
	
	private static void RandomClass() {
		
        //Random class that is used to generates a pseudo-random number
        Random rand = new Random();
      
        //a and b will be pseudo-random prime numbers with bitSize 32
        BigInteger a = BigInteger.probablePrime(32, rand);
        BigInteger b = BigInteger.probablePrime(32, rand);
        System.out.println("Random Class method  probablePrime\n");
        System.out.println("probablePrime a: "+a);
        System.out.println("probablePrime b: "+b);  
        System.out.println("\n");
	}
	
	private static void BigIntegerClass() {
		
        //Random class that is used to generates a pseudo-random number
        Random rand = new Random();
      
        //a and b will be pseudo-random prime numbers with bitSize 32
        BigInteger a = BigInteger.probablePrime(32, rand);
        BigInteger b = BigInteger.probablePrime(32, rand);
        System.out.println("BigInteger Class method  multiply, subtract and add\n");
        
        //multiply, subtract and add functions of BigInteger class
        BigInteger ab = a.multiply(b);
        BigInteger asb = a.subtract(b);
        BigInteger apb = a.add(b);
        
        System.out.println("BigInteger a: "+a);
        System.out.println("BigInteger b: "+b);
        System.out.println("a*b: "+ab);
        System.out.println("a-b: "+asb);
        System.out.println("a+b: "+apb);
        System.out.println("\n");
	}
	
	private static void MathClass() {
        //Using ceil,floor and round functions of Math class
        double adouble  = 5.5;
        System.out.println("Math Class method  ceil,floor and round\n");
        System.out.println("Maths.ceil(5.5): "+Math.ceil(adouble));
        System.out.println("Maths.floor(5.5): "+Math.floor(adouble));
        System.out.println("Maths.round(5.5): "+Math.round(adouble));
        System.out.println("\n");
	}
	
	private static void FileWritePrintWriteClass() {
        //Writing the results to a file
		System.out.println("FileWrite, PrintWrite,Path Class example:\n");
		
        try{
            //Getting the current absolute path
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
         
            //Setting the filename to FileWrite, false means do not append
            FileWriter write = new FileWriter(s+"/Results.txt",false);
            PrintWriter print_line = new PrintWriter(write);
            print_line.printf("its the test file\n");
            print_line.printf("Hello world");
           
            
            print_line.close();

            JOptionPane.showMessageDialog(null, "Hi, your results are in Results.txt.", "Program Successfully Finished.", JOptionPane.PLAIN_MESSAGE); 
        }
        catch(IOException ex){
            
        }

		System.out.println("\n");
	}
	
	private static void DateClass() {
		System.out.println("Date Class example:\n");
        //Date class
        Date date = new Date();

        // display time and date using toString()
        System.out.println("Today Date:"+date.toString());

		System.out.println("\n");
	}
	
	private static void ArraysClass() {
		System.out.println("Arrays Class example:\n");
        int numbers[] = {-9,7,-15,2,1,9,-3,3,4,-4,10,6};
        System.out.println("Original Array: [-9,7,-15,2,1,9,-3,3,4,-4,10,6]");
        Arrays.sort(numbers);
        for(int i =0; i<numbers.length;i++){
            System.out.print(numbers[i]+",");
        }
        System.out.println();
        System.out.println("Index of 1 in Sorted Array: "+Arrays.binarySearch(numbers, 1));
		System.out.println("\n");
	}
	
   
    
	private static void CurrencyLocalClass() {
		System.out.println("Currency, Local Class example:\n");
		

 
		Currency curr = Currency.getInstance(Locale.CANADA);
		
		System.out.println("The currency of Canada is " + curr.getCurrencyCode());
 
		System.out.println("\n");
	}
	

	private static void CalendarClass() {
		System.out.println("Calendar Class example:\n");
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
 

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("\n");
	}
	
	private static void SimpleDateFormatClass() {
		System.out.println("Calendar Class example:\n");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
		System.out.println("#1. " + sdf.format(calendar.getTime()));

		System.out.println("\n");
	}

	private static void ListClass() {
		System.out.println("List Class example:\n");
		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("c");
		myList.add("c++");
		System.out.println("Initial list:"+myList);
		System.out.println("\n");
	}
	
	private static void CollectionsClass() {
		System.out.println("Collections Class example:\n");
		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("c");
		myList.add("c++");
		System.out.println("Initial list:"+myList);
		Collections.addAll(myList, "perl","php");
		System.out.println("After adding elements:"+myList);
		String[] strArr = {".Net", "unix"};
		Collections.addAll(myList, strArr);
		System.out.println("After adding array:"+myList);
		System.out.println("\n");
	}
		
	private static void DictionaryClass(){
		System.out.println("Dictionary Class example:\n");
		Dictionary<Integer, String> d = new Hashtable<Integer, String>(); 

		d.put(1,"Passion");
		d.put(2,"Motion");
		d.put(3,"Caution");
		System.out.println("\n");
	}
	
	private static void EnumerationClass(){
		System.out.println("Enumeration Class example:\n");
		Dictionary<Integer, String> d = new Hashtable<Integer, String>(); 
		d.put(1,"Passion");
		d.put(2,"Motion");
		d.put(3,"Caution");
		Enumeration<Integer> key = d.keys();
		while(key.hasMoreElements()){
			System.out.println(key.nextElement());
		}
		Enumeration<String> element = d.elements();
		while(element.hasMoreElements()){
			System.out.println(element.nextElement());
		}

		System.out.println("\n");
	}
	
	private static void ArrayDequeClass(){
		System.out.println("Collections Class example:\n");
		ArrayDeque<String> aq= new ArrayDeque<String>();
		aq.add("A");
		aq.add("B");
		aq.add("C");
		
		//offerFirst-adds elements at the front of the ArrayDeque 
		aq.offerFirst("D");
		
		//offerLast inserts the element at the last of ArrayDeque 
		aq.offerLast("E");
		
		Iterator<String> itr= aq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("\n");
	}
	
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}
	
	static void showpop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}
		   
	
	private static void StackClass(){
		System.out.println("Stack Class example:\n");
		Stack st = new Stack();
		System.out.println("stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		}catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	
	      
		System.out.println("\n");
	}
	
	private static void StringTokenizerClass(){
		System.out.println("StringTokenizer Class example:\n");
	 

 
		String str = "This is String , split by StringTokenizer, created at 20161201";
		StringTokenizer st = new StringTokenizer(str);
		
		System.out.println("---- Split by space ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		System.out.println("---- Split by comma ',' ------");
		StringTokenizer st2 = new StringTokenizer(str, ",");
		
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
	 
		System.out.println("\n");
	}
	
	private static void HashMapClass(){
		System.out.println("Dictionary Class example:\n");


	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);


		
		System.out.println("\n");
	}
	

    private static void JframeClass() {

        //Create and set up the window.
        JFrame frame = new JFrame("Hello World Jframe(Swing)");

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
        
    }

    private static void JPanelClass() {
        //Create and set up the window.
        JFrame frame = new JFrame("Hello World Jframe(Swing)");

        JPanel panel = new JPanel();    
        // adding panel to frame
        frame.add(panel);

        panel.setLayout(new FlowLayout());
        // Creating JLabel
        JLabel userLabel = new JLabel("User");

        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
    }

    
		
	 public static void main(String[] args) {
		RandomClass();//1) Random clas
		BigIntegerClass();//2) Biginterger 
		MathClass();// 3) Math class
		FileWritePrintWriteClass(); //4) File Writer class,5) PrintWriter class,6) Path class 
		DateClass();//7) Date class
		ArraysClass();//8) ArraysClass
		CurrencyLocalClass();//9) Currency Class, 10) Local Class
		CalendarClass();//11) Calendar
		SimpleDateFormatClass();//12) SimpleDateFormat Class
		ListClass();//13) List class
		CollectionsClass();// 14) Collections Class
		DictionaryClass();//15) Dictionary Class
		EnumerationClass();//16) Enumeration Class
		ArrayDequeClass();//17) ArrayDeque Class
		StackClass();//18) Stack
		StringTokenizerClass();//19) StringTokenizer Class
		JframeClass();//20) Jframe Class 21) JLabel Class
		JPanelClass();//22) Jpanel Class ,23) JTextField Class, 24) JButton Class 25) JPasswordField Class 
 	
    }
	   
}
