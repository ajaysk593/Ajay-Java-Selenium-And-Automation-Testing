//Inheritence: Aquiring all the properties(variable) 
//and Behaviours (method) from one class to another class is called"Inheritence"

//Objective:
//1)Reusability
//2)Avoid Duplicates
		
//Types of Inheritance
//Single---Single parents----child class
//Multi level----single parents hass no.of child classes
//Hierarchy---Single parents class-- has 3 child class
//Multiple----multiple parents class has-- single child class

package day12InheritanceAndTypes;

import java.awt.print.Book;


class A
{
int a=100;
void display()
{
System.out.println(a);
}
}

class B extends A
{
int b=200;
public int c;
void show()
{
System.out.println(b);
}
public void print() {
	// TODO Auto-generated method stub
	
}
}

class C extends B
{
int c=300;
public void print()
{
System.out.println(c);
}
}

public class InheritenceTypes {
public static void main(String[] args) {
	// TODO Auto-generated method stub
		
   B bobJ=new B();
   System.out.println(bobJ.a);
   System.out.println(bobJ.b);
   System.out.println(bobJ.c);
   bobJ.a=100;
   bobJ.b=200;
   bobJ.c=300;
   bobJ.display();
   bobJ.show();
   bobJ.display();
   bobJ.print();
	
   
   
   }
}


