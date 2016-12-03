package aeip;

//a-abstractino
//e-encapsulation
//i-inheritance
//p-polymorphism
public class TestAEIP {
	 public static void main(String[] args) {
		 
		 	//Abstraction and Encapsulation
	        EnglishDetails obj = new EnglishDetails();
	        obj.setCreditHours(6);
	        System.out.println("Course Name: "+obj.courseName());
	        System.out.println("Course ID: "+obj.courseID());
	        System.out.println("Course Instructor: "+obj.courseInstructor());
	        System.out.println("Course Assistant: "+obj.assistantName());
	        System.out.println("Course Credit Hours: "+obj.getCreditHours());
	        
	        //Polymorphism
	        Multiplication obj1 = new Multiplication();
	        //two numbers
	        System.out.println("Multiplication:(2,3) "+obj1.multiply(2, 3));
	        //three numbers
	        System.out.println("Multiplication:(2,3,5) "+obj1.multiply(2, 3, 5));
	        //four numbers
	        System.out.println("Multiplication:(2,3,5,6) "+obj1.multiply(2, 3, 5, 6));
	        
	        //Inheritance and Overriding
	        Greetings obj2 = new Greetings();
	        System.out.println(obj2.hello());
	        System.out.println(obj2.birthdayWish()+" Imran!");
	        
	        PakistaniGreetings obj3 = new PakistaniGreetings();
	        System.out.println(obj3.hello());
	        System.out.println(obj3.birthdayWish()+" Imran!");
	        
	        
	    }
}
