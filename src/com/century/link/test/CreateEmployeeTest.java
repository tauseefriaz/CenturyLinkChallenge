/**
 * 
 */
package com.century.link.test;

import org.junit.Test;

import com.century.link.model.Employee;
import com.century.link.model.EmployeeType;

/**
 * @author Tauseef Riaz
 *
 */

public class CreateEmployeeTest {
	@Test
	public void test() {
		new Employee("Shennon", "1", EmployeeType.DEVELOPER, 1000l);
		new Employee("Tauseef", "1", EmployeeType.DEVELOPER, 300l);
		new Employee("Tauseef", "1", EmployeeType.DEVELOPER, 1100l);

	}

	@Test
	public void testAddingSubordinate() {
		Employee empTest = new Employee("Shennon", "1", EmployeeType.DEVELOPER, 300l);
		// Add a new sub-ordinate
		Employee empTest2 = new Employee("Michale", "1", EmployeeType.TESTER, 300l);
		empTest.addEmployee(empTest2);

	}

	@Test
	public void testNonManagerEmployee() {
		Employee empTest2 = new Employee("Michale", "1", EmployeeType.TESTER, 300l);
		// Check adding an employee in a non managerial employee
		empTest2.addEmployee(new Employee("Jack", "1", EmployeeType.DEVELOPER, 300l));

	}

	@Test
	public void testManagerEmployee() {
		Employee empTest3 = new Employee("Ivan", "1", EmployeeType.MANAGER, 300l);
		// Check adding an existing employee addition to the list
		empTest3.addEmployee(new Employee("Michale", "1", EmployeeType.TESTER, 300l));
	}
}
