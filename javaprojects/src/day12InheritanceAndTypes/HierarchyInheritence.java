package day12InheritanceAndTypes;

class Parent
{
	void display(int a)
	{
	System.out.println(a);
	}
}

class child1 extends Parent
{
	void chow(int b)
	{
    System.out.println(b);
    }

	public void show(int i) {
		// TODO Auto-generated method stub
		
	}
}

class child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}

	public void show(int i) {
		// TODO Auto-generated method stub
		
	}
}

public class HierarchyInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 C1=new child1();
		C1.display(100);
		C1.show(200);
		
		child2 C2=new child2();
		C2.display(1000);
		C2.show(2000);
		
		
		
	}

}
