package day6ArrayTopics;

public class searchanelementinArraylinersearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		int search_element = 100;
		boolean status = false;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
		{
			System.out.println("elements found");
			status=true;
			break;
		}
}
		for (int x:a)
		{
			if (x==search_element)
			{
				System.out.println("elements found");
				status=true;
				break;
				
			}
		}
		
		if (status==false)
		{
			System.out.println("elements not found");
		}
	}
}



		    	 
			
