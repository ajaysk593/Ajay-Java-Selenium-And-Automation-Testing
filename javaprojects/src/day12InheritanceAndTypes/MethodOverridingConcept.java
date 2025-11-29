package day12InheritanceAndTypes;

class Bank
{
	double roi()
	{
		return 0;
	}
}
   
class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11.5;
		
	}


ICICI IC=new ICICI();




public static class MethodOverridingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICI IC=new ICICI();
		System.out.println(IC.roi());
		SBI SB=new SBI();
		System.out.println(SB.roi());
		
	}
  }
}

	


