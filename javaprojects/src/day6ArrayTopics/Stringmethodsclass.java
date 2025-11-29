package day6ArrayTopics;

public class Stringmethodsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings="welcome"//
    String s=new String("welcome");
    System.out.println(s);
    //String length()-return length of a String(number of character)
    String s1="welcome";
    s.length();
    System.out.println(s.length());
    //concat()-jointing Strings//
    @SuppressWarnings("unused")
	String s11="welcome";
    String s2="to java";
    String s3="and Automation";
   System.out.println(s1.concat(s2).concat(s3));
   //trim()-remove spaces right and left//
      s="   welcome   ";
      System.out.println(s);
      System.out.println("before trimming:"+s.length());
      System.out.println(s.trim());
      System.out.println("After trimming:"+s.length());
   //charAt()-return a character from a string based on index//
      //index start from 0//
      s="welcome";
      System.out.println(s.charAt(3));
      System.out.println(s.charAt(6));
      System.out.println(s.charAt(2));
      System.out.println(s.charAt(4));
      System.out.println(s.charAt(1));
      System.out.println(s.charAt(5));
      //contains()-Return true or false//
      System.out.println(s.contains("well"));
      System.out.println(s.contains("come"));
      System.out.println(s.contains("well"));
      System.out.println(s.contains("come"));
     //Equals()-equalsIgnoreCase()-compare Strings//
      s1="welcome";
      s2="welcome";
      System.out.println(s1.equals(s2));
      System.out.println(s1.equalsIgnoreCase("welcome"));
      //Replace()-Single/multiple sequence of character//
      s="welcome to selenium java and selenium python c#";
      System.out.println(s.replace('e', 'z'));
      System.out.println(s.replace("selenium","playright"));
      //split()-split the string in to multiple parts based on delimiter//
        s="ajaysk593@gmail.com";
        String a[]=s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        //Touppercase() Tolowercase()//
        s="welcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        //substring()-extract substring from the main string//
        s="welcome";
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(0,3));
	}

}
