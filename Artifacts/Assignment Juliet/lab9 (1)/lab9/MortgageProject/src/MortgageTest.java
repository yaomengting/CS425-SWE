import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class MortgageTest {

	@Test
	public void test1() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();
		LocalDate birthday = LocalDate.of(1967, 5, 2);
		Customer customer = new Customer(birthday, 3000, 0, "Architect", MaritalStatus.SINGLE);
		double result = mortgageCalculator.computeMaxMortgage(customer);
	    assertEquals(180000, result, 0.001);
	}
	
	@Test
	public void test2() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();
		LocalDate birthday = LocalDate.of(2001, 5, 2);
		Customer customer = new Customer(birthday, 3000, 0, "Architect", MaritalStatus.SINGLE);
		double result = mortgageCalculator.computeMaxMortgage(customer);
	    assertEquals(0, result, 0.001);
	}
	
	@Test
	public void test3() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();
		LocalDate birthday = LocalDate.of(1997, 5, 2);
		Customer customer = new Customer(birthday, 5000, 3000, "Developer", MaritalStatus.MARRIED);
		double result = mortgageCalculator.computeMaxMortgage(customer);
	    assertEquals(220000, result, 0.001);
	}
	
	@Test
	public void test4() {
		MortgageCalculator mortgageCalculator = new MortgageCalculator();
		LocalDate birthday = LocalDate.of(1992, 5, 2);
		Customer customer = new Customer(birthday, 7000, 0, "Professor", MaritalStatus.SINGLE);
		double result = mortgageCalculator.computeMaxMortgage(customer);
	    assertEquals(280000, result, 0.001);
	}

}
