package day7OopsConcept;

public class Employee {

	
    
	
	   int eid;
	   String ename;
	   String job;
	   int age;
	   int salary;
	   int Salary;
	    
	   
	  
	   void display()
	   {
		   System.out.println(getEid());
		   System.out.println(ename);
		   System.out.println(job);
		   System.out.println(age);
		   System.out.println(salary);
		 
	   }
	   public static void main(String[] args) 
	   {
		   Employee emp1=new Employee();
		   emp1.setEid(43);
		   emp1.ename="Ajay";
		   emp1.job="Tester";
		   emp1.age=24;
		   emp1.salary=30000;
		   emp1.display();
		   
		   Employee emp2=new Employee();
		   emp2.setEid(53);
		   emp2.ename="Kavya";
		   emp2.job="Tester";
		   emp2.age=22;
		   emp2.salary=40000;
		   emp2.display();
		   
		   Employee emp3=new Employee();
		   emp3.setEid(43);
		   emp3.ename="veni";
		   emp3.job="Tester";
		   emp3.age=24;
		   emp3.salary=20000;
		   emp3.display();
		   
		   
	   }
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
}
