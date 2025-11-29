package day6ArrayTopics;

public class ReverseaString {



	private static final int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="welcome";
      String rev="";
      for (int i=s.length()-1;i>=0;i--);
      {
    	  rev=rev+s.charAt(i);
      }
       System.out.println("Reverse string is:"+rev);
       //By converting string to char.Array type//
       @SuppressWarnings("unused")
	String s1="welcome";
       @SuppressWarnings("unused")
	String rev1="";
       char a[]=s.toCharArray();
       for (int i=a.length-1;i>=0;i--);
       rev=rev+a[i];
    System.out.println("Reverse string is:"+rev);
    //using string Buffer class//
    @SuppressWarnings("unused")
	String s11=new String("welcome");
    System.out.println("Reverse string is"+rev);
 
	}
}