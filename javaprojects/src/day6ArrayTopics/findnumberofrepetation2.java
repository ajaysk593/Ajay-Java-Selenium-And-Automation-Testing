package day6ArrayTopics;

public class findnumberofrepetation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {100,200,100,400,100,600,100,400,200,600};
       int num=100;
       int count = 0;        
       for (int value:a)
       {
       if(value==num)
       {
    	   count++; 
       }
       }
       System.out.println(count);
       }
       }
       
       
	


