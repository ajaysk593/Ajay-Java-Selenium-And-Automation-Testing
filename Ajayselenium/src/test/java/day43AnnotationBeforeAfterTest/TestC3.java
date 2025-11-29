package day43AnnotationBeforeAfterTest;

import org.testng.annotations.Test;

public class TestC3 {

        @Test
		void pqr()
		{
			System.out.println("This is pqr from c3..");
		}
		
	    @org.testng.annotations.BeforeSuite
		void BeforeSuite()
		{
			System.out.println("This is BeforeSuite Method ..");
		}
		
	    @org.testng.annotations.AfterSuite
		void AfterSuite()
		{
			System.out.println("This is AfterSuite Method ..");
		}
	}



