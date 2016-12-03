package string30;

import java.io.UnsupportedEncodingException;

public class Strings30 {
	    
  public static void main(String[] args) {
        //Using 30 different methods of the String Class
        
        //Example 1 : length()
	  	System.out.println("Example 1 : length()\n");
        String info = "Using 30 different methods of the String Class";
        System.out.println("Length of info string: "+info.length());
        
        //Example 2 : concat(String s)
        System.out.println("\nExample 2 : concat(String s)\n");
        String partA = "Using 30 different methods ";
        String partB = "of the String Class";
        //Will add partB to end of partA
        String partApartB = partA.concat(partB);
        System.out.println(partApartB);
        
        //Example 3 : compareTo(String s) Case will not be ignored
        System.out.println("\nExample 3 : compareTo(String s) Case will not be ignored\n");
        String one = "ABC";
        String two = "abc";
        int compareResult = one.compareTo(two);
        if(compareResult == 0){
            System.out.println("String one is equal to Sring two.");
        }
        else if(compareResult < 0){
            System.out.println("String one lexicographically precedes String two.");
        }
        else{
            System.out.println("String one lexicographically follows String two.");
        }
        
        //Example 4: compareToIgnoreCase(String s) Case will be ignored
        System.out.println("\nExample 4: compareToIgnoreCase(String s) Case will be ignored\n");
        one = "ABC";
        two = "abc";
        compareResult = one.compareTo(two);
        if(compareResult == 0){
            System.out.println("String one is equal to Sring two.");
        }
        else if(compareResult < 0){
            System.out.println("String one lexicographically precedes String two.");
        }
        else{
            System.out.println("String one lexicographically follows String two.");
        }
        
        //Example 5 : charAt(int index)
        System.out.println("\nExample 5 : charAt(int index)\n");
        String charS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(charS.charAt(0));
        
        //Example 6 : startsWith(String prefix)
        System.out.println("\nExample 6 : startsWith(String prefix)\n");
        String cash = "$400";
        if(cash.startsWith("$")){
            System.out.println("You have dollars");
        }
        //Example 7 : startsWith(String prefix, index fromIndex)
        System.out.println("\nExample 7 : startsWith(String prefix, index fromIndex)\n");
        String strstartsWith7= new String("quick brown fox jumps over the lazy dog");
        System.out.println("substring of str(starting from 6th index) has brown prefix: "
        		+strstartsWith7.startsWith("brown", 6));    
        
        /*Example 8 :The method regionMatches() tests if the two Strings are equal. 
        Using this method we can compare the substring of input String with the substring of specified String.
        */

        System.out.println("\nExample 8 : boolean regionMatches(int toffset, String other, int ooffset, int len):\n");
        String str1 = new String("Hello, How are you");
        String str2 = new String("How");
        String str3 = new String("HOW");

        System.out.print("Result of Test1: " );
        System.out.println(str1.regionMatches(7, str2, 0, 3));

        System.out.print("Result of Test2: " );
        System.out.println(str1.regionMatches(7, str3, 0, 3));

        System.out.println("\nExample 9 : regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len):\n");
        System.out.print("Result of Test3: " );
        System.out.println(str1.regionMatches(true, 7, str3, 0, 3));

        //Example 9 :bool contains(String str)
        System.out.println("\nExample 9 : contains(String str)\n");
        String strEx9 = "What is this ?";
        System.out.println(strEx9.contains("this"));

        
        //Example 10 : endsWith(String suffix)
        System.out.println("\nExample 10 : endsWith(String suffix)\n");
        String text = "What is this ?";
        if(text.endsWith("?")){
            System.out.println("You have asked a question.");
        }        
        
        //Example 11 : indexOf(String ch)
        System.out.println("\nExample 11 : indexOf(String ch)\n");
        System.out.println("Index of A in charS string : "+charS.indexOf("A"));
        
        //Example 12 : lastIndexOf(String ch)
        System.out.println("\nExample 12 : lastIndexOf(String ch)\n");
        System.out.println("Last Index of s in info : "+info.lastIndexOf("s"));
        
        //Example 13 : substring(int begin)
        System.out.println("\nExample 13 : substring(int begin)\n");
        System.out.println("Substring of info (0,10) : "+info.substring(5));
        
        //Example 14 : substring(int begin, int end)
        System.out.println("\nExample 14 : substring(int begin, int end)\n");
        System.out.println("Substring of info (0,10) : "+info.substring(0,10));

        //Example 15 : isEmpty()
        System.out.println("\nExample 15 : isEmpty()\n");
        String empty = "";
        if(empty.isEmpty()){
            System.out.println("Length of empty is zero");
        }
        
        //Example 16 : matches(String regex)
        System.out.println("\nExample 16 : matches(String regex)\n");
        String number = "3223";
        if(number.matches("\\d+"))
        {
            System.out.println("number is a String containing only numbers");
        }
        
        
        //Example 17 : toUpperCase()
        System.out.println("\nExample 17 : toUpperCase()\n");
        System.out.println("UpperCase info : "+info.toUpperCase());
        
        //Example 18 : toLowerCase()
        System.out.println("\nExample 18 : toLowerCase()\n");
        System.out.println("LowerCase info : "+info.toLowerCase());
        
        //Example 19 : replaceAll()
        System.out.println("\nExample 19 : replaceAll()\n");
        System.out.println("Replace all occurences of o with z in info: "+info.replaceAll("o", "z"));
        
        //Example 20 : getBytes() 
        System.out.println("\nExample 20 : getBytes()\n");
        //will get Bytes of number string in default charset encoding
        byte[] bytes = number.getBytes();
        for(byte a:bytes){
            System.out.println(a);
        }

        //Example 21 : getBytes(String charsetName) 
        System.out.println("\nExample 21 : getBytes(String charsetName):\n");
        //will get Bytes of number string in default charset encoding
        String str=new String("Hello");

        try{
            byte [] array2 = str.getBytes("UTF-16");
            for(byte b1: array2){
               System.out.print(b1);
            }
            byte [] array3 = str.getBytes("UTF-16BE");
            System.out.print("\nUTF-16BE Charset encoding:");
            for(byte b2: array3){
               System.out.print(b2);
            }
       }catch(UnsupportedEncodingException ex){
            System.out.println("Unsupported character set"+ex);
       }
        
        //Example 22 : toString() return string
        System.out.println("\nExample 22 : toString()\n");
        System.out.println(number.toString());
        
        //Example 23 : replaceFirst()
        System.out.println("\nExample 23 : replaceFirst()\n");
        System.out.println("Number Number Number".replaceFirst("Number","ReplacedFirstOccurenceOfNumber"));
        
        //Example 24 : split() 
        System.out.println("\nExample 24 : split()\n");
        String fruits = "apple,strawberry,mango,pineapple";
        System.out.println("Separate by , and return all possible strings");
        String[] splitfruits = fruits.split(",");
        for(String a:splitfruits){
            System.out.println(a);
        }
        //Example 25 : split(String regex, int limit):) 
        System.out.println("\nExample 25 : split(String regex, int limit):)\n");
        System.out.println("Separate by , and return 2 strings");
        splitfruits = fruits.split(",",2);
        for(String a:splitfruits){
            System.out.println(a);
        }
        
        //Example 26 : equals()
        System.out.println("\nExample 26 : equals()\n");
        if(one.equals(two)){
            System.out.println("ABC equals abc");
        }else{
            System.out.println("ABC does not equal abc");
        }
        
        //Example 27 : equalsIgnoreCase()
        System.out.println("\nExample 27 : equalsIgnoreCase()\n");
        if(one.equalsIgnoreCase(two)){
            System.out.println("ABC equals abc");
        }else{
            System.out.println("ABC does not equal abc");
        }
        
        //Example 28 : trim() removes leading and trailing whitespaces
        System.out.println("\nExample 28 : trim()\n");
        String ltspaces = "   This is a test string for Trim()  ";
        System.out.println(ltspaces);
        System.out.println(ltspaces.trim());
        
        //Example 29 : toCharArray() converts input string into array of chars
        System.out.println("\nExample 29 : toCharArray()\n");
        char[] alphabets = charS.toCharArray();
        for(char a : alphabets){
            System.out.println(a);
        }
        
        //Example 30 : copyValueOf()  
        System.out.println("\nExample 30 : copyValueOf()\n");
        String copyOfalphabets = String.copyValueOf(alphabets);
        System.out.println("copyOfalphabets contains all chars in alphabets");
        System.out.println(copyOfalphabets);
        copyOfalphabets = String.copyValueOf(alphabets,2,2);
        System.out.println("copyOfalphabets contains 2 chars from alphabets starting from 3rd index in alphabets");
        System.out.println(copyOfalphabets);
        
        //Example 31 : hashCode() computed from s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        System.out.println("\nExample 31 : hashCode()\n");
        System.out.println("Generate a HashCode from a String");
        String input = "this is a message";
        System.out.println("Hash Code for: 'this is a message': " +input.hashCode());
        
        
  	}
}
