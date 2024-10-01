package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isNull;

public class ValueStepDefinitions {
	private Value v; 
	private int num;


	@Given("a Value")
		public void createValue()
		{
			v = new Value();
			
		}

	@When ("I get the Value")
	public void getValue() {
		num = v.getVal();
	}

	@When ("I call incVal")
	public void increaseValue() {
		v.incVal();
	}

	@Then ("the value is {int}")
	public void checkVal(int i)
	{
		assertEquals(i, num);
	}
	
	// TODO: Fill in!
}

