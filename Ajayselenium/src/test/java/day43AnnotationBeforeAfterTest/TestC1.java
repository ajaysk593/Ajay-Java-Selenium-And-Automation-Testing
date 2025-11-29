package day43AnnotationBeforeAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestC1 {

	@Test
	void xyz()
	{
		System.out.println("This is xyz from c1..");
	}
    @AfterTest
	void At()
	{
		System.out.println("This is After Test Method ..");
	}
	
}



