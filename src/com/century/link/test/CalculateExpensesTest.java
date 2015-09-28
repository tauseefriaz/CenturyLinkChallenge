/**
 * 
 */
package com.century.link.test;

import org.junit.Test;

import com.century.link.model.Department;
import com.century.link.model.Employee;
import com.century.link.model.EmployeeType;
import com.century.link.reports.ReportsUtility;

/**
 * @author Tauseef Riaz
 *
 */
public class CalculateExpensesTest {
	@Test
	public void testExpenseCalculationByEmployee()
	{
		
		Employee empTest = new Employee("Tauseef", "1", EmployeeType.MANAGER, 200l);
		empTest.addEmployee(new Employee("Tauseef", "1", EmployeeType.DEVELOPER, 300l));
		empTest.addEmployee(new Employee("Tauseef", "1", EmployeeType.DEVELOPER, 500l));
		
		//Calculate expenses
		System.out.println("Expenses for "+empTest.getEmployeeName() +" = "+ReportsUtility.getExpensesForManager(empTest));
		
	}
	
	@Test
	public void testExpenseCalculationByDepartment()
	{
		Department department = new Department("MUM Finance", "Fairfield");
		
		Employee empTest = new Employee("Tauseef", "1", EmployeeType.MANAGER, 200l);
		department.addEmployee(empTest);
		department.addEmployee(new Employee("Jack", "1", EmployeeType.DEVELOPER, 300l));
		department.addEmployee(new Employee("Jill", "1", EmployeeType.DEVELOPER, 500l));
		
		//Calculate expenses
		System.out.println("Expenses for "+department.getDepartmentName() +" = "
				+ ""+ReportsUtility.getExpensesForDepartment(department));
		
	}
}
