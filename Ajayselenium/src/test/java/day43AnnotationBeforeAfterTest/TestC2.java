package day43AnnotationBeforeAfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestC2 {
	@Test
	void abc()
	{
		System.out.println("This is abc from c2..");
	}
    @BeforeTest
	void Bt()
	{
		System.out.println("This is Before Test Method ..");
	}
	
}

